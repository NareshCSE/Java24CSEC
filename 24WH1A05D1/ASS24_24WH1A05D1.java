package firstjavalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ASS24_24WH1A05D1 extends JFrame implements ActionListener {

    JRadioButton redBtn, yellowBtn, greenBtn;
    JLabel message;

    public ASS24_24WH1A05D1() {

        setTitle("Traffic Light Simulator-24WH1A05D1");
        setSize(300, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Message label (initially empty)
        message = new JLabel("");
        message.setFont(new Font("Arial", Font.BOLD, 24));
        add(message);

        // Radio buttons
        redBtn = new JRadioButton("Red");
        yellowBtn = new JRadioButton("Yellow");
        greenBtn = new JRadioButton("Green");

        // Group so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(redBtn);
        group.add(yellowBtn);
        group.add(greenBtn);

        // Add listeners
        redBtn.addActionListener(this);
        yellowBtn.addActionListener(this);
        greenBtn.addActionListener(this);

        // Add buttons to frame
        add(redBtn);
        add(yellowBtn);
        add(greenBtn);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (redBtn.isSelected()) {
            message.setText("STOP");
            message.setForeground(Color.RED);
        }
        else if (yellowBtn.isSelected()) {
            message.setText("READY");
            message.setForeground(Color.ORANGE);
        }
        else if (greenBtn.isSelected()) {
            message.setText("GO");
            message.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new ASS24_24WH1A05D1();
    }
}
