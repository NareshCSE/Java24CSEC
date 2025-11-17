package com.studyopedia;

import java.awt.*;
import java.awt.event.*;

public class Swingapp {

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

        Label result = new Label("Result:");
        result.setBounds(50, 180, 100, 30);
        frame.add(result);

        TextField txt = new TextField();
        txt.setBounds(160, 180, 200, 30);
       // txt.setEditable(false); // user cannot type here
        frame.add(txt);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(textfield.getText());
                    long fact = 1;

                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }

                    txt.setText(String.valueOf(fact)); 
                } catch (NumberFormatException ex) {
                    txt.setText("Invalid input");
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

