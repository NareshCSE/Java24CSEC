package assignments;

import javax.swing.*;
import java.awt.*;

public class StackVisualizerProject extends JFrame {
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

 
    Stack stack = new Stack(10);
    StackPanel panel = new StackPanel();
    JTextField input = new JTextField(10);
    JTextArea log = new JTextArea();

    public StackVisualizerProject() {
        setTitle("Stack Visualizer");
        setSize(400, 500); 
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel top = new JPanel();
        JButton push = new JButton("Push");
        JButton pop = new JButton("Pop");
        JButton peek = new JButton("Peek");
        JButton clear = new JButton("Clear");

        top.add(new JLabel("Enter Element:"));
        top.add(input);
        top.add(push); top.add(pop); top.add(peek); top.add(clear);
        add(top, BorderLayout.NORTH);

        add(panel, BorderLayout.CENTER);

        log.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(log);
        scrollPane.setPreferredSize(new Dimension(400, 100)); // ensures visible log
        add(scrollPane, BorderLayout.SOUTH);

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
        new StackVisualizerProject().setVisible(true);
    }
}
