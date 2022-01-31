package org.ikinsure.tictactoeai.playable;

import org.ikinsure.tictactoeai.Board;
import org.ikinsure.tictactoeai.Field;
import org.ikinsure.tictactoeai.io.View;

import java.util.Random;

public class Easy implements Playable {

    @Override
    public void move(Field field, Board board, View view) {

        Random random = new Random();

        int x;
        int y;
        do {
            x = random.nextInt(board.size());
            y = random.nextInt(board.size());
        } while (!board.get(x, y).equals(Field.EMPTY));

        view.out("Making move level \"easy\"");
        board.set(x, y, field);
    }

}
