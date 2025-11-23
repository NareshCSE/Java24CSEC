package JAVA_LAB_EXPERIMENTS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSimulator extends JFrame implements ActionListener {
    private JLabel messageLabel;
    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup group;

    public TrafficLightSimulator() {
        setTitle("Traffic Light Simulator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(messageLabel);
        
        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");

        group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        add(redButton);
        add(yellowButton);
        add(greenButton);

        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            messageLabel.setText("STOP");
            messageLabel.setForeground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            messageLabel.setText("READY");
            messageLabel.setForeground(Color.ORANGE);
        } else if (e.getSource() == greenButton) {
            messageLabel.setText("GO");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficLightSimulator();
    }
}