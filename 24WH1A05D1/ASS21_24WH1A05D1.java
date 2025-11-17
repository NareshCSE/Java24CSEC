package Ass;

import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {

    TextField tf = new TextField();
    double num1 = 0, num2 = 0, result = 0;
    char op = ' ';

    public SimpleCalculator() {

        setTitle("24WH1A05D1");
        setSize(300, 380);
        setLayout(new BorderLayout());

        tf.setEditable(false);
        add(tf, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(5, 4, 5, 5));

        String[] btns = {
                "7","8","9","/",
                "4","5","6","*",
                "1","2","3","-",
                "0",".","%","+",
                "C","=","(",""
        };

        for (String s : btns) {
            Button b = new Button(s);
            b.addActionListener(this);

            if (s.equals("")) 
                b.setEnabled(false);

            p.add(b);
        }

        add(p, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();
        if (s.length() == 0) return;

        char c = s.charAt(0);

        // If digit or decimal point
        if ((c >= '0' && c <= '9') || c == '.') {
            tf.setText(tf.getText() + s);
            return;
        }

        // Clear
        if (s.equals("C")) {
            tf.setText("");
            num1 = num2 = result = 0;
            op = ' ';
            return;
        }

        // Ignore parentheses buttons
        if (s.equals("(") || s.equals(")")) return;

        // Equals button
        if (s.equals("=")) {
            try {
                num2 = tf.getText().isEmpty() ? 0 : Double.parseDouble(tf.getText());

                switch (op) {
                    case '+': result = num1 + num2; break;
                    case '-': result = num1 - num2; break;
                    case '*': result = num1 * num2; break;
                    case '/':
                        if (num2 == 0) throw new ArithmeticException();
                        result = num1 / num2; break;
                    case '%':
                        if (num2 == 0) throw new ArithmeticException();
                        result = num1 % num2; break;
                    default:
                        result = num2;
                }

                tf.setText(String.valueOf(result));
                op = ' ';
            } 
            catch (Exception ex) {
                tf.setText("Error");
            }
            return;
        }

        // Operator (+, -, *, /, %)
        op = c;
        try {
            num1 = Double.parseDouble(tf.getText());
        } catch (Exception ex) {
            num1 = 0;
        }
        tf.setText("");
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
