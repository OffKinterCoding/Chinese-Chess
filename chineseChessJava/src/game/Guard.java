package game;

/**
 * Guard Piece
 */
public class Guard extends Piece {

    public Guard(boolean place) {
        super(place);
        this.type = "Guard";
    }

    @Override

    public void checkPattern(Move move) {
        super.checkPattern(move);

        if (!move.isDiagonal() || Math.abs(move.getDx()) != 1) {
            move.setValid(false);
        }
        else if (move.getFinalX() < 3 || move.getFinalX() > 5) {
            move.setValid(false);
        }

        if (place) {
            if (move.getFinalY() > 2) {
                move.setValid(false);
            }
        }
        else{
            if (move.getFinalY() < 7) {
                move.setValid(false);
            }
        }


    }
}
