package game;

import logic.Move;

/**
 * General Piece
 */
public class General extends Piece {
    public General(boolean place) {
        super(place);

        this.type = "General";
    }

    @Override

    public void checkPattern(Move move) {

        super.checkPattern(move);

        if (!move.isHorizontal() && !move.isVertical()) {
            move.setValid(false);
        }
        else if (Math.abs(move.getDx()) > 1 || Math.abs(move.getDy()) > 1) {
            move.setValid(false);
        }

        //stays in generals quarters
        if (move.getFinalX() < 3 || move.getFinalX() > 7) {
            move.setValid(false);
        }

        if (isBlack) {
            if (move.getFinalY() > 2) {
                move.setValid(false);
            }
        }
        else{
            if (move.getFinalY() < 8) {
                move.setValid(false);
            }
        }


    }
}