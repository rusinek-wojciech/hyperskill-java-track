package org.ikinsure.tictactoeai.playable;

import org.ikinsure.tictactoeai.Board;
import org.ikinsure.tictactoeai.Checker;
import org.ikinsure.tictactoeai.Field;
import org.ikinsure.tictactoeai.Utilities;
import org.ikinsure.tictactoeai.io.View;

import java.util.Arrays;
import java.util.Random;

public class Medium implements Playable {

    @Override
    public void move(Field field, Board board, View view) {

        Random random = new Random();
        Field[][] originalMatrix = board.getMatrix();

        int x;
        int y;

        boolean done = false;



        Checker checker = new Checker(copy(originalMatrix));



        int thisPos = Utilities.oneMoveToWin(player.getSide().sign, board, WIN_COMBINATIONS);
        int enemyPos = Utilities.oneMoveToWin(player.getOtherSide().sign, board, WIN_COMBINATIONS);


        while (!done) {
            if (thisPos != -1) {

                done = board.get(xthisPos, ythisPos).equals(Field.EMPTY);

            } else if (enemyPos != -1) {

                done = board.get(xenemyPos, yenemyPos).equals(Field.EMPTY);

            } else {

                x = random.nextInt(board.size());
                y = random.nextInt(board.size());
                done = board.get(x, y).equals(Field.EMPTY);
            }
        }

        view.out("Making move level \"medium\"");
        board.set(x, y, field);
    }

   private Field[][] copy(Field[][] matrix) {
        return Arrays.stream(matrix).map(Field[]::clone).toArray(Field[][]::new);
   }
}
