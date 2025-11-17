package java_assignment;
import javax.swing.*;
import java.awt.event.*;

public class FactorialCalculator extends JFrame implements ActionListener{
	JTextField inputField,outputField;
    JButton computeButton;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(400,200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel inputLabel = new JLabel("Enter an integer:");
        inputLabel.setBounds(30, 30, 120, 25);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(160, 30, 180, 25);
        add(inputField);

        JLabel outputLabel = new JLabel("Factorial:");
        outputLabel.setBounds(30, 70, 120, 25);
        add(outputLabel);

        outputField = new JTextField();
        outputField.setBounds(160, 70, 180, 25);
        outputField.setEditable(false);
        add(outputField);

        computeButton = new JButton("Compute");
        computeButton.setBounds(140, 110, 100, 30);
        computeButton.addActionListener(this);
        add(computeButton);

        setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FactorialCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
            int number = Integer.parseInt(inputField.getText());
            if (number < 0) {
                outputField.setText("Invalid input");
            } else {
                outputField.setText(String.valueOf(factorial(number)));
            }
        } catch (NumberFormatException ex) {
            outputField.setText("Enter a valid integer");
        }
	}
	private long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
