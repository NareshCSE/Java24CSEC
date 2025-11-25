package labexperiments;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class FactorialGUI {

	    public static void main(String[] args) {
	        Frame frame = new Frame("FACTORIAL");
	        frame.setSize(500, 300);
	        frame.setLayout(null);
	        frame.setVisible(true);

	        Label label = new Label("Enter number:");
	        label.setBounds(50, 50, 100, 30);
	        frame.add(label);
	        
	        TextField textfield = new TextField();
	        textfield.setBounds(160, 50, 150, 30);
	        frame.add(textfield);

	        Button button = new Button("Compute");
	        button.setBounds(100, 120, 100, 40);
	        frame.add(button);

	        Label result = new Label("Result: ");
	        result.setBounds(50, 180, 400, 30);
	        frame.add(result);
	        

	        button.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		try {
	        			int num=Integer.parseInt(textfield.getText());
	        			long fact=1;
	        			for(int i=1;i<=num;i++) {
	        				fact=fact*i;
	        			}
	        			result.setText("Result:"+fact);     		
	        		}catch(NumberFormatException ex) {
	        			result.setText("enter valid number");
	        		}
	        	}
	        });

	        frame.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
	        });
	    }
	}



