package firstjavalab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ASS25_24WH1A05D1 extends JFrame implements ActionListener {

    JTextArea textArea;
    JButton countBtn;

    public ASS25_24WH1A05D1() {

        setTitle("Word & Character Counter-24WH1A05D1");
        setSize(400, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text area
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Button
        countBtn = new JButton("Count Words & Characters");
        countBtn.addActionListener(this);
        add(countBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText().trim();

        // Character count (excluding spaces)
        int charCount = text.replace(" ", "").length();

        // Word count
        int wordCount = (text.isEmpty()) ? 0 : text.split("\\s+").length;

        // Display results
        JOptionPane.showMessageDialog(
                this,
                "Words: " + wordCount + "\nCharacters: " + charCount,
                "Result",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        new ASS25_24WH1A05D1();
    }
}
