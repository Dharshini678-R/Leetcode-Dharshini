// Last updated: 8/11/2026, 4:08:10 PM
class Solution {
    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;

        // Count X's and O's
        for (String row : board) {
            for (char c : row.toCharArray()) {
                if (c == 'X') xCount++;
                else if (c == 'O') oCount++;
            }
        }

        // Invalid counts
        if (oCount > xCount || xCount > oCount + 1) {
            return false;
        }

        boolean xWin = win(board, 'X');
        boolean oWin = win(board, 'O');

        // Both players cannot win simultaneously
        if (xWin && oWin) {
            return false;
        }

        // If X wins, X must have one more move than O
        if (xWin && xCount != oCount + 1) {
            return false;
        }

        // If O wins, both must have played same number of moves
        if (oWin && xCount != oCount) {
            return false;
        }

        return true;
    }

    private boolean win(String[] board, char player) {
        // Rows
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == player &&
                board[i].charAt(1) == player &&
                board[i].charAt(2) == player) {
                return true;
            }
        }

        // Columns
        for (int j = 0; j < 3; j++) {
            if (board[0].charAt(j) == player &&
                board[1].charAt(j) == player &&
                board[2].charAt(j) == player) {
                return true;
            }
        }

        // Diagonals
        if (board[0].charAt(0) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(2) == player) {
            return true;
        }

        if (board[0].charAt(2) == player &&
            board[1].charAt(1) == player &&
            board[2].charAt(0) == player) {
            return true;
        }

        return false;
    }
}