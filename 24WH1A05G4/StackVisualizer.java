package project;


import javax.swing.*;
import java.awt.*;

public class StackVisualizer extends JFrame {

    // ---------------- STACK CLASS ----------------
    class Stack {
        int[] arr;
        int top = -1;

        Stack(int size) { arr = new int[size]; }

        boolean push(int v) {
            if (top == arr.length - 1) return false;
            arr[++top] = v;
            return true;
        }

        Integer pop() {
            return (top == -1) ? null : arr[top--];
        }

        Integer peek() {
            return (top == -1) ? null : arr[top];
        }

        void clear() { top = -1; }
    }

    // -------------- STACK PANEL (DRAWING) --------------
    class StackPanel extends JPanel {
        public StackPanel() { setPreferredSize(new Dimension(200, 400)); }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int y = 350;
            for (int i = 0; i <= stack.top; i++) {
                int boxY = y - i * 45;
                g.setColor(Color.CYAN);
                g.fillRect(50, boxY, 100, 40);

                g.setColor(Color.BLACK);
                g.drawRect(50, boxY, 100, 40);

                g.drawString(String.valueOf(stack.arr[i]), 95, boxY + 25);
            }
        }
    }

    // ---------------- GUI COMPONENTS ----------------
    Stack stack = new Stack(10);
    StackPanel panel = new StackPanel();
    JTextField input = new JTextField(10);
    JTextArea log = new JTextArea();

    public StackVisualizer() {
        setTitle("Stack Visualizer");
        setSize(400, 500); // increased height for log
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ----- top panel -----
        JPanel top = new JPanel();
        JButton push = new JButton("Push");
        JButton pop = new JButton("Pop");
        JButton peek = new JButton("Peek");
        JButton clear = new JButton("Clear");

        top.add(new JLabel("Enter Element:"));
        top.add(input);
        top.add(push); top.add(pop); top.add(peek); top.add(clear);
        add(top, BorderLayout.NORTH);

        // center panel
        add(panel, BorderLayout.CENTER);

        // log
        log.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(log);
        scrollPane.setPreferredSize(new Dimension(400, 100)); // ensures visible log
        add(scrollPane, BorderLayout.SOUTH);

        // -------- BUTTON ACTIONS --------
        push.addActionListener(e -> {
            try {
                int v = Integer.parseInt(input.getText());
                if (!stack.push(v))
                    JOptionPane.showMessageDialog(this, "Stack Overflow!");
                else log.append("Pushed: " + v + "\n");
                panel.repaint();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Enter valid number");
            }
        });

        pop.addActionListener(e -> {
            Integer v = stack.pop();
            if (v == null) JOptionPane.showMessageDialog(this, "Stack Underflow!");
            else log.append("Popped: " + v + "\n");
            panel.repaint();
        });

        peek.addActionListener(e -> {
            Integer v = stack.peek();
            JOptionPane.showMessageDialog(this, (v == null) ? "Empty Stack" : "Top: " + v);
        });

        clear.addActionListener(e -> {
            stack.clear();
            log.append("Stack Cleared\n");
            panel.repaint();
        });
    }

    public static void main(String[] args) {
        new StackVisualizer().setVisible(true);
    }
}
