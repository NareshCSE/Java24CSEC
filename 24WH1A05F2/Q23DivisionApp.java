package java_exps;
import javax.swing.*;
import java.awt.event.*;

public class Q23DivisionApp {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        JFrame frame= new JFrame("Division App");
        frame.setSize(250, 250);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Num1:");
        l1.setBounds(30, 30, 50, 30);
        JTextField t1 = new JTextField();
        t1.setBounds(90, 30, 100, 30);

        JLabel l2 = new JLabel("Num2:");
        l2.setBounds(30, 70, 50, 30);
        JTextField t2 = new JTextField();
        t2.setBounds(90, 70, 100, 30);

        JButton button = new JButton("Divide");
        button.setBounds(70, 110, 100, 30);

        JLabel l3 = new JLabel("Result:");
        l3.setBounds(30, 150, 50, 30);
        JTextField t3 = new JTextField();
        t3.setBounds(90, 150, 100, 30);
        t3.setEditable(false);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    float result = (float)num1 / num2;
                    t3.setText("" + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid integers.");
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero.");
                }
            }
        });

        frame.add(l1); frame.add(t1);
        frame.add(l2); frame.add(t2);
        frame.add(button);
        frame.add(l3); frame.add(t3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
