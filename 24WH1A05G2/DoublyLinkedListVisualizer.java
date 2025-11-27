package weekn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Doubly Linked List visualizer using Java Swing.
 * Data structure and GUI are separated as required.
 */
public class DoublyLinkedListVisualizer extends JFrame {

    // ---------- DATA STRUCTURE ----------
    static class DoublyLinkedList {

        static class Node {
            int data;
            Node prev, next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node head;
        private Node tail;

        public Node getHead() {
            return head;
        }

        public void insert(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public boolean delete(int value) {
            Node current = head;
            while (current != null) {
                if (current.data == value) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    } else {
                        tail = current.prev;
                    }
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public boolean find(int value) {
            Node current = head;
            while (current != null) {
                if (current.data == value) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        public List<Integer> toList() {
            List<Integer> list = new ArrayList<>();
            Node current = head;
            while (current != null) {
                list.add(current.data);
                current = current.next;
            }
            return list;
        }

        @Override
        public String toString() {
            List<Integer> list = toList();
            if (list.isEmpty()) {
                return "List is empty";
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                if (i != list.size() - 1) {
                    sb.append(" <-> ");
                }
            }
            return sb.toString();
        }
    }

    // ---------- VISUALIZATION PANEL ----------
    static class ListCanvas extends JPanel {
        private final DoublyLinkedList list;
        private Integer highlightValue = null;

        public ListCanvas(DoublyLinkedList list) {
            this.list = list;
            setBackground(new Color(240, 255, 240)); // light green-ish
        }

        public void setHighlightValue(Integer value) {
            this.highlightValue = value;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            DoublyLinkedList.Node current = list.getHead();
            if (current == null) {
                // nothing to draw
                return;
            }

            int x = 40;
            int y = getHeight() / 2;
            int nodeWidth = 60;
            int nodeHeight = 40;
            int gap = 40; // space between nodes

            while (current != null) {
                // Determine if this node should be highlighted (for Find)
                boolean highlight = (highlightValue != null && current.data == highlightValue);

                // Node rectangle
                if (highlight) {
                    g2.setColor(new Color(255, 230, 128)); // highlight color
                } else {
                    g2.setColor(Color.WHITE);
                }
                g2.fillRoundRect(x, y - nodeHeight / 2, nodeWidth, nodeHeight, 20, 20);

                g2.setColor(new Color(0, 128, 0)); // dark green border
                g2.setStroke(new BasicStroke(2f));
                g2.drawRoundRect(x, y - nodeHeight / 2, nodeWidth, nodeHeight, 20, 20);

                // Text (value)
                String text = String.format("%d", current.data);
                FontMetrics fm = g2.getFontMetrics();
                int tx = x + (nodeWidth - fm.stringWidth(text)) / 2;
                int ty = y + fm.getAscent() / 2 - 2;
                g2.setColor(Color.BLACK);
                g2.drawString(text, tx, ty);

                // Draw arrows to next node
                if (current.next != null) {
                    int startX = x + nodeWidth;
                    int endX = x + nodeWidth + gap;
                    int lineY = y;

                    // forward arrow (head -> tail)
                    g2.setColor(Color.BLACK);
                    g2.setStroke(new BasicStroke(1.8f));
                    g2.drawLine(startX, lineY - 8, endX, lineY - 8);
                    drawArrowHead(g2, startX, lineY - 8, endX, lineY - 8);

                    // backward arrow (tail -> head)
                    g2.drawLine(endX, lineY + 8, startX, lineY + 8);
                    drawArrowHead(g2, endX, lineY + 8, startX, lineY + 8);
                }

                x += nodeWidth + gap;
                current = current.next;
            }
        }

        private void drawArrowHead(Graphics2D g2, int x1, int y1, int x2, int y2) {
            double phi = Math.toRadians(20);
            int barb = 10;

            double dy = y2 - y1;
            double dx = x2 - x1;
            double theta = Math.atan2(dy, dx);
            double rho = theta + phi;
            for (int j = 0; j < 2; j++) {
                double x = x2 - barb * Math.cos(rho);
                double y = y2 - barb * Math.sin(rho);
                g2.drawLine(x2, y2, (int) x, (int) y);
                rho = theta - phi;
            }
        }
    }

    // ---------- GUI COMPONENTS ----------
    private final DoublyLinkedList list = new DoublyLinkedList();
    private final JTextField inputField = new JTextField(6);
    private final JTextArea outputArea = new JTextArea(3, 40);
    private final ListCanvas canvas = new ListCanvas(list);

    public DoublyLinkedListVisualizer() {
        setTitle("Doubly Linked List Visualization");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top panel (controls)
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBackground(new Color(0, 102, 51)); // dark green

        JLabel titleLabel = new JLabel("Doubly Linked List");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        topPanel.add(titleLabel);

        topPanel.add(Box.createHorizontalStrut(40));

        JLabel valueLabel = new JLabel("Value: ");
        valueLabel.setForeground(Color.WHITE);
        topPanel.add(valueLabel);

        topPanel.add(inputField);

        JButton insertButton = new JButton("Insert");
        JButton deleteButton = new JButton("Delete");
        JButton findButton = new JButton("Find");
        JButton printButton = new JButton("Print");

        topPanel.add(insertButton);
        topPanel.add(deleteButton);
        topPanel.add(findButton);
        topPanel.add(printButton);

        add(topPanel, BorderLayout.NORTH);

        // Center canvas
        add(canvas, BorderLayout.CENTER);

        // Bottom output area
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.SOUTH);

        // Button actions
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer value = readInput();
                if (value != null) {
                    list.insert(value);
                    canvas.setHighlightValue(value);
                    outputArea.setText("Inserted: " + value + "\nCurrent List:\n" + list);
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer value = readInput();
                if (value != null) {
                    boolean removed = list.delete(value);
                    canvas.setHighlightValue(null);
                    if (removed) {
                        outputArea.setText("Deleted: " + value + "\nCurrent List:\n" + list);
                    } else {
                        outputArea.setText("Value " + value + " not found.\nCurrent List:\n" + list);
                    }
                    canvas.repaint();
                }
            }
        });

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer value = readInput();
                if (value != null) {
                    boolean found = list.find(value);
                    if (found) {
                        canvas.setHighlightValue(value);
                        outputArea.setText("Found: " + value + "\nCurrent List:\n" + list);
                    } else {
                        canvas.setHighlightValue(null);
                        outputArea.setText("Value " + value + " not found.\nCurrent List:\n" + list);
                    }
                }
            }
        });

        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.setHighlightValue(null);
                outputArea.setText("Current List:\n" + list);
            }
        });
    }

    private Integer readInput() {
        String text = inputField.getText().trim();
        if (text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a value.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter an integer value.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DoublyLinkedListVisualizer frame = new DoublyLinkedListVisualizer();
            frame.setVisible(true);
        });
    }
}