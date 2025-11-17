package vaishnavi;
import java.awt.*;
import java.awt.event.*;

public class TextCounterAWT extends Frame implements ActionListener {
    private TextArea textArea;
    private Button countButton;
    private Label resultLabel;
    public TextCounterAWT() {
        setTitle("Text Counter-24WH1A05J2");
        setSize(500, 350);
        setLayout(new BorderLayout());
        Label instructionLabel = new Label("Enter your paragraph below:", Label.CENTER);
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        add(instructionLabel, BorderLayout.NORTH);
        textArea = new TextArea("", 10, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14));
        add(textArea, BorderLayout.CENTER);
        Panel buttonPanel = new Panel();
        countButton = new Button("Count Text");
        countButton.setFont(new Font("Arial", Font.BOLD, 14));
        countButton.addActionListener(this);
        buttonPanel.add(countButton);
        resultLabel = new Label("Characters: 0 | Words: 0", Label.CENTER);
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        buttonPanel.add(resultLabel);
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        int charCount = text.length(); 
        int wordCount = 0;
        if (!text.trim().isEmpty()) {
            String[] words = text.trim().split("\\s+");
            wordCount = words.length;
        }
        resultLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
    }
    public static void main(String[] args) {
        new TextCounterAWT();
    }
}

