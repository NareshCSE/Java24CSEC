package Assignmentquestions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment21_Calculator_awt {

    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setSize(350, 250);
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4));
        
        JTextField display = new JTextField();
        display.setEditable(false);
        f.add(display, BorderLayout.NORTH);

        final double[] num1 = new double[1];
        final String[] operator = new String[1];

        JButton b1 = new JButton("1"); JButton b2 = new JButton("2"); JButton b3 = new JButton("3");
        JButton b4 = new JButton("4"); JButton b5 = new JButton("5"); JButton b6 = new JButton("6");
        JButton b7 = new JButton("7"); JButton b8 = new JButton("8"); JButton b9 = new JButton("9");
        JButton b0 = new JButton("0"); JButton add = new JButton("+"); JButton sub = new JButton("-");
        JButton mul = new JButton("*"); JButton div = new JButton("/"); JButton equal = new JButton("=");
        JButton clear = new JButton("Clear");

        ActionListener numberListener = e -> {
            JButton btn = (JButton) e.getSource();
            display.setText(display.getText() + btn.getText());
        };

        b1.addActionListener(numberListener);
        b2.addActionListener(numberListener);
        b3.addActionListener(numberListener);
        b4.addActionListener(numberListener);
        b5.addActionListener(numberListener);
        b6.addActionListener(numberListener);
        b7.addActionListener(numberListener);
        b8.addActionListener(numberListener);
        b9.addActionListener(numberListener);
        b0.addActionListener(numberListener);

        ActionListener operatorListener = e -> {
            try {
                num1[0] = Double.parseDouble(display.getText());
                operator[0] = ((JButton)e.getSource()).getText();
                display.setText("");
            } catch (Exception ex) {
                display.setText("Error");
            }
        };

        add.addActionListener(operatorListener);
        sub.addActionListener(operatorListener);
        mul.addActionListener(operatorListener);
        div.addActionListener(operatorListener);

        equal.addActionListener(e -> {
            try {
                double num2 = Double.parseDouble(display.getText());
                double result = 0;

                switch (operator[0]) {
                    case "+": result = num1[0] + num2; break;
                    case "-": result = num1[0] - num2; break;
                    case "*": result = num1[0] * num2; break;
                    case "/": result = num1[0] / num2; break;
                }

                display.setText(String.valueOf(result));
            } catch (Exception ex) {
                display.setText("Error");
            }
        });

        clear.addActionListener(e -> display.setText(" "));

        p.add(b1); p.add(b2); p.add(b3); p.add(b4);
        p.add(b5); p.add(b6); p.add(b7); p.add(b8);
        p.add(b9); p.add(b0); p.add(add); p.add(sub);
        p.add(mul); p.add(div); p.add(equal); p.add(clear);

        f.add(p, BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
