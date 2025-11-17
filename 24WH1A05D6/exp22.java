package exp22;
import java.awt.*;
import java.awt.event.*;

public class awtjava implements ActionListener{

	Frame f;
	Label l1;
	Label l2;
	Button b;
	TextField tf1,tf2;
	awtjava(){
		f=new Frame("Factorial");
		l1=new Label("enter integer");
		l2=new Label("result");
		tf1=new TextField(5);
		tf2=new TextField(20);
		b=new Button("compute");
		b.addActionListener(this);
		Panel p1=new Panel(new FlowLayout());
		p1.add(l1);
		p1.add(tf1);
		Panel p2=new Panel(new FlowLayout());
		p2.add(b);
		Panel p3=new Panel(new FlowLayout());
		p3.add(l2);
		p3.add(tf2);
		f.setLayout(new GridLayout(3,1));
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

		public void windowClosing(WindowEvent e) {
				System.exit(0);
		}

	});

}

public void actionPerformed(ActionEvent e) {
		try {
			int n=Integer.parseInt(tf1.getText());
			int fact=1; 
			for(int i=1;i<=n;i++) {
				fact *=i;
			}
			tf2.setText(String.valueOf(fact));
	
		}catch(Exception ex) {
			tf2.setText("invalid number");

		}

	}

	public static void main(String[] args) {
		new awtjava();

	}

}


