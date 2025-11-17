package vaishnavi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleFactorialCalculator extends JFrame implements ActionListener {
    private JTextField inputField, outputField;
    private JButton computeButton;
    
    public SimpleFactorialCalculator() {
        setTitle("Factorial-24WH1A05J2");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2, 10, 10));
        
        add(new JLabel("Enter number:"));
        inputField = new JTextField();
        add(inputField);
        
        add(new JLabel("Factorial:"));
        outputField = new JTextField();
        outputField.setEditable(false);
        add(outputField);
        
        computeButton = new JButton("Compute");
        computeButton.addActionListener(this);
        add(computeButton);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            if (num < 0) {
                outputField.setText("Invalid input");
            } else {
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                outputField.setText(String.valueOf(fact));
            }
        } catch (Exception ex) {
            outputField.setText("Invalid input");
        }
    }
    
    public static void main(String[] args) {
        new SimpleFactorialCalculator();
    }
}
