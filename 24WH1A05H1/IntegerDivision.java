package java_assignment;
import javax.swing.*;
import java.awt.event.*;
public class IntegerDivision extends JFrame implements ActionListener{
	JTextField num1Field,num2Field,resultField;
	JButton divideButton;
	
	public IntegerDivision() {
		setTitle("Division Calculator");
		setSize(400,300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label1=new JLabel("Num1:");
		label1.setBounds(30,30,100,30);
		add(label1);
		num1Field=new JTextField();
		num1Field.setBounds(150,30,180,30);
		add(num1Field);
		JLabel label2=new JLabel("Num2:");
		label2.setBounds(30,70,100,30);
		add(label2);
		num2Field=new JTextField();
		num2Field.setBounds(150,70,180,30);
		add(num2Field);
		JLabel resultLabel=new JLabel("Result:");
		resultLabel.setBounds(30,110,100,30);
		add(resultLabel);
		resultField=new JTextField();
		resultField.setBounds(150,110,180,30);
		add(resultField);
		divideButton=new JButton("Divide");
		divideButton.setBounds(140,160,100,30);
		divideButton.addActionListener(this);
		add(divideButton);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new IntegerDivision();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			int num1=Integer.parseInt(num1Field.getText());
			int num2=Integer.parseInt(num2Field.getText());
			if(num2==0) {
				throw new ArithmeticException("Division with 0 is not defined");
			}
			int res=num1/num2;
			resultField.setText(String.valueOf(res));
		}catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Enter valid integers","Number Format Error",JOptionPane.ERROR_MESSAGE);
        }catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Arithmetic Error",JOptionPane.ERROR_MESSAGE);
        }
	}
}
