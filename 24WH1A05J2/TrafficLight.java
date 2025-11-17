package vaishnavi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame implements ActionListener {
    private JLabel messageLabel;
    private JRadioButton redButton, yellowButton, greenButton;
    private ButtonGroup lightGroup;
    
    public TrafficLight() {
        
        setTitle("Traffic Light-24WH1A05J2");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        messageLabel = new JLabel("", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 24));
        messageLabel.setPreferredSize(new Dimension(300, 60));
        add(messageLabel, BorderLayout.NORTH);
        
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(3, 1, 10, 10));
        
        redButton = new JRadioButton("Red Light");
        yellowButton = new JRadioButton("Yellow Light");
        greenButton = new JRadioButton("Green Light");
   
        redButton.setFont(new Font("Arial", Font.PLAIN, 16));
        yellowButton.setFont(new Font("Arial", Font.PLAIN, 16));
        greenButton.setFont(new Font("Arial", Font.PLAIN, 16));
        
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);
    
        lightGroup = new ButtonGroup();
        lightGroup.add(redButton);
        lightGroup.add(yellowButton);
        lightGroup.add(greenButton);
        
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);
        
        add(radioPanel, BorderLayout.CENTER);
 
        JLabel instructionLabel = new JLabel("Select a traffic light color", JLabel.CENTER);
        instructionLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        add(instructionLabel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton && redButton.isSelected()) {
            displayRedLight();
        } else if (e.getSource() == yellowButton && yellowButton.isSelected()) {
            displayYellowLight();
        } else if (e.getSource() == greenButton && greenButton.isSelected()) {
            displayGreenLight();
        }
    }
    
    private void displayRedLight() {
        messageLabel.setText("STOP");
        messageLabel.setForeground(Color.RED);
    }
    
    private void displayYellowLight() {
        messageLabel.setText("READY");
        messageLabel.setForeground(Color.ORANGE);
    }
    
    private void displayGreenLight() {
        messageLabel.setText("GO");
        messageLabel.setForeground(Color.GREEN);
    }
    
    public static void main(String[] args) {
        new TrafficLight();
    }
}

