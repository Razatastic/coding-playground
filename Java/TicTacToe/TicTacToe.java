import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What is Player 1's name?");
        Player one = new Player(name.nextLine(), 'X');
        System.out.println("What is Player 2's name?");
        Player two = new Player(name.nextLine(), 'O');
        name.close();

        Game test = new Game(one, two);
        System.out.println(test);
        // System.out.println(one.getScore());
        // one.setScore(10);
        // System.out.println(one.getScore());
    }
}

class Player {
    String name = "";
    char symbol = ' ';
    int score = 0;

    Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    int getScore() {
        return this.score;
    }

    void setScore(int input) {
        this.score = input;
    }
}

class Game {
    Player winner;
    final char[][] board = { { '-', '-', '-' }, { '-', '-', '-' }, { '-', '-', '-' } };
    boolean gameState = true, roundState = true;

    Game(Player one, Player two) {
        while (gameState) {
            if (roundState = true) {
                getInput();
                roundState = false;
            } else {
                printBoard();
                // roundState = true;
            }
        }
        if (gameState == false) {
            if (one.getScore() > two.getScore()) {
                this.winner = one;
                System.out.println("YER");
            } else {
                this.winner = two;
            }
        }
    }

    void getInput() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < board.length; i++) {
            System.out.println("Where would you like to place your symbol? Please enter a value from 1 to 9");
            int input = sc.nextInt();
            if (input == 0) {
                System.out.println("YER");
            }
        }
        sc.close();
    }

    void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // boolean boardFilled() { // Check if board is filled (if it is, then update
    // the gameState to false)
    // for (int i = 0; i < board.length; i++) {
    // if (board.charAt[i] != '-') {
    // return true;
    // }
    // }
    // return false;
    // }

}