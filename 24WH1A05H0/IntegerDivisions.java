package java_class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivisions extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;
    public IntegerDivisions() {
        setTitle("Integer Division");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));
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
        add(new JLabel(""));
        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText().trim());
            int num2 = Integer.parseInt(num2Field.getText().trim());
            if (num2 == 0) {
                throw new ArithmeticException("Division by zero");
            }
            int result = num1 / num2;
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers.", "Number Format Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "Cannot divide by zero.", "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(IntegerDivisions::new);
    }
}