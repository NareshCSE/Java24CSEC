package javapractice;
import javax.swing.*;
import java.awt.event.*;

public class factorial extends JFrame implements ActionListener {

    JTextField inputField, outputField;
    JButton compute;

    public factorial() {

        setTitle("Factorial Calculator");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel in = new JLabel("Enter Number:");
        in.setBounds(40, 40, 100, 30);
        add(in);

        inputField = new JTextField();
        inputField.setBounds(150, 40, 120, 30);
        add(inputField);

        JLabel out = new JLabel("Factorial:");
        out.setBounds(40, 90, 100, 30);
        add(out);

        outputField = new JTextField();
        outputField.setBounds(150, 90, 120, 30);
        outputField.setEditable(false);
        add(outputField);

        compute = new JButton("Compute");
        compute.setBounds(110, 140, 120, 35);
        compute.addActionListener(this);
        add(compute);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int n = Integer.parseInt(inputField.getText());
            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            outputField.setText(String.valueOf(fact));

        } catch (Exception ex) {
            outputField.setText("Invalid");
        }
    }

    public static void main(String[] args) {
        new factorial();
    }
}
