import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Player one = new Player(), two = new Player(); // Create two player objects
        Board gameBoard = new Board();

        // gameBoard.printBoard();
        gameStart(scn, one, two, gameBoard);
        // System.out.println(one.getName());

        // getInput(one, scn);

        scn.close(); // Close scanner (to avoid memory leaks)
    }

    static void gameStart(Scanner scn, Player one, Player two, Board gameBoard) {
        boolean roundState = true, winConditionMet = false;

        printGreeting(scn, one, two);
        one.setTurn(true); // Set player one's turn to true

        while (roundState) {
            while (!winConditionMet) {
                if (one.getTurn()) {
                    getInput(one, scn);
                } else {
                    getInput(two, scn);
                }
                gameBoard.printBoard();
            }
        }
        printResult(one, two);
    }

    static void printGreeting(Scanner scn, Player one, Player two) {
        System.out.println("What is Player 1's name?");
        one.setName(scn.nextLine());
        one.setSymbol('x');
        System.out.println("What is Player 2's name?");
        two.setName(scn.nextLine());
        two.setSymbol('o');
    }

    // static int getRow(Player currentPlayer, Scanner sc) {

    // }

    static int[] getInput(Player currentPlayer, Scanner sc) { // Get the location of where the player wants to put their
                                                              // symbol
        int row = 0;
        int column = 0;
        int[] inputs = { row, column };
        System.out.println("What row would you like to place your symbol, " + currentPlayer.getName() + "?");
        try {
            row = Integer.parseInt(sc.nextLine());
            if (row < 1 || row > 3) {
                System.out.println("Please enter a value in the range 1-3.");
            } else {
                column = Integer.parseInt(sc.nextLine());
                System.out.println("What column would you like to place your symbol, " + currentPlayer.getName() + "?");
                if (column < 1 || column > 3) {
                    System.out.println("Please enter a value in the range 1-3.");
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Input is not a number.");
        }
        return inputs;
    }

    static void printResult(Player one, Player two) { // Print the end game result
        if (one.getScore() > two.getScore()) {
            System.out.println("Player 1 wins this round!");
        } else if (one.getScore() < two.getScore()) {
            System.out.println("Player 2 wins this round!");
        } else {
            System.out.println("It's a draw!");
        }
    }

    static void reset(Player one, Player two) { // Reset players score back to zero
        one.setScore(0);
        two.setScore(0);
    }
}