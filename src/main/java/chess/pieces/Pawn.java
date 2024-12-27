package chess.pieces;
import java.util.ArrayList;

public class Pawn extends Piece {
  private boolean firstMove;

  public Pawn(boolean color) {
    super('P', color);
    this.firstMove = true;
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    number = 8 - number;
    letter = letter - 1;
    int sign = -1;
    if(color)
      sign = 1;

    if(this.firstMove == true) {
      Integer[] move = {number + (2 * sign), letter};
      moves.add(move);
      this.firstMove = false;
    }
    Integer[] move = {number + (1 * sign), letter};
    moves.add(move);
    return moves;
  }
}
