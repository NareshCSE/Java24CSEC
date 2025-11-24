package navya_25wh5a0517;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SimpleCalculator extends JFrame implements ActionListener {
private JTextArea display;
private double num1 = 0, num2 = 0, result = 0;
private char operator;
private boolean operatorClicked = false;
public SimpleCalculator() {
setTitle("Simple Calculator");
setSize(350, 400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new BorderLayout());
display = new JTextArea(2, 20);
display.setEditable(false);
display.setFont(new Font("Arial", Font.BOLD, 22));
display.setBackground(Color.WHITE);
display.setLineWrap(true);
display.setWrapStyleWord(true);
add(display, BorderLayout.NORTH);
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(5, 4, 10, 10));
String[] buttons = {
"7", "8", "9", "+",
"4", "5", "6", "-",
"1", "2", "3", "*",
"0", "%", "/", "=",
"C"
};
for (String text : buttons) {
JButton button = new JButton(text);
button.setFont(new Font("Arial", Font.BOLD, 20));
button.addActionListener(this);
panel.add(button);
}
add(panel, BorderLayout.CENTER);
}


public void actionPerformed(ActionEvent e) {
String command = e.getActionCommand();
try {
if (command.charAt(0) >= '0' && command.charAt(0) <= '9') {
display.append(command);
operatorClicked = false;}
else if (command.equals("+") || command.equals("-") ||
command.equals("*") || command.equals("/") || command.equals("%")) {
if (!operatorClicked && !display.getText().isEmpty()) {
num1 = Double.parseDouble(display.getText().trim());
operator = command.charAt(0);
display.append(" " + operator + " ");
operatorClicked = true; } }
else if (command.equals("=")) {
String[] parts = display.getText().trim().split(" ");
if (parts.length < 3) return;
num1 = Double.parseDouble(parts[0]);
operator = parts[1].charAt(0);
num2 = Double.parseDouble(parts[2]);
switch (operator) {
case '+': result = num1 + num2; break;
case '-': result = num1 - num2; break;
case '*': result = num1 * num2; break;
case '/':
if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
result = num1 / num2;
break;
case '%':
if (num2 == 0) throw new ArithmeticException("Cannot modulo by zero");
result = num1 % num2;
break; }
display.append(" =\n" + result); }
else if (command.equals("C")) {
display.setText("");
num1 = num2 = result = 0;
operatorClicked = false;
}
} catch (ArithmeticException ex) {
display.setText("Error: " + ex.getMessage());
} catch (Exception ex) {
display.setText("Invalid Input");} }
public static void main(String[] args) {
SwingUtilities.invokeLater(() -> {
new SimpleCalculator().setVisible(true);
}); }}
