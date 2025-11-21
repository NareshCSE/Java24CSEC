package javaAssigmant;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class MazeSolver {
    private final int rows, cols;
    private final Cell[][] grid;
    private final Point start, end;

    // Directions: up, down, left, right
    private final int[] rowDir = {-1, 1, 0, 0};
    private final int[] colDir = {0, 0, -1, 1};

    // Node class embedded
    private static class Node {
        int x, y;
        Node parent;

        Node(int x, int y, Node parent) {
            this.x = x;
            this.y = y;
            this.parent = parent;
        }
    }

    public MazeSolver(Cell[][] grid, Point start, Point end) {
        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid[0].length;
        this.start = start;
        this.end = end;
    }

    public void solve() {
        boolean[][] visited = new boolean[rows][cols];
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start.x, start.y, null));
        visited[start.x][start.y] = true;

        Node endNode = null;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.x == end.x && current.y == end.y) {
                endNode = current;
                break;
            }

            for (int i = 0; i < 4; i++) {
                int newX = current.x + rowDir[i];
                int newY = current.y + colDir[i];

                if (isValid(newX, newY, visited)) {
                    visited[newX][newY] = true;
                    queue.add(new Node(newX, newY, current));
                }
            }
        }

        if (endNode != null) {
            highlightPath(endNode);
        } else {
            JOptionPane.showMessageDialog(null, "No path found!");
        }
    }

    private boolean isValid(int x, int y, boolean[][] visited) {
        return x >= 0 && x < rows && y >= 0 && y < cols &&
               !visited[x][y] && !grid[x][y].isWall();
    }

    private void highlightPath(Node endNode) {
        int steps = 0;
        Node current = endNode;
        while (current.parent != null) {
            if (!(current.x == end.x && current.y == end.y) &&
                !(current.x == start.x && current.y == start.y)) {
                grid[current.x][current.y].setBackground(Color.CYAN);
            }
            current = current.parent;
            steps++;
        }
        JOptionPane.showMessageDialog(null, "Shortest path found with steps: " + steps);
    }
}
