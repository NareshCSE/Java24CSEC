package labexperiments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionGUI {

    private JTextField num1Field, num2Field, resultField;
    private JButton divideButton;

    public DivisionGUI() {

        JFrame frame = new JFrame("Integer Division");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2));

        frame.add(new JLabel("Num1:"));
        num1Field = new JTextField();
        frame.add(num1Field);

        frame.add(new JLabel("Num2:"));
        num2Field = new JTextField();
        frame.add(num2Field);

        frame.add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        frame.add(resultField);

      
        divideButton = new JButton("Divide");
        frame.add(divideButton);

        frame.add(new JLabel());

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Math Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DivisionGUI();
    }
}
