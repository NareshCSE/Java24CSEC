package assignment_questions_5D4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Assignment24_trafficLight {

    public static void main(String[] args) {
        JFrame f = new JFrame("Traffic Light");

        JRadioButton l1 = new JRadioButton("Red");
        l1.setBounds(50, 10, 150, 30);
        f.add(l1);

        JRadioButton l2 = new JRadioButton("Yellow");
        l2.setBounds(50, 50, 150, 30);
        f.add(l2);

        JRadioButton l3 = new JRadioButton("Green");
        l3.setBounds(50, 90, 150, 30);
        f.add(l3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(l1);
        bg.add(l2);
        bg.add(l3);

        JLabel msg = new JLabel("");
        msg.setBounds(50, 150, 200, 30);
        msg.setFont(new Font("Arial", Font.BOLD, 18));
        f.add(msg);

        ItemListener il = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (l1.isSelected()) {
                    msg.setText("STOP");
                    msg.setForeground(Color.RED);
                }
                else if (l2.isSelected()) {
                    msg.setText("READY");
                    msg.setForeground(Color.YELLOW);
                }
                else if (l3.isSelected()) {
                    msg.setText("GO");
                    msg.setForeground(Color.GREEN);
                }
            }
        };

        l1.addItemListener(il);
        l2.addItemListener(il);
        l3.addItemListener(il);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
