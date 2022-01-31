package org.ikinsure.tictactoeai.playable;

import org.ikinsure.tictactoeai.Board;
import org.ikinsure.tictactoeai.Field;
import org.ikinsure.tictactoeai.io.View;

public interface Playable {
    void move(Field field, Board board, View view);
}
