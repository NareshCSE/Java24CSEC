package javapractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class swingapp extends JFrame implements ActionListener {

    JTextArea textArea;
    JButton button;
    JLabel resultLabel;

    public swingapp() {

        setTitle("Word & Character Counter");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);

        textArea = new JTextArea();
        textArea.setBounds(50, 50, 380, 180);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(textArea);

        button = new JButton("Count");
        button.setBounds(200, 250, 100, 40);
        button.addActionListener(this);
        add(button);

        resultLabel = new JLabel("");
        resultLabel.setBounds(50, 300, 400, 30);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String text = textArea.getText().trim();

        int charCount = text.replace("\n", "").length();

        int wordCount = 0;
        if (!text.isEmpty()) {
            wordCount = text.split("\\s+").length;
        }

        resultLabel.setText("Words: " + wordCount + " | Characters: " + charCount);
    }

    public static void main(String[] args) {
        new swingapp();
    }
}
