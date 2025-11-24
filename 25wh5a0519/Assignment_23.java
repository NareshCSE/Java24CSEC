package sample;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment_23 extends JFrame implements ActionListener {
    
    JTextField num1Field, num2Field, resultField;
    JButton divideButton;

    Assignment_23() {
        setTitle("Integer Division-25WH5A0521"+ " ");
        setSize(350, 200);
        setLayout(new GridLayout(4, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new JLabel("Num 1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Num 2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            int result = num1 / num2;  
            resultField.setText(String.valueOf(result));
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter only integers!",
                    "Number Format Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                    "Division by Zero is NOT allowed!",
                    "Arithmetic Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Assignment_23().setVisible(true);
    }
}