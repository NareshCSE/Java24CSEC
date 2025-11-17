package sathvika_25wh5a0518;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FactorialCalculator extends JFrame implements ActionListener {
    private JTextField inputField, resultField;
    private JButton computeButton;
    public FactorialCalculator() {
        setTitle("Factorial Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));
        JLabel inputLabel = new JLabel("Enter an integer:");
        inputField = new JTextField();
        JLabel resultLabel = new JLabel("Factorial:");
        resultField = new JTextField();
        resultField.setEditable(false); // user cannot type here
        computeButton = new JButton("Compute");
        computeButton.addActionListener(this);
        add(inputLabel);
        add(inputField);
        add(resultLabel);
        add(resultField);
        add(new JLabel()); 
        add(computeButton);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(inputField.getText());

            if (n < 0) {
                resultField.setText("Error: Negative number");
                return;
            }
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            resultField.setText(String.valueOf(factorial));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input! Enter an integer.");
        }
        }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FactorialCalculator().setVisible(true);
        });
    }
}
