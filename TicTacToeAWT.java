import java.awt.*;
import java.awt.event.*;

public class TicTacToeAWT extends Frame {
    private Button[][] buttons;
    private char currentPlayer;

    public TicTacToeAWT() {
        buttons = new Button[3][3];
        currentPlayer = 'X';
        initializeBoard();
        createGUI();
    }

    private void initializeBoard() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new Button("-");
                buttons[row][col].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 48));
                buttons[row][col].addActionListener(new ButtonClickListener(row, col));
            }
        }
    }

    private void createGUI() {
        setLayout(new GridLayout(3, 3));

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                add(buttons[row][col]);
            }
        }

        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private void makeMove(int row, int col) {
        buttons[row][col].setLabel(Character.toString(currentPlayer));
        buttons[row][col].setEnabled(false);
    }

    private boolean checkWin() {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (buttons[row][0].getLabel().equals(Character.toString(currentPlayer))
                    && buttons[row][1].getLabel().equals(Character.toString(currentPlayer))
                    && buttons[row][2].getLabel().equals(Character.toString(currentPlayer))) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < 3; col++) {
            if (buttons[0][col].getLabel().equals(Character.toString(currentPlayer))
                    && buttons[1][col].getLabel().equals(Character.toString(currentPlayer))
                    && buttons[2][col].getLabel().equals(Character.toString(currentPlayer))) {
                return true;
            }
        }

        // Check diagonals
        if (buttons[0][0].getLabel().equals(Character.toString(currentPlayer))
                && buttons[1][1].getLabel().equals(Character.toString(currentPlayer))
                && buttons[2][2].getLabel().equals(Character.toString(currentPlayer))) {
            return true;
        }
        if (buttons[0][2].getLabel().equals(Character.toString(currentPlayer))
                && buttons[1][1].getLabel().equals(Character.toString(currentPlayer))
                && buttons[2][0].getLabel().equals(Character.toString(currentPlayer))) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getLabel().equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    private class ButtonClickListener implements ActionListener {
        private int row;
        private int col;

        public ButtonClickListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public void actionPerformed(ActionEvent event) {
            makeMove(row, col);
            if (checkWin()) {
                JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " wins!");
                System.exit(0);
            } else if (isBoardFull()) {
                JOptionPane.showMessageDialog(null, "It's a draw!");
                System.exit(0);
            } else {
                switchPlayer();
            }
        }
    }

    public static void main(String[] args) {
        new TicTacToeAWT();
    }
}
