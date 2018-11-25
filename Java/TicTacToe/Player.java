class Player {
    String name = " ";
    char symbol = ' ';
    int score = 0;
    boolean turn = false;

    Player() { // Constructor
    }

    String getName() {
        return this.name;
    }

    void setName(String input) {
        this.name = input;
    }

    char getSymbol() {
        return this.symbol;
    }

    void setSymbol(char input) {
        this.symbol = input;
    }

    int getScore() {
        return this.score;
    }

    void setScore(int input) {
        this.score = input;
    }

    boolean getTurn() {
        return this.turn;
    }

    void setTurn(boolean input) {
        this.turn = input;
    }
}