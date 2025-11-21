package javaAssigmant;
import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    private boolean wall = false;
    private final int row, col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
    }

    public boolean isWall() {
        return wall;
    }

    public void toggleWall() {
        wall = !wall;
        setBackground(wall ? Color.BLACK : Color.WHITE);
    }

    public void reset() {
        wall = false;
        setBackground(Color.WHITE);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}

