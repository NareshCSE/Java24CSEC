package java_25wh5a0520;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Traffic_Light_awt extends JFrame implements ActionListener { 
    private JRadioButton redButton, yellowButton, greenButton; 
    private JLabel messageLabel; 
    private ButtonGroup group; 
    private LightPanel lightPanel; 
    public Traffic_Light_awt() { 
        setTitle("Traffic Light Simulator"); 
        setSize(300, 450); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new BorderLayout(10, 10)); 
        setLocationRelativeTo(null);  
        messageLabel = new JLabel(" ", SwingConstants.CENTER); 
        messageLabel.setFont(new Font("Arial", Font.BOLD, 28)); 
        add(messageLabel, BorderLayout.NORTH); 
        lightPanel = new LightPanel(); 
        add(lightPanel, BorderLayout.CENTER); 
        JPanel buttonPanel = new JPanel(); 
        buttonPanel.setLayout(new FlowLayout()); 
        redButton = new JRadioButton("Red"); 
        yellowButton = new JRadioButton("Yellow"); 
        greenButton = new JRadioButton("Green"); 
        group = new ButtonGroup(); 
        group.add(redButton); 
        group.add(yellowButton); 
        group.add(greenButton); 
        redButton.addActionListener(this); 
        yellowButton.addActionListener(this); 
        greenButton.addActionListener(this); 
        buttonPanel.add(redButton); 
        buttonPanel.add(yellowButton); 
        buttonPanel.add(greenButton); 
        add(buttonPanel, BorderLayout.SOUTH);
    }
    @Override 
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == redButton) { 
            messageLabel.setText("STOP"); 
            messageLabel.setForeground(Color.RED); 
            lightPanel.setCurrentLight("RED"); 
        } else if (e.getSource() == yellowButton) { 
            messageLabel.setText("READY"); 
            messageLabel.setForeground(Color.ORANGE); 
            lightPanel.setCurrentLight("YELLOW"); 
        } else if (e.getSource() == greenButton) { 
            messageLabel.setText("GO"); 
            messageLabel.setForeground(Color.GREEN.darker()); 
            lightPanel.setCurrentLight("GREEN"); 
        } 
        lightPanel.repaint(); 
    } 
    class LightPanel extends JPanel { 
        private String currentLight = ""; 
        public void setCurrentLight(String light) { 
            this.currentLight = light; 
        } 
        @Override 
        protected void paintComponent(Graphics g) { 
            super.paintComponent(g); 
            g.setColor(Color.BLACK); 
            g.fillRect(90, 50, 100, 260); 
            g.setColor(currentLight.equals("RED") ? Color.RED : Color.DARK_GRAY); 
            g.fillOval(110, 70, 60, 60); 
            g.setColor(currentLight.equals("YELLOW") ? Color.ORANGE : Color.DARK_GRAY); 
            g.fillOval(110, 150, 60, 60); 
            g.setColor(currentLight.equals("GREEN") ? Color.GREEN : Color.DARK_GRAY); 
            g.fillOval(110, 230, 60, 60); 
        } 
    } 
      public static void main(String[] args) { 
        SwingUtilities.invokeLater(() -> { 
            new Traffic_Light_awt().setVisible(true); 
        }); 
    } 
} 
