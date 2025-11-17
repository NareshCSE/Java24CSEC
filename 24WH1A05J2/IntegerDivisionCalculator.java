package vaishnavi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionCalculator extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;
    
    public IntegerDivisionCalculator() {
        setTitle("Integer Division-24WH1A05J2");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 5, 5));
        
        add(new JLabel("Num1:"));
        num1Field = new JTextField();
        add(num1Field);
        
        add(new JLabel("Num2:"));
        num2Field = new JTextField();
        add(num2Field);
        
        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);
        
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(new JLabel());
        add(divideButton);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 / num2;
            resultField.setText(String.valueOf(result));
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Number Format Exception: Please enter valid integers!", 
                "Input Error", 
                JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, 
                "Arithmetic Exception: Cannot divide by zero!", 
                "Math Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        new IntegerDivisionCalculator();
    }
}