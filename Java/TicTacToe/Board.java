class Board {
    final static char[][] board = { { '|', '-', '-', '-', '|' }, { '|', '-', '-', '-', '|' },
            { '|', '-', '-', '-', '|' } };
    // int boardSize = 9;
    // final static char[] board = new char[9];

    Board() { // Constructor
        // initializeBoard();
    }

    void printBoard() { // Print out the board (for 2D array)
        System.out.println("Row");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("    " + 1 + " " + 2 + " " + 3);
        System.out.println("    Column");
    }

    void setValue(int row, int col, Player currentPlayer) {
        if (board[row][col] == '-') {
            board[row][col] = currentPlayer.getSymbol();
        } else {
            System.out.println("Illegal play! Please try again.");
        }
    }

    // void initializeBoard() {
    // for (int i = 0; i < boardSize; i++) {
    // board[i] = '-';
    // num++;
    // }
    // }

    // void printBoard() {
    // for (int i = 0; i < 3; i++) {
    // for (int j = 0; j < 3; j++) {
    // System.out.print(board[i] + " ");
    // }
    // System.out.println(); // Print new line
    // }
    // }
}