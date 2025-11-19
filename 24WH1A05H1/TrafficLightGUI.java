package java_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightGUI extends JFrame implements ActionListener{
	private JLabel messageLabel;
	private JRadioButton redButton,yellowButton,greenButton;
	private ButtonGroup group;
	public TrafficLightGUI()
	{
		setTitle("Traffic Light simulator");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		messageLabel=new JLabel("Select a colour");
		messageLabel.setBounds(30,30,120,25);
		add(messageLabel,BorderLayout.NORTH);
		
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		redButton=new JRadioButton("Red");
		yellowButton=new JRadioButton("Yellow");
		greenButton=new JRadioButton("Green");
		group=new ButtonGroup();
		group.add(redButton);
		group.add(yellowButton);
		group.add(greenButton);
		
		redButton.addActionListener(this);
		yellowButton.addActionListener(this);
		greenButton.addActionListener(this);
		
		panel.add(redButton);
		panel.add(yellowButton);
		panel.add(greenButton);
		add(panel,BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TrafficLightGUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==redButton) {
			messageLabel.setText("Stop");
			messageLabel.setForeground(Color.RED);
		}
		else if(e.getSource()==yellowButton) {
			messageLabel.setText("Ready");
			messageLabel.setForeground(Color.YELLOW);
		}
		else if(e.getSource()==greenButton){
			messageLabel.setText("Go");
			messageLabel.setForeground(Color.GREEN);
		}
	}

}
