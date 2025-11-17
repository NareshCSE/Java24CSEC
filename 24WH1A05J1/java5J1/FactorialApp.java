package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialApp extends JFrame implements ActionListener {
    private JTextField inputField;     // to enter integer
    private JTextField outputField;    // to show factorial result
    private JButton computeButton;

    public FactorialApp() {
        setTitle("Factorial Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Enter an integer:"));
        inputField = new JTextField();
        add(inputField);

        add(new JLabel("Factorial value:"));
        outputField = new JTextField();
        outputField.setEditable(false);
        add(outputField);

        add(new JLabel()); // filler
        computeButton = new JButton("Compute");
        computeButton.addActionListener(this);
        add(computeButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int n = Integer.parseInt(inputField.getText());
            if (n < 0) {
                outputField.setText("Error: negative number");
                return;
            }
            long fact = factorial(n);
            outputField.setText(String.valueOf(fact));
        } catch (NumberFormatException ex) {
            outputField.setText("Error: invalid input");
        }
    }

    private long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        new FactorialApp();
    }
}
