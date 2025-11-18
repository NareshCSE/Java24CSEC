package java_25wh5a0520;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Word_count_awt extends JFrame implements ActionListener { 
 private static final long serialVersionUID = 1L; 
 JTextArea textArea; 
    JButton countButton; 
    JLabel wordLabel, charLabel; 
    public Word_count_awt() { 
        setTitle("Word and Character Counter"); 
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout(10, 10)); 
        setLocationRelativeTo(null); // center window 
        textArea = new JTextArea(); 
        textArea.setFont(new Font("Arial", Font.PLAIN, 16)); 
        add(new JScrollPane(textArea), BorderLayout.CENTER); 
        countButton = new JButton("Count Words & Characters"); 
        countButton.addActionListener(this); 
        add(countButton, BorderLayout.SOUTH); 
        JPanel resultPanel = new JPanel(new FlowLayout()); 
        wordLabel = new JLabel("Words: 0"); 
        charLabel = new JLabel("Characters: 0"); 
        wordLabel.setFont(new Font("Arial", Font.BOLD, 16)); 
        charLabel.setFont(new Font("Arial", Font.BOLD, 16)); 
        resultPanel.add(wordLabel); 
        resultPanel.add(charLabel); 
        add(resultPanel, BorderLayout.NORTH); 
    } 
    @Override 
    public void actionPerformed(ActionEvent e) { 
        String text = textArea.getText().trim(); 
        int charCount = text.length(); 
        int wordCount = 0; 
        if (!text.isEmpty()) { 
        	String[] words = text.split("\\s+"); // split by spaces 
        	wordCount = words.length; 
        	} 
        	wordLabel.setText("Words: " + wordCount); 
        	charLabel.setText("Characters: " + charCount); 
        	} 
        	public static void main(String[] args) { 
        	SwingUtilities.invokeLater(() -> { 
        	new Word_count_awt().setVisible(true); 
        	}); 
     } 
} 

