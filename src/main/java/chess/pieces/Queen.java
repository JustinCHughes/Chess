package chess.pieces;
import java.util.ArrayList;

public class Queen extends Piece {

  public Queen(boolean color) {
    super('Q', color);
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
      if(x-i >= 0 && y-i >= 0) {
        Integer[] move = {x-i, y-i};
        moves.add(move);
      }
      if(x-i >= 0 && y+1 < 8) {
        Integer[] move = {x-i, y+i};
        moves.add(move);
      }
      if(x+i < 8 && y-1 >= 0) {
        Integer[] move  = {x+i, y-i};
        moves.add(move);
      }
      if(x+1 < 8 && y+1 < 8) {
        Integer[] move = {x+i, y+1};
        moves.add(move);
      }
    }
    return moves;
  }
}
