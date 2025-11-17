import javax.swing.*;
import java.math.BigInteger;
public class Factorial_Compute_Button {
       public static void main(String args[]) {
    	   JFrame frame=new JFrame("Factorial Calculator");
    	   frame.setSize(400,200);
    	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	   frame.setLayout(null);
    	   JLabel inputLabel = new JLabel("Enter an integer:");
           inputLabel.setBounds(30, 30, 120, 25);
           frame.add(inputLabel);

           JTextField inputField = new JTextField();
           inputField.setBounds(160, 30, 180, 25);
           frame.add(inputField);

           JLabel outputLabel = new JLabel("Factorial:");
           outputLabel.setBounds(30, 70, 120, 25);
           frame.add(outputLabel);

           JTextField outputField = new JTextField();
           outputField.setBounds(160, 70, 180, 25);
           outputField.setEditable(false);
           frame.add(outputField);
           
           JButton computeButton=new JButton("Compute");
           computeButton.setBounds(140, 110, 100, 30);
           frame.add(computeButton);
           
           computeButton.addActionListener(e -> {
        	    try {
        	        int number = Integer.parseInt(inputField.getText());
        	        if (number < 0) {
        	            outputField.setText("Invalid (negative)");
        	        } else {
        	            outputField.setText(factorial(number).toString());
        	        }
        	    } catch (NumberFormatException ex) {
        	        outputField.setText("Invalid input");
        	    }
        	});

          
           frame.setVisible(true);
       }
       public static BigInteger factorial(int n) {
    	    BigInteger result = BigInteger.ONE;
    	    for (int i = 2; i <= n; i++) {
    	        result = result.multiply(BigInteger.valueOf(i));
    	    }
    	    return result;
    	}

}
