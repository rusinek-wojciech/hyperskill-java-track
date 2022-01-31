package org.ikinsure.tictactoeai;

import org.ikinsure.tictactoeai.io.View;
import org.ikinsure.tictactoeai.playable.Playable;

import java.util.InputMismatchException;

public class Game {

    private final View view;
    private final Board board;
    private final Playable xPlayer;
    private final Playable oPlayer;

    public Game(View view, int size, Playable xPlayer, Playable oPlayer) {
        this.view = view;
        this.board = new Board(size);
        this.xPlayer = xPlayer;
        this.oPlayer = oPlayer;
    }

    public void run() {

        State state = State.PLAY;
        boolean even = true;

        while (state == State.PLAY) {

            view.out(board.getBoard());

            if (even) {
                xPlayer.move(Field.X, board);
                state = board.checkState(Field.X);
            } else {
                oPlayer.move(Field.O, board);
                state = board.checkState(Field.O);
            }

            even = !even;
        }

        view.out(board.getBoard());
        view.out(state.getMsg());
    }

}
