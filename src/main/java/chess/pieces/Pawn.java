package chess.pieces;
import java.util.ArrayList;

public class Pawn extends Piece {
  private boolean firstMove;

  public Pawn() {
    super('P');
    this.firstMove = true;
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int x, int y) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    if(this.firstMove == true) {
      Integer[] move = {x + 2, y};
      moves.add(move);
      this.firstMove = false;
    }
    Integer[] move = {x + 1, y};
    moves.add(move);
    return moves;
  }
}
