import java.util.*;

public class TicTacToe {

    static Scanner scn;
    static Player playerOne, playerTwo, currentPlayer;
    static String[] board; // Create board array
    static boolean gameState;

    static void playTurn() {
        int input = 0;
        System.out.println("Where would you like to place your symbol, " + currentPlayer.getName() + "?");
        while (input < 1 || input > 9) { // Validate input (check if it is a number between 1 to 9)
            try {
                input = scn.nextInt();
                if (input < 1 || input > 9) {
                    System.out.println("Please enter a number between 1 to 9.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scn.next();
            }
        }

        input -= 1;

        if (board[input] == playerOne.getSymbol() || board[input] == playerTwo.getSymbol()) { // If spot is not already
                                                                                              // filled, set it.
                                                                                              // Otherwise, throw an
                                                                                              // error message.
            System.out.println("Sorry, this spot is already filled.");
            playTurn();
        } else {
            board[input] = currentPlayer.getSymbol();
        }
    }

    static void checkWinConditions() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            if (line.equals("XXX")) {
                playerOne.setScore(1);
                gameState = false;
            } else if (line.equals("OOO")) {
                playerTwo.setScore(1);
                gameState = false;
            }
        }

        for (int i = 0; i < 9; i++) { // Check if any values between 1 to 9 are still on the board. If not, then that
                                      // means the board is filled and it is a draw.
            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                break;
            } else if (i == 8) {
                gameState = false;
            }
        }
    }

    // Print Functions
    static void printGreeting() { // Print initial greeting to players
        System.out.println("What is Player 1's name?");
        playerOne.setName(scn.nextLine());
        playerOne.setSymbol("X");
        System.out.println("What is Player 2's name?");
        playerTwo.setName(scn.nextLine());
        playerTwo.setSymbol("O");
    }

    static void printBoard() { // Print out the board (for 2D array)
        System.out.println("-------------");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("-------------");
    }

    static void printResult() { // Print the end game result
        printBoard();
        if (playerOne.getScore() > playerTwo.getScore()) {
            System.out.println(playerOne.getName() + " wins!");
        } else if (playerOne.getScore() < playerTwo.getScore()) {
            System.out.println(playerTwo.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    public static void main(String[] args) {
        scn = new Scanner(System.in); // Create scanner to take in user input
        // Create two player objects
        playerOne = new Player();
        playerTwo = new Player();
        currentPlayer = new Player();
        board = new String[9];
        // Initialize board array
        for (int i = 0; i < board.length; i++) {
            board[i] = String.valueOf(i + 1);
        }

        // Start the game
        printGreeting();
        playerOne.setTurn(true);
        gameState = true;

        while (gameState) {
            printBoard();
            if (playerOne.getTurn()) {
                currentPlayer = playerOne;
                playTurn();
                playerOne.setTurn(false);
            } else {
                currentPlayer = playerTwo;
                playTurn();
                playerOne.setTurn(true);
            }
            checkWinConditions();
        }

        if (!gameState) {
            scn.close(); // Close scanner (to avoid memory leaks)
            printResult();
        }
    }
}