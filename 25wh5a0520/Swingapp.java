package practice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Swingapp {

	public static void main(String[] args) {
		
		Frame frame =new Frame("Factorial");
		frame.setSize(400,500);
		frame.setVisible(true);
		
		Button button =new Button("compute");
		button.setBounds(200, 450, 50, 15);
		frame.add(button);
		
		frame.setLayout(null);
		
		Label label=new Label("Enter number:");
		label.setBounds(50,50, 80, 15);
		frame.add(label);
		
		Label label2=new Label("Result:");
		label2.setBounds(60,70, 80, 15);
		frame.add(label2);
		
		TextField textfield=new TextField();
		textfield.setBounds( 160, 50, 150, 15);
		frame.add(textfield);
		
		TextField textfield2=new TextField();
		textfield2.setBounds( 160, 70, 150, 15);
		frame.add(textfield2);
		
		button.addActionListener(new ActionListener() {
			 @Override
			public void actionPerformed(ActionEvent e) {
				 try {
				int n=Integer.parseInt(textfield.getText());
				int fact=1;
				for(int i=1;i<=n;i++)
				{
					fact=fact*i;
				}
				textfield2.setText(String.valueOf(fact));
				 }
				 catch(Exception e1) {
					 System.out.println(e1);
				 }
				
			}
			
		});
		
		

	}

}
