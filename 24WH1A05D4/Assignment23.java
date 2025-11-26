package assignment_questions_5D4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Assignment23 extends JFrame {
 private JTextField num1Field, num2Field, resultField;
 private JButton divideButton;
 public Assignment23() {
 setTitle("Integer Division");
 setSize(300, 200);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(new GridLayout(4, 2));
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
 divideButton = new JButton("Divide");
 add(divideButton);
 add(new JLabel());
 divideButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 try {
 int num1 = Integer.parseInt(num1Field.getText());
 int num2 = Integer.parseInt(num2Field.getText());
 int result = num1 / num2;
 resultField.setText(String.valueOf(result));
 } catch (NumberFormatException ex) {
 JOptionPane.showMessageDialog(null, "Please enter valid integers.", "Input Error", 
JOptionPane.ERROR_MESSAGE);
 } catch (ArithmeticException ex) {
 JOptionPane.showMessageDialog(null, "Cannot divide by zero.", "Math Error", 
JOptionPane.ERROR_MESSAGE);
 }
 }
 });
 setVisible(true);
 }
 public static void main(String[] args) {
 new Assignment23();
 }
}
