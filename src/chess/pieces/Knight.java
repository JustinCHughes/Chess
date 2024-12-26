package chess.pieces;
import java.util.ArrayList;

public class Knight extends Piece {
  private boolean color;
  private boolean alive;
  
  public Knight() {
    this.alive = true;
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int x, int y) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    if(x - 1 >= 0 && y - 2 >= 0) {
      Integer[] move = {x-1, y-2};
      moves.add(move);
    }
    if(x + 1 < 8 && y - 2 >= 0) {
      Integer[] move = {x+1, y-2};
      moves.add(move);
    }
    if(x - 1 >= 0 && y + 2 < 8) {
      Integer[] move = {x-1, y+2};
      moves.add(move);
    }
    if(x + 1 < 8 && y + 2 < 8) {
      Integer[] move = {x+1,y+2};
      moves.add(move);
    }
    if(x - 2 >= 0 && y - 1 >= 0) {
      Integer[] move = {x-2, y-1};
      moves.add(move);
    }
    if(x + 2 < 8 && y - 1 >= 0) {
      Integer[] move = {x+2, y-1};
      moves.add(move);
    }
    if(x - 2 >= 0 && y + 1 < 8) {
      Integer[] move = {x-2, y+1};
      moves.add(move);
    }
    if(x + 2 < 8 && y + 1 < 8) {
      Integer[] move = {x+2,y+1};
      moves.add(move);
    }

    return moves;
  }
}
