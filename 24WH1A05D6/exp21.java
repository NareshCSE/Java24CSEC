package awtjava;
import java.awt.*;
import java.awt.event.*;
public class  exp21 implements ActionListener{
	Frame f;
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b;
	exp21(){
		f=new Frame("Division");
		l1=new Label("num1");
		l2=new Label("num2");
		l3=new Label("result");
		tf1=new TextField(5);
		tf2=new TextField(5);
		tf3=new TextField(10);
		b=new Button("divide");
		b.addActionListener(this);
		Panel p1=new Panel(new FlowLayout());
		p1.add(l1);
		p1.add(tf1);
		Panel p2=new Panel(new FlowLayout());
		p2.add(l2);
		p2.add(tf2);
		Panel p3=new Panel(new FlowLayout());
		p3.add(b);
		Panel p4=new Panel(new FlowLayout());
		p4.add(l3);
		p4.add(tf3);
		f.setLayout(new GridLayout(4,1));
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.setSize(500,500);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
}
	public void actionPerformed(ActionEvent e) {
		try {
			int num1,num2;
			num1=Integer.parseInt(tf1.getText());
			num2=Integer.parseInt(tf2.getText());
			if(num2==0) {
				Dialog d=new Dialog(f,"error",true);
				d.add(new Label("Division by 0 not possible"));
				Button ok=new Button("OK");
				Panel p=new Panel(new FlowLayout());
				p.add(ok);
				
				d.setLayout(new GridLayout(2,1));
				d.add(p);
				ok.addActionListener(x -> d.setVisible(false));
				
				d.setSize(300,300);
				d.setVisible(true);
				return;
			}
			int result=num1/num2;
		tf3.setText(String.valueOf(result));
	}catch(Exception ex) {
		tf2.setText("Invalid Numbers");
	}
}
	public static void main(String[] args) {
		new exp21();
	}
}