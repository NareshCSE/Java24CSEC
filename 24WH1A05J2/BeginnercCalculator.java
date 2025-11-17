package vaishnavi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BeginnercCalculator extends JFrame implements ActionListener {
   
    private JTextField display;
    private JButton[] buttons;
    
    private double firstNumber = 0;
    private String operator = "";
    private boolean newNumber = true;

    public BeginnercCalculator() {
        setTitle("Calculator-5J2");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*", 
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };
        
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        buttons = new JButton[buttonLabels.length];
        
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 18));
            buttons[i].addActionListener(this);
            buttonPanel.add(buttons[i]);
        }
        
        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
            if (newNumber) {
                display.setText(command);
                newNumber = false;
            } else {
                display.setText(display.getText() + command);
            }
        }
     
        else if (command.equals("C")) {
            display.setText("0");
            firstNumber = 0;
            operator = "";
            newNumber = true;
        }
        
        else if (command.equals("+") || command.equals("-") || 
                 command.equals("*") || command.equals("/")) {
            firstNumber = Double.parseDouble(display.getText());
            operator = command;
            newNumber = true;
        }
      
        else if (command.equals("=")) {
            if (!operator.equals("")) {
                double secondNumber = Double.parseDouble(display.getText());
                double result = calculate(firstNumber, secondNumber, operator);
                display.setText(String.valueOf(result));
                operator = "";
                newNumber = true;
            }
        }
    }
    
    private double calculate(double num1, double num2, String op) {
        switch (op) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/": 
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                    return 0;
                }
            default: return 0;
        }
    }
    
    public static void main(String[] args) {
        new BeginnercCalculator();
    }
}