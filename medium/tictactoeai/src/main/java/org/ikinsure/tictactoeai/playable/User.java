package org.ikinsure.tictactoeai.playable;

import org.ikinsure.tictactoeai.Board;
import org.ikinsure.tictactoeai.Field;
import org.ikinsure.tictactoeai.io.View;

import java.util.InputMismatchException;

public class User implements Playable {

    @Override
    public void move(Field field, Board board, View view) {
        while (!input(field, board, view)) {}
    }

    private boolean input(Field field, Board board, View view) {

        int x;
        int y;
        view.out("Enter the coordinates: ");

        try {
            y = view.nextInt() - 1;
            x = view.nextInt() - 1;
        } catch (InputMismatchException e) {
            view.out("You should enter numbers!");
            view.nextString();
            return false;
        }

        if (x < 0 || y < 0 || x >= board.size() || y >= board.size()) {
            view.out("Coordinates should be from 1 to " + board.size() + "!");
            return false;
        }

        if (!board.get(x, y).equals(Field.EMPTY)) {
            view.out("This cell is occupied! Choose another one!");
            return false;
        }

        board.set(x, y, field);
        return true;
    }
}
