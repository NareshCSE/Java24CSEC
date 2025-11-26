package assignment_questions_5D4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Assignment25_no_of_characters {

    public static void main(String[] args) {
        JFrame f = new JFrame("No of characters");
        f.setLayout(null);

        JTextArea tf1 = new JTextArea();
        tf1.setBounds(150,10, 200, 50);
        f.add(tf1);

        JButton b = new JButton("Compute");
        b.setBounds(50, 70, 150, 30);
        f.add(b);

        JLabel r = new JLabel("Result");
        r.setBounds(50, 120, 200, 30);
        f.add(r);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = tf1.getText();  
                int count = text.length();    
                r.setText("Characters: " + count);
            }
        });

        f.setSize(350, 200);
        f.setVisible(true);
    }
}
