package java_exps;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q24TrafficLightApp {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        JFrame f = new JFrame("Traffic Light");
        JLabel msg = new JLabel("");
        msg.setBounds(100, 20, 100, 30);

        JRadioButton red = new JRadioButton("Red");
        red.setBounds(100, 60, 100, 30);
        JRadioButton yellow = new JRadioButton("Yellow");
        yellow.setBounds(100, 90, 100, 30);
        JRadioButton green = new JRadioButton("Green");
        green.setBounds(100, 120, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(red); group.add(yellow); group.add(green);

        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                msg.setText("Stop");
                msg.setForeground(Color.RED);
            }
        });

        yellow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                msg.setText("Ready");
                msg.setForeground(Color.ORANGE);
            }
        });

        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                msg.setText("Go");
                msg.setForeground(Color.GREEN);
            }
        });

        f.add(msg); f.add(red); f.add(yellow); f.add(green);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}