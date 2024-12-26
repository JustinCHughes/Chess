package chess.pieces;
import java.util.ArrayList;

public class King extends Piece{
  private boolean color;
  private boolean alive;
  
  public King() {
    this.alive = true;
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int x, int y) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    
    if(x - 1 >= 0) {
      Integer[] move = {x-1, y};
      moves.add(move);
    }
    if(x + 1 < 8) {
      Integer[] move = {x+1, y};
      moves.add(move);
    }
    if(y - 1 >= 0) {
      Integer[] move = {x, y-1};
      moves.add(move);
    }
    if(y + 1 < 8) {
      Integer[] move = {x, y+1};
      moves.add(move);
    }
    if(x - 1 >= 0 && y - 1 >= 0) {
      Integer[] move = {x-1, y-1};
      moves.add(move);
    }
    if(x - 1 >= 0 && y + 1 < 8) {
      Integer[] move = {x-1, y+1};
      moves.add(move);
    }
    if(x + 1 < 8 && y - 1 >= 0) {
      Integer[] move = {x+1, y-1};
      moves.add(move);
    }
    if(x + 1 < 8 && y + 1 < 8) {
      Integer[] move = {x+1, y+1};
      moves.add(move);
    }
    return moves;
  }
}
