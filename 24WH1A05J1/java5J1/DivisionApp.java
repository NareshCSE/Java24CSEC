package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionApp extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public DivisionApp() {
      
        setTitle("Integer Division Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Num1:"));
        num1Field = new JTextField();
        add(num1Field);

        // Num2
        add(new JLabel("Num2:"));
        num2Field = new JTextField();
        add(num2Field);

        // Result
        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        // Button
        add(new JLabel()); // filler
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            if (num2 == 0) {
                throw new ArithmeticException("Division by zero");
            }

            int result = num1 / num2;
            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Error: Please enter valid integers!",
                    "Number Format Exception",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                    "Error: " + ex.getMessage(),
                    "Arithmetic Exception",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new DivisionApp();
    }
}
