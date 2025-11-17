package Assignmentquestions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment22_factorialValue {

    public static void main(String[] args) {

        JFrame f = new JFrame("Factorial Calculator");
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter integer");
        l1.setBounds(50, 10, 150, 30);
        f.add(l1);

        JTextField tf = new JTextField();
        tf.setBounds(150, 20, 150, 30);
        f.add(tf); 

        JButton b = new JButton("Compute");
        b.setBounds(50, 70, 150, 30);
        f.add(b);

        JLabel r = new JLabel("Result");
        r.setBounds(50, 120, 200, 30);
        f.add(r);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(tf.getText());
                    long fact = 1;
                    
                    for (int i = 1; i <= n; i++)
                        fact *= i;
                    r.setText("Result: " + fact);

                } catch (NumberFormatException ex) {
                    r.setText("Invalid input!");
                }
            }
        });

        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
