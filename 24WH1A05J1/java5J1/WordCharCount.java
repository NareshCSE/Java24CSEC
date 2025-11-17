package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordCharCountApp extends JFrame implements ActionListener {

    JTextArea textArea;
    JButton countButton;
    JLabel charLabel, wordLabel;

    public WordCharCountApp() {
        setTitle("Word & Character Counter - 24WH1A05J1");
        setSize(500, 400);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setLineWrap(true);        // Disable horizontal scrolling
        textArea.setWrapStyleWord(true);   // Wrap long words properly

        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        countButton = new JButton("Count");
        countButton.addActionListener(this);

        charLabel = new JLabel("Characters: 0");
        wordLabel = new JLabel("Words: 0");

        panel.add(countButton);
        panel.add(charLabel);
        panel.add(wordLabel);

        add(panel, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText().trim();
        int charCount = text.length();
        int wordCount = 0;

        if (!text.isEmpty()) {
            wordCount = text.split("\\s+").length;
        }

        charLabel.setText("Characters: " + charCount);
        wordLabel.setText("Words: " + wordCount);
    }

    public static void main(String[] args) {
        new WordCharCountApp();
    }
}

