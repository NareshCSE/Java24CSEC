package labexperiments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightsGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Traffic Light");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,1));  // <-- FIXED layout

        JRadioButton redBtn = new JRadioButton("Red");
        JRadioButton yellowBtn = new JRadioButton("Yellow");
        JRadioButton greenBtn = new JRadioButton("Green");

        frame.add(redBtn);
        frame.add(yellowBtn);
        frame.add(greenBtn);

        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(messageLabel);

        ButtonGroup group = new ButtonGroup();
        group.add(redBtn);
        group.add(yellowBtn);
        group.add(greenBtn);

        redBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("STOP");
                messageLabel.setForeground(Color.RED);
            }
        });

        yellowBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("READY");
                messageLabel.setForeground(Color.ORANGE);
            }
        });

        greenBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("GO");
                messageLabel.setForeground(Color.GREEN);
            }
        });

        frame.setVisible(true);
    }
}
