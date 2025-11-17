package java_assignment;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener{
	TextField display;
	double num1=0,num2=0;
	String operator="";
	
	public SimpleCalculator() {
		setTitle("Calculator");
		setSize(400,400);
		setLayout(new BorderLayout());
		
		display=new TextField();
		display.setEditable(false);
		add(display,BorderLayout.NORTH);
		
		Panel panel=new Panel();
		panel.setLayout(new GridLayout(5,4,5,5));
		String buttons[]= {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","%","="};
		for(String b:buttons) {
			Button btn=new Button(b);
			btn.addActionListener(this);
			panel.add(btn);
		}
		add(panel,BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd=e.getActionCommand();
		if(cmd.matches("[0-9]")) {
			display.setText(display.getText()+cmd);
		}
		else if(cmd.equals("C")) {
			display.setText("");
			num1=num2=0;
			operator="";
		}
		else if(cmd.equals("=")) {
			num2=Double.parseDouble(display.getText());
			double res=0;
			if(operator.equals("+"))
				res=num1+num2;
			else if(operator.equals("-"))
				res=num1-num2;
			else if(operator.equals("*"))
				res=num1*num2;
			else if(operator.equals("%"))
				res=num1%num2;
			display.setText(String.valueOf(res));
		}
		else {
			num1=Double.parseDouble(display.getText());
			operator=cmd;
			display.setText("");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleCalculator();
	}

}
