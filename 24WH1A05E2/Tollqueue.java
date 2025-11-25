import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Queue;

class Vehicless {
    String number;
    String type;
    int xPos;
    int yPos = 160;

    Vehicless(String number, String type) {
        this.number = number;
        this.type = type;
        this.xPos = 20; 
    }
}

public class Tollqueue extends JFrame {

    Queue<Vehicless> vehicleQueue = new LinkedList<>();

    JTextField vehicleNumberField;
    JComboBox<String> vehicleTypeBox;
    JPanel displayPanel;
    JLabel queueStatusLabel;

    private final int GATE_X = 700;
    private final int VEHICLE_WIDTH = 100;
    private final int GAP = 20;
    private final int SLOT = VEHICLE_WIDTH + GAP;

    public Tollqueue() {

        setTitle("Toll Gate Vehicle Queue Visualizer");
        setSize(900, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

       
        JPanel topPanel = new JPanel(new FlowLayout());

        topPanel.add(new JLabel("Vehicle Number:"));
        vehicleNumberField = new JTextField(10);
        topPanel.add(vehicleNumberField);

        topPanel.add(new JLabel("Vehicle Type:"));
        vehicleTypeBox = new JComboBox<>(new String[]{"Car", "Bus", "Truck"});
        topPanel.add(vehicleTypeBox);

        JButton addButton = new JButton("Add Vehicle");
        JButton processButton = new JButton("Process Vehicle");
        JButton clearButton = new JButton("Clear Queue");

        topPanel.add(addButton);
        topPanel.add(processButton);
        topPanel.add(clearButton);

        add(topPanel, BorderLayout.NORTH);

        
        displayPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw road
                g.setColor(Color.GRAY);
                g.fillRect(0, 140, getWidth(), 180);

                // Lane lines
                g.setColor(Color.WHITE);
                for (int i = 0; i < getWidth(); i += 60) {
                    g.fillRect(i, 220, 40, 5);
                }

                // Toll Gate
                g.setColor(Color.DARK_GRAY);
                g.fillRect(GATE_X, 100, 150, 15);
                g.fillRect(GATE_X, 100, 15, 120);
                g.fillRect(GATE_X + 135, 100, 15, 120);

                g.setColor(Color.BLACK);
                g.drawString("TOLL GATE", GATE_X + 40, 95);

                // FIFO DRAWING
                int xPosForThis = GATE_X - SLOT;

                for (Vehicless v : vehicleQueue) {

                    // Color
                    switch (v.type) {
                        case "Car" -> g.setColor(Color.BLUE);
                        case "Bus" -> g.setColor(Color.GREEN);
                        default -> g.setColor(Color.RED);
                    }

                    g.fillRect(v.xPos, v.yPos, VEHICLE_WIDTH, 50);
                    g.setColor(Color.WHITE);
                    g.drawString(v.number, v.xPos + 10, v.yPos + 25);

                    xPosForThis -= SLOT;
                }
            }
        };

        displayPanel.setBackground(Color.WHITE);
        add(displayPanel, BorderLayout.CENTER);

        
        queueStatusLabel = new JLabel("Queue Size: 0");
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(queueStatusLabel);
        add(bottomPanel, BorderLayout.SOUTH);

        
        addButton.addActionListener(e -> {
            String number = vehicleNumberField.getText().trim();
            if (number.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter a vehicle number!");
                return;
            }

            String type = (String) vehicleTypeBox.getSelectedItem();
            Vehicless v = new Vehicless(number, type);
            vehicleQueue.add(v);

            animateVehicleToPosition(v);

            vehicleNumberField.setText("");
            updateQueueDisplay();
        });

        
        processButton.addActionListener(e -> {
            if (vehicleQueue.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Queue is empty!");
                return;
            }

            Vehicless first = vehicleQueue.peek();

            Timer t = new Timer(10, new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    first.xPos += 5;

                    if (first.xPos > GATE_X + 20) {
                        ((Timer) evt.getSource()).stop();
                        vehicleQueue.poll();

                        JOptionPane.showMessageDialog(displayPanel,
                                "Vehicle " + first.number + " passed the toll gate!");

                        animateShiftForward();
                        updateQueueDisplay();
                    }
                    displayPanel.repaint();
                }
            });
            t.start();
        });

        
        clearButton.addActionListener(e -> {
            vehicleQueue.clear();
            updateQueueDisplay();
        });

        setVisible(true);
    }

   
    private void animateVehicleToPosition(Vehicless v) {
        int finalPosition = GATE_X - SLOT - ((vehicleQueue.size() - 1) * SLOT);

        Timer anim = new Timer(10, evt -> {
            if (v.xPos < finalPosition) {
                v.xPos += 5;
                displayPanel.repaint();
            } else {
                v.xPos = finalPosition;
                ((Timer) evt.getSource()).stop();
            }
        });

        anim.start();
    }

   
    private void animateShiftForward() {
        Timer shiftTimer = new Timer(10, evt -> {

            int targetX = GATE_X - SLOT;
            boolean allReached = true;

            for (Vehicless v : vehicleQueue) {
                if (v.xPos < targetX) {
                    v.xPos += 5;
                    allReached = false;
                }
                targetX -= SLOT;
            }

            displayPanel.repaint();
            if (allReached) ((Timer) evt.getSource()).stop();
        });

        shiftTimer.start();
    }

    private void updateQueueDisplay() {
        queueStatusLabel.setText("Queue Size: " + vehicleQueue.size());
        displayPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Tollqueue::new);
    }
}
