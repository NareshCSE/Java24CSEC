package practice;
import javax.swing.*;
import java.awt.event.*;
public class Swingapp {

	public static void main(String[] args) {
		
		JFrame frame =new JFrame("Factorial");
		frame.setSize(400,500);
		frame.setVisible(true);
		
		JButton button =new JButton("compute");
		button.setBounds(200, 450, 100, 15);
		frame.add(button);
		
		frame.setLayout(null);
		
		JLabel label=new JLabel("Enter number:");
		label.setBounds(50,50, 130, 15);
		frame.add(label);
		
		JLabel label2=new JLabel("Result:");
		label2.setBounds(60,70, 200, 15);
		frame.add(label2);
		
		JTextField textfield=new JTextField();
		textfield.setBounds( 160, 50, 200, 15);
		frame.add(textfield);
		
		JTextField textfield2=new JTextField();
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
