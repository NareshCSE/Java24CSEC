package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {
    private JTextField display;       // main display
    private JLabel historyDisplay;    // history bar
    private double num1 = 0, num2 = 0, result = 0;
    private char operator = ' ';
    private boolean startNewNumber = true;

    public CalculatorGUI() {
        setTitle("PC Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // History bar (like Windows calculator)
        historyDisplay = new JLabel(" ", SwingConstants.RIGHT);
        historyDisplay.setFont(new Font("Arial", Font.PLAIN, 16));
        historyDisplay.setForeground(Color.DARK_GRAY);
        add(historyDisplay, BorderLayout.NORTH);

        // Main display
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 32));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.CENTER);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "%", "+",
            "C", "=", "", ""
        };

        for (String label : buttons) {
            if (label.isEmpty()) {
                panel.add(new JLabel());
            } else {
                JButton button = new JButton(label);
                button.setFont(new Font("Arial", Font.BOLD, 20));
                button.setFocusPainted(false);
                button.addActionListener(this);
                panel.add(button);
            }
        }

        add(panel, BorderLayout.SOUTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ((command.charAt(0) >= '0' && command.charAt(0) <= '9') || command.equals(".")) {
            if (startNewNumber) {
                display.setText(command.equals(".") ? "0." : command);
                startNewNumber = false;
            } else {
                display.setText(display.getText() + command);
            }
        } else if (command.equals("C")) {
            display.setText("0");
            historyDisplay.setText(" ");
            num1 = num2 = result = 0;
            operator = ' ';
            startNewNumber = true;
        } else if (command.equals("=")) {
            try {
                num2 = Double.parseDouble(display.getText());
                historyDisplay.setText(historyDisplay.getText() + " " + num2 + " =");
                calculate();
                display.setText("" + result);
                num1 = result;
                startNewNumber = true;
                operator = ' ';
            } catch (ArithmeticException ex) {
                display.setText("Error: " + ex.getMessage());
            } catch (Exception ex) {
                display.setText("Error");
            }
        } else { // Operator buttons
            try {
                if (operator != ' ' && !startNewNumber) {
                    // Perform previous calculation before chaining
                    num2 = Double.parseDouble(display.getText());
                    calculate();
                    display.setText("" + result);
                    num1 = result;
                } else {
                    num1 = Double.parseDouble(display.getText());
                }
                operator = command.charAt(0);
                historyDisplay.setText(num1 + " " + operator);
                startNewNumber = true;
            } catch (Exception ex) {
                display.setText("Error");
            }
        }
    }

    private void calculate() {
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) throw new ArithmeticException("Division by zero");
                result = num1 / num2;
                break;
            case '%':
                if (num2 == 0) throw new ArithmeticException("Modulus by zero");
                result = num1 % num2;
                break;
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}
