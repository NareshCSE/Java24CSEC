package java_exps;

import javax.swing.*;
import java.awt.event.*;

public class Q22SwingApp {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        JFrame f = new JFrame("Factorial");
        f.setSize(250, 200);
        f.setLayout(null);

        JTextField input = new JTextField();
        input.setBounds(50, 30, 150, 30);
        f.add(input);

        JButton btn = new JButton("Compute");
        btn.setBounds(75, 70, 100, 30);
        f.add(btn);

        JTextField output = new JTextField();
        output.setBounds(50, 110, 150, 30);
        output.setEditable(false);
        f.add(output);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(input.getText());
                    int fact = 1;
                    for (int i = 1; i <= n; i++) fact *= i;
                    output.setText("" + fact);
                } catch (Exception ex) {
                    output.setText("Error");
                }
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

