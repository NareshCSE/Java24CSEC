package labexperiments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountCharactersGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Word & Character Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JButton countButton = new JButton("Count Words & Characters");
        frame.add(countButton, BorderLayout.NORTH);

        JLabel resultLabel = new JLabel("Result will appear here...", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        frame.add(resultLabel, BorderLayout.SOUTH);

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText().trim();

                int charCount = text.length();
                int wordCount = (text.isEmpty()) ? 0 : text.split("\\s+").length;

                resultLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
            }
        });

        frame.setVisible(true);
    }
}
