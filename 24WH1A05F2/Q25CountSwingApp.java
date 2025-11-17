package java_exps;
import javax.swing.*;
import java.awt.event.*;

public class Q25CountSwingApp {
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        JFrame f = new JFrame("Count App");
        f.setSize(300, 300);
        f.setLayout(null);

        JTextArea area = new JTextArea();
        area.setBounds(50, 50, 200, 100);
        f.add(area);

        JButton btn = new JButton("Count");
        btn.setBounds(100, 160, 80, 30);
        f.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                int chars = text.length();
                int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
                JOptionPane.showMessageDialog(f, "Characters: " + chars + "\nWords: " + words);
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
