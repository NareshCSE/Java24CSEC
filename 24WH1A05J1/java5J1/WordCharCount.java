package src;

import java.awt.*;
import java.awt.event.*;

public class WordCharCountApp extends Frame implements ActionListener {
    private TextArea textArea;
    private Label resultLabel;
    private Button countButton;

    public WordCharCountApp() {
        // Frame setup
        setTitle("Word and Character Counter");
        setSize(500, 300);
        setLayout(new BorderLayout());

        // Text area for paragraph input
        textArea = new TextArea("", 10, 40, TextArea.SCROLLBARS_VERTICAL_ONLY);
        add(textArea, BorderLayout.CENTER);

        // Panel for button and result
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());

        countButton = new Button("Count");
        countButton.addActionListener(this);
        panel.add(countButton);

        resultLabel = new Label("Characters: 0 | Words: 0");
        panel.add(resultLabel);

        add(panel, BorderLayout.SOUTH);

        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();

        // Character count (excluding spaces if you want, but here we include all)
        int charCount = text.length();

        // Word count (split by whitespace)
        String[] words = text.trim().split("\\s+");
        int wordCount = text.trim().isEmpty() ? 0 : words.length;

        resultLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
    }

    public static void main(String[] args) {
        new WordCharCountApp();
    }
}
