package javaAssigmant;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MazeSolverGUI extends JFrame {

    private final int ROWS = 10;
    private final int COLS = 10;
    private final int CELL_SIZE = 50;

    private Cell[][] grid = new Cell[ROWS][COLS];
    private Point start = new Point(0, 0);
    private Point end = new Point(ROWS - 1, COLS - 1);

    private JButton solveButton, resetButton;

    public MazeSolverGUI() {
        setTitle("Maze Solver / Path Finder");
        setSize(COLS * CELL_SIZE + 200, ROWS * CELL_SIZE + 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JPanel mazePanel = new JPanel();
        mazePanel.setLayout(new GridLayout(ROWS, COLS));
        mazePanel.setBounds(10, 10, COLS * CELL_SIZE, ROWS * CELL_SIZE);
        add(mazePanel);

        // Initialize grid
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = new Cell(i, j);
                mazePanel.add(grid[i][j]);

                int r = i, c = j;
                grid[i][j].addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent e) {
                        if (!(r == start.x && c == start.y) &&
                            !(r == end.x && c == end.y)) {
                            grid[r][c].toggleWall();
                        }
                    }
                });
            }
        }

        // Set start and end
        grid[start.x][start.y].setBackground(Color.GREEN);
        grid[end.x][end.y].setBackground(Color.RED);

        // Buttons
        solveButton = new JButton("Solve Maze");
        solveButton.setBounds(COLS * CELL_SIZE + 20, 50, 150, 30);
        add(solveButton);

        resetButton = new JButton("Reset Maze");
        resetButton.setBounds(COLS * CELL_SIZE + 20, 100, 150, 30);
        add(resetButton);

        // Button actions
        solveButton.addActionListener(e -> {
            MazeSolver solver = new MazeSolver(grid, start, end);
            solver.solve();
        });

        resetButton.addActionListener(e -> resetMaze());

        setVisible(true);
    }

    private void resetMaze() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j].reset();
            }
        }
        grid[start.x][start.y].setBackground(Color.GREEN);
        grid[end.x][end.y].setBackground(Color.RED);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MazeSolverGUI::new);
    }
}

