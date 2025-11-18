package java_25wh5a0520;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Division_awt extends JFrame implements ActionListener { 
   private JTextField num1Field, num2Field, resultField; 
    private JButton divideButton; 
   public Division_awt() { 
        // Frame setup 
        setTitle("Integer Division"); 
        setSize(400, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(new GridLayout(4, 2, 10, 10)); 
 
        // Create labels and fields 
        JLabel num1Label = new JLabel("Num 1:"); 
        num1Field = new JTextField(); 
 
        JLabel num2Label = new JLabel("Num 2:"); 
        num2Field = new JTextField(); 
 
        JLabel resultLabel = new JLabel("Result:"); 
        resultField = new JTextField(); 
        resultField.setEditable(false); 
 
        divideButton = new JButton("Divide"); 
        divideButton.addActionListener(this); 
 
        // Add components 
        add(num1Label); 
        add(num1Field); 
        add(num2Label); 
        add(num2Field); 
        add(resultLabel); 
        add(resultField); 
        add(new JLabel()); // placeholder 
        add(divideButton);}
   @Override 
   public void actionPerformed(ActionEvent e) { 
       try { 
           // Parse integers 
           int num1 = Integer.parseInt(num1Field.getText()); 
           int num2 = Integer.parseInt(num2Field.getText()); 

           // Check for divide by zero 
           if (num2 == 0) { 
               throw new ArithmeticException("Cannot divide by zero!"); 
           } 

           int result = num1 / num2; 
           resultField.setText(String.valueOf(result)); 

       } catch (NumberFormatException ex) { 
           JOptionPane.showMessageDialog(this, 
                   "Invalid input! Please enter integers only.", 
                   "Number Format Error", 
                   JOptionPane.ERROR_MESSAGE); 
       } catch (ArithmeticException ex) { 
           JOptionPane.showMessageDialog(this, 
                   ex.getMessage(), 
                   "Arithmetic Error", 
                   JOptionPane.ERROR_MESSAGE); 
       } 
   } 
 public static void main(String[] args) { 
       SwingUtilities.invokeLater(() -> { 
           new Division_awt().setVisible(true); 
       }); }} 
