package labexperiments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {
    JTextField display;
    String current = ""; 
    double firstNum = 0;
    String operator = "";

    public CalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "%", "=", "C"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("\\d")) {
            current += cmd;
            display.setText(current);
        } else if (cmd.matches("[+\\-*/%]")) {
            if (!current.isEmpty()) {
                firstNum = Double.parseDouble(current);
                operator = cmd;
                current = "";
                display.setText("");
            }
        } else if (cmd.equals("=")) {
            try {
                double secondNum = Double.parseDouble(current);
                double result = 0;

                switch (operator) {
                    case "+": result = firstNum + secondNum; break;
                    case "-": result = firstNum - secondNum; break;
                    case "*": result = firstNum * secondNum; break;
                    case "/": result = firstNum / secondNum; break;
                    case "%": result = firstNum % secondNum; break;
                }

                String expression = firstNum + " " + operator + " " + secondNum + " = " + result;
                display.setText(expression);
                current = String.valueOf(result);

            } catch (ArithmeticException ex) {
                display.setText("Error: Divide by zero");
            } catch (Exception ex) {
                display.setText("Error");
            }
        } else if (cmd.equals("C")) {
            current = "";
            operator = "";
            firstNum = 0;
            display.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
