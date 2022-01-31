package org.ikinsure.tictactoeai.playable;

import org.ikinsure.tictactoeai.Board;
import org.ikinsure.tictactoeai.Field;
import org.ikinsure.tictactoeai.io.View;

public class Hard implements Playable {

    @Override
    public void move(Field field, Board board, View view) {


        view.out("Making move level \"hard\"");
        board.set(x, y, field);
    }
}
