class Player {
    String name = " ";
    String symbol = " ";
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

    String getSymbol() {
        return this.symbol;
    }

    void setSymbol(String input) {
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