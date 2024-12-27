package chess.pieces;
import java.util.ArrayList;

public class Rook extends Piece {

  public Rook(boolean color) {
    super('R', color);
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
        Integer[] move = {x, i};
        moves.add(move);
      }
    }
    return moves;
  }
}
