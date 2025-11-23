package JAVA_LAB_EXPERIMENTS;
import javax.swing.*;   
import java.awt.event.*; 
public class TextCounterApp {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Word & Character Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTextArea textArea = new JTextArea(10, 30);   
        JButton countButton = new JButton("Count");  
        JLabel resultLabel = new JLabel("Result will be shown here"); 

       
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(textArea)); 
        panel.add(countButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);

        
        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText().trim();

                
                int charCount = text.length();

                
                String[] words = text.split("\\s+");
                int wordCount = (text.isEmpty()) ? 0 : words.length;
                resultLabel.setText("Characters: " + charCount + " | Words: " + wordCount);
            }
        });
    }
}