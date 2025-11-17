package java_class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;

public class FactorialCalculator extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextField resultField;
    private JButton computeButton;

    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Input label and field
        add(new JLabel("Enter an integer:"));
        inputField = new JTextField();
        add(inputField);

        // Result label and field
        add(new JLabel("Factorial result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Empty cell and compute button
        add(new JLabel(""));
        computeButton = new JButton("Compute");
        computeButton.addActionListener(this);
        add(computeButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(inputField.getText());
            if (number < 0) {
                resultField.setText("Error: Negative number");
            } else {
                resultField.setText(String.valueOf(computeFactorial(number)));
            }
        } catch (NumberFormatException ex) {
            resultField.setText("Error: Invalid input");
        }
    }

    private BigInteger computeFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FactorialCalculator::new);
    }
}