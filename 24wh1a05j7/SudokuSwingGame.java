import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * Full Sudoku Swing Game (single-file)
 * - Menu to pick difficulty
 * - Play board with validation, undo, check highlights, solve (show solution) and submit
 */
public class SudokuSwingGame extends JFrame {

    // ==========================================================
    //  MENUS
    // ==========================================================
    private JPanel menuPanel;       // front page
    private JPanel gamePanel;       // sudoku board
    private JRadioButton easyBtn, mediumBtn, hardBtn;
    private JButton startBtn;

    // ==========================================================
    //  GAME VARIABLES
    // ==========================================================
    private int[][] board = new int[9][9];           // current live board
    private int[][] solution = new int[9][9];        // solved board
    private JTextField[][] cells = new JTextField[9][9];
    private boolean[][] isPrefilled = new boolean[9][9];
    private int[][] initialPuzzle = new int[9][9];

    private HashSet<Integer>[] rows = new HashSet[9];
    private HashSet<Integer>[] cols = new HashSet[9];
    private HashSet<Integer>[][] boxes = new HashSet[3][3];

    private Stack<Move> undoStack = new Stack<>();
    private boolean checkOn = false;

    static class Move { int row, col, val; Move(int r, int c, int v) { row=r; col=c; val=v; } }

    public SudokuSwingGame() {
        super("Sudoku Swing Game (By 24-5J7,24-5J6,24-5H9)");
        initDS();
        initMenuScreen(); // MENU FIRST
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // ==========================================================
    //  INIT DATA STRUCTURES
    // ==========================================================
    private void initDS() {
        for (int i=0;i<9;i++) { rows[i]=new HashSet<>(); cols[i]=new HashSet<>(); }
        for (int r=0;r<3;r++) for (int c=0;c<3;c++) boxes[r][c] = new HashSet<>();
    }

    // ==========================================================
    //  MENU SCREEN
    // ==========================================================
    private void initMenuScreen() {
        menuPanel = new JPanel();
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBorder(new EmptyBorder(50,50,50,50));

        JLabel title = new JLabel("Select Sudoku Level");
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        easyBtn = new JRadioButton("Easy");
        mediumBtn = new JRadioButton("Medium");
        hardBtn = new JRadioButton("Hard");
        easyBtn.setSelected(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(easyBtn); bg.add(mediumBtn); bg.add(hardBtn);

        startBtn = new JButton("Start Game");
        startBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        startBtn.addActionListener(e -> startGame());

        menuPanel.add(title);
        menuPanel.add(Box.createVerticalStrut(40));
        menuPanel.add(easyBtn);
        menuPanel.add(mediumBtn);
        menuPanel.add(hardBtn);
        menuPanel.add(Box.createVerticalStrut(40));
        menuPanel.add(startBtn);

        getContentPane().setLayout(new BorderLayout());
        add(menuPanel, BorderLayout.CENTER);
    }

    // ==========================================================
    //  START GAME
    // ==========================================================
    private void startGame() {
        remove(menuPanel);
        initGUI();
        loadPuzzleByDifficulty();
        solveForSolution();
        revalidate(); repaint();
    }

    // ==========================================================
    //  DIFFICULTY PUZZLES
    // ==========================================================
    private void loadPuzzleByDifficulty() {
        int[][] puzzle;
        if (easyBtn.isSelected()) puzzle = EASY_PUZZLE;
        else if (mediumBtn.isSelected()) puzzle = MEDIUM_PUZZLE;
        else puzzle = HARD_PUZZLE;

        // clear board structures
        for (int r=0;r<9;r++) {
            rows[r].clear();
            cols[r].clear();
        }
        for (int br=0;br<3;br++) for (int bc=0;bc<3;bc++) boxes[br][bc].clear();
        undoStack.clear();

        for (int r=0;r<9;r++) for (int c=0;c<9;c++) {
            int val = puzzle[r][c];
            board[r][c] = val;
            initialPuzzle[r][c] = val;
            if(val!=0) {
                rows[r].add(val); cols[c].add(val); boxes[r/3][c/3].add(val);
                cells[r][c].setText(""+val);
                cells[r][c].setEditable(false);
                cells[r][c].setForeground(Color.BLACK);
                isPrefilled[r][c] = true;
                cells[r][c].setBackground(Color.WHITE);
            } else {
                isPrefilled[r][c] = false;
                cells[r][c].setText("");
                cells[r][c].setEditable(true);
                cells[r][c].setForeground(Color.BLUE);
                cells[r][c].setBackground(Color.WHITE);
            }
        }
    }

    // SAMPLE PUZZLES
    private final int[][] EASY_PUZZLE = {
        {5,3,0,0,7,0,0,0,0}, {6,0,0,1,9,5,0,0,0}, {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3}, {4,0,0,8,0,3,0,0,1}, {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0}, {0,0,0,4,1,9,0,0,5}, {0,0,0,0,8,0,0,7,9}
    };

    private final int[][] MEDIUM_PUZZLE = {
        {0,0,3,0,2,0,6,0,0}, {9,0,0,3,0,5,0,0,1}, {0,0,1,8,0,6,4,0,0},
        {0,0,8,1,0,2,9,0,0}, {7,0,0,0,0,0,0,0,8}, {0,0,6,7,0,8,2,0,0},
        {0,0,2,6,0,9,5,0,0}, {8,0,0,2,0,3,0,0,9}, {0,0,5,0,1,0,3,0,0}
    };

    private final int[][] HARD_PUZZLE = {
        {0,0,0,0,0,0,0,1,2}, {0,0,0,0,0,7,0,0,0}, {0,0,1,0,9,0,0,0,0},
        {0,0,0,5,0,0,4,0,7}, {0,0,2,0,0,0,3,0,0}, {8,0,9,0,0,4,0,0,0},
        {0,0,0,0,7,0,5,0,0}, {0,0,0,3,0,0,0,0,0}, {6,4,0,0,0,0,0,0,0}
    };

    // ==========================================================
    //  GAME UI (original board)
    // ==========================================================
    private void initGUI() {
        gamePanel = new JPanel(new BorderLayout());
        JPanel boardPanel = new JPanel(new GridLayout(9,9));
        Font f = new Font("Arial", Font.BOLD, 20);

        for (int r=0;r<9;r++) for (int c=0;c<9;c++) {
            JTextField tf = new JTextField();
            tf.setHorizontalAlignment(JTextField.CENTER);
            tf.setFont(f);

            int top = (r%3==0)?3:1;
            int left = (c%3==0)?3:1;
            int bottom = (r==8)?3:1;
            int right = (c==8)?3:1;
            tf.setBorder(new MatteBorder(top,left,bottom,right,Color.BLACK));

            final int row=r, col=c;

            // Use both keyTyped (for digits) and keyPressed (for delete/backspace).
            tf.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    if (isPrefilled[row][col]) { e.consume(); return; }
                    char ch = e.getKeyChar();
                    if (ch >= '1' && ch <= '9') {
                        // only allow a single character in the field (replace existing)
                        int val = ch - '0';
                        // Validate placement before committing
                        if (canPlace(row, col, val)) {
                            place(row, col, val);
                            tf.setText(""+val);
                            tf.setForeground(Color.BLUE);
                            if (checkOn) updateCheckHighlightsCell(row,col);
                        } else {
                            Toolkit.getDefaultToolkit().beep();
                        }
                        // consume in all cases to prevent default insertion that caused duplicates
                        e.consume();
                    } else {
                        // disallow any other printable characters
                        e.consume();
                    }
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (isPrefilled[row][col]) { return; }
                    int code = e.getKeyCode();
                    if (code == KeyEvent.VK_BACK_SPACE || code == KeyEvent.VK_DELETE) {
                        // clear cell
                        undoMove(row, col);
                        tf.setText("");
                        tf.setBackground(Color.WHITE);
                        if (checkOn) updateCheckHighlightsCell(row,col);
                        // consume so default handling doesn't cause weirdness
                        e.consume();
                    }
                }
            });

            cells[r][c] = tf;
            boardPanel.add(tf);
        }

        JPanel buttons = new JPanel();
        JButton solve = new JButton("Solve (Show Solution)");
        JButton undo = new JButton("Undo");
        JButton check = new JButton("Check (Toggle)");
        JButton submit = new JButton("Submit");

        solve.addActionListener(e -> { refreshGUISolved(); });

        undo.addActionListener(e -> {
            if (!undoStack.isEmpty()) {
                Move m = undoStack.pop();
                // remove the move value only if cell currently equals that value
                if (board[m.row][m.col] == m.val) {
                    board[m.row][m.col] = 0;
                    rows[m.row].remove(m.val);
                    cols[m.col].remove(m.val);
                    boxes[m.row/3][m.col/3].remove(m.val);
                    cells[m.row][m.col].setText("");
                    cells[m.row][m.col].setBackground(Color.WHITE);
                    if (checkOn) updateCheckHighlightsCell(m.row, m.col);
                }
            }
        });

        check.addActionListener(e -> {
            checkOn = !checkOn;
            if (checkOn) showCheckHighlights();
            else removeCheckHighlights();
        });

        submit.addActionListener(e -> {
            if (isBoardCorrect()) JOptionPane.showMessageDialog(this,"Correct!");
            else JOptionPane.showMessageDialog(this,"Incorrect!");
        });

        buttons.add(solve); buttons.add(undo); buttons.add(check); buttons.add(submit);

        gamePanel.add(boardPanel, BorderLayout.CENTER);
        gamePanel.add(buttons, BorderLayout.SOUTH);
        add(gamePanel, BorderLayout.CENTER);
    }

    // ==========================================================
    //  SOLVER + CHECK
    // ==========================================================
    // Solve into 'solution' (not mutating current board)
    private void solveForSolution() {
        // copy initialPuzzle into solution
        for (int r=0;r<9;r++) for (int c=0;c<9;c++) solution[r][c] = initialPuzzle[r][c];
        // use backtracking solver on solution
        solveSudoku(solution);
    }

    // Backtracking solver against arbitrary board 'b'
    private boolean solveSudoku(int[][] b) {
        for(int r=0;r<9;r++) for(int c=0;c<9;c++) if(b[r][c]==0) {
            for(int v=1;v<=9;v++) if(isValidTemp(b,r,c,v)) {
                b[r][c]=v;
                if(solveSudoku(b)) return true;
                b[r][c]=0;
            }
            return false;
        }
        return true;
    }

    // Validation used by solver (checks within board b)
    private boolean isValidTemp(int[][] b, int r, int c, int val) {
        for (int k=0;k<9;k++) if (b[r][k]==val || b[k][c]==val) return false;
        int br = (r/3)*3, bc = (c/3)*3;
        for (int i=0;i<3;i++) for (int j=0;j<3;j++) if (b[br+i][bc+j]==val) return false;
        return true;
    }

    // Check if we can place a number at (r,c) given current live structures rows/cols/boxes
    private boolean canPlace(int r, int c, int val) {
        // allow replacing the same value that's already in this cell
        int current = board[r][c];
        if (current == val) return true;
        if (rows[r].contains(val)) return false;
        if (cols[c].contains(val)) return false;
        if (boxes[r/3][c/3].contains(val)) return false;
        return true;
    }

    // Place value into live board with structure updates and push to undo stack
    private void place(int r,int c,int val) {
        // remove old if present
        int old = board[r][c];
        if(old != 0) {
            rows[r].remove(old);
            cols[c].remove(old);
            boxes[r/3][c/3].remove(old);
        }
        board[r][c]=val;
        rows[r].add(val);
        cols[c].add(val);
        boxes[r/3][c/3].add(val);
        undoStack.push(new Move(r,c,val));
    }

    // Undo a single cell (clear)
    private void undoMove(int r,int c) {
        int val = board[r][c];
        if(val!=0) {
            board[r][c]=0;
            rows[r].remove(val);
            cols[c].remove(val);
            boxes[r/3][c/3].remove(val);
        }
    }

    // Fill GUI cells with solution
    private void refreshGUISolved() {
        for(int r=0;r<9;r++) for(int c=0;c<9;c++) {
            cells[r][c].setText(""+solution[r][c]);
            if(!isPrefilled[r][c]) {
                cells[r][c].setForeground(Color.GREEN.darker());
                cells[r][c].setEditable(false);
            }
        }
    }

    private boolean isBoardCorrect() {
        // ensure board equals solution
        for(int r=0;r<9;r++) for(int c=0;c<9;c++) {
            // if a cell is empty or mismatch -> incorrect
            String txt = cells[r][c].getText().trim();
            int v = 0;
            if (!txt.isEmpty()) {
                try { v = Integer.parseInt(txt); } catch(Exception ex) { return false; }
            } else return false;
            if (v != solution[r][c]) return false;
        }
        return true;
    }

    // ==========================================================
    //  CHECK HIGHLIGHTS
    // ==========================================================
    private void showCheckHighlights() {
        for (int r=0;r<9;r++) for (int c=0;c<9;c++) updateCheckHighlightsCell(r,c);
    }

    private void updateCheckHighlightsCell(int r, int c) {
        if (isPrefilled[r][c]) {
            cells[r][c].setBackground(Color.WHITE);
            return;
        }
        String txt = cells[r][c].getText().trim();
        if (txt.isEmpty()) {
            cells[r][c].setBackground(Color.WHITE);
            return;
        }
        int v;
        try { v = Integer.parseInt(txt); } catch (Exception e) { cells[r][c].setBackground(Color.PINK); return; }
        // if value conflicts with solution or invalid placement
        if (solution[r][c] != v) cells[r][c].setBackground(new Color(0xFFCCCC)); // light red
        else cells[r][c].setBackground(new Color(0xCCFFCC)); // light green
    }

    private void removeCheckHighlights() {
        for (int r=0;r<9;r++) for (int c=0;c<9;c++) cells[r][c].setBackground(Color.WHITE);
    }

    // ==========================================================
    //  MAIN
    // ==========================================================
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SudokuSwingGame());
    }
}
