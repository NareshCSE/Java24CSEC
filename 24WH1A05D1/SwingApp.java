package firstjavalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApp extends JFrame {

    private JTextField inputField;
    private JTextField resultField;
    private JButton computeButton;

    public SwingApp() {
        setTitle("Factorial Calculator 24WH1A05D1");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Input field
        add(new JLabel("Enter Integer:"));
        inputField = new JTextField(10);
        add(inputField);

        // Compute button
        computeButton = new JButton("Compute");
        add(computeButton);

        // Output field (non-editable)
        add(new JLabel("Factorial:"));
        resultField = new JTextField(15);
        resultField.setEditable(false);
        add(resultField);

        // Button action
        computeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                computeFactorial();
            }
        });

        setVisible(true);
    }

    private void computeFactorial() {
        try {
            int n = Integer.parseInt(inputField.getText());

            if (n < 0) {
                resultField.setText("Invalid (negative)");
                return;
            }

            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            resultField.setText(String.valueOf(factorial));
        } 
        catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new SwingApp();
    }
}
