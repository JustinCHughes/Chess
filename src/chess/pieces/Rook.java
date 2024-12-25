package chess.pieces;
import java.util.ArrayList;

public class Rook extends Piece {
  private boolean alive;
  private boolean color;

  public Rook() {
    this.alive = true;
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int x, int y) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    for(int i = 0; i < 8; i++) {
      if(i != x) {
        Integer[] move = {i, y};
        moves.add(move);
      }
      if(i != y) {
        Integer[] move = {x, y};
        moves.add(move);
      }
    }
    return moves;
  }
}
