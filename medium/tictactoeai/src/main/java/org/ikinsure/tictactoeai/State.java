package org.ikinsure.tictactoeai;

/**
 * All possible states of Tic-Tac-Toe game
 */
public enum State {

    START("Game is starting"),
    EXIT("Game is closing"),

    PLAY("Game not finished"),
    DRAW("Draw"),
    WIN_X("X wins"),
    WIN_O("O wins");

    private final String msg;

    State(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
