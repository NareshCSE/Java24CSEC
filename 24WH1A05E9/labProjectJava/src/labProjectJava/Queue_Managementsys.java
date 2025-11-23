package labProjectJava;

import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Managementsys extends Frame implements ActionListener {

    Queue<String> queue = new LinkedList<>();
    Panel queuePanel;
    Label statusLabel, countLabel, maxLabel;
    Button addBtn, serveBtn, peekBtn, clearBtn;
    int personCount = 1, maxQueueLength = 0;

    public Queue_Managementsys() {
        setTitle("Queue Management System - Ticket Counter");
        setSize(750, 400);
        setLayout(new BorderLayout(10, 10));

        //Top Panel (Buttons)
        Panel topPanel = new Panel();
        topPanel.setLayout(new FlowLayout());

        addBtn = new Button("Add Person");
        serveBtn = new Button("Serve Next");
        peekBtn = new Button("Peek");
        clearBtn = new Button("Clear Queue");

        addBtn.addActionListener(this);
        serveBtn.addActionListener(this);
        peekBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        topPanel.add(addBtn);
        topPanel.add(serveBtn);
        topPanel.add(peekBtn);
        topPanel.add(clearBtn);

        add(topPanel, BorderLayout.NORTH);

        //Center Panel (Queue Display)
        queuePanel = new Panel();
        queuePanel.setLayout(new FlowLayout());
        queuePanel.setBackground(Color.LIGHT_GRAY);
        add(queuePanel, BorderLayout.CENTER);

        //Bottom Panel (Status Info)
        Panel bottomPanel = new Panel();
        bottomPanel.setLayout(new GridLayout(1, 3));

        statusLabel = new Label("Status: Waiting...");
        countLabel = new Label("Current Queue: 0");
        maxLabel = new Label("Max Queue Length: 0");

        bottomPanel.add(statusLabel);
        bottomPanel.add(countLabel);
        bottomPanel.add(maxLabel);

        add(bottomPanel, BorderLayout.SOUTH);

        //Window Close 
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    //Action Events
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addBtn) {
            String person = "Person " + personCount++;
            queue.add(person);
            statusLabel.setText("Status: Added " + person);
            if (queue.size() > maxQueueLength) {
                maxQueueLength = queue.size();
            }
            updateQueueDisplay();
        } 
        else if (e.getSource() == serveBtn) {
            if (queue.isEmpty()) {
                statusLabel.setText("Status: Queue is empty!");
            } else {
                String served = queue.remove();
                statusLabel.setText("Status: Served " + served);
                updateQueueDisplay();
            }
        } 
        else if (e.getSource() == peekBtn) {
            if (queue.isEmpty()) {
                statusLabel.setText("Status: Queue is empty!");
            } else {
                statusLabel.setText("Status: Next to be served → " + queue.peek());
            }
        } 
        else if (e.getSource() == clearBtn) {
            queue.clear();
            statusLabel.setText("Status: Queue cleared!");
            updateQueueDisplay();
        }
    }

    //Queue Display Update
    private void updateQueueDisplay() {
        queuePanel.removeAll();

        int index = 0;
        for (String person : queue) {
            Label lbl = new Label(person);
            lbl.setPreferredSize(new Dimension(90, 40));
            lbl.setAlignment(Label.CENTER);
            lbl.setFont(new Font("Arial", Font.BOLD, 12));

            // Highlight the first person (front of queue)
            if (index == 0) {
                lbl.setBackground(Color.GREEN); // front person
                lbl.setForeground(Color.BLACK);
            } else {
                lbl.setBackground(Color.WHITE);
                lbl.setForeground(Color.BLUE);
            }

            lbl.setPreferredSize(new Dimension(80, 30));
            lbl.setAlignment(Label.CENTER);
            queuePanel.add(lbl);
            index++;
        }

        countLabel.setText("Current Queue: " + queue.size());
        maxLabel.setText("Max Queue Length: " + maxQueueLength);

        queuePanel.revalidate();
        queuePanel.repaint();
    }

    public static void main(String[] args) {
        new Queue_Managementsys();
    }
}