package java_class;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class WordsCharCount extends JFrame implements ActionListener{
	JTextArea textArea;
    JButton countButton;
    JLabel charLabel,wordLabel;
    
    public WordsCharCount() {
    	setTitle("Words and Character Counter");
        setSize(400,300);
        setLayout(new BorderLayout());

        textArea=new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        add(new JScrollPane(textArea),BorderLayout.CENTER);

        JPanel panel=new JPanel();
        countButton=new JButton("Count");
        countButton.addActionListener(this);
        charLabel=new JLabel("Characters: 0");
        wordLabel=new JLabel("Words: 0");
        panel.add(countButton);
        panel.add(charLabel);
        panel.add(wordLabel);
        add(panel,BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WordsCharCount();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text=textArea.getText().trim();
        int charCount=text.length();
        int wordCount=0;
        if (!text.isEmpty()) {
            wordCount=text.split("\\s+").length;
        }
        charLabel.setText("Characters: "+charCount);
        wordLabel.setText("Words: "+wordCount);
	}
}