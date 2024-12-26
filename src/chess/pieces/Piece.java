package chess.pieces;
import java.util.ArrayList;

public class Piece {
  private boolean color;
  private boolean alive;
  
  public Piece() {
    this.alive = true;
  }

  public ArrayList<Integer[]> possibleMoves(int x, int y) {
    ArrayList<Integer[]> list = new ArrayList<>();
    Integer[] dummyMove = {x,y};
    list.add(dummyMove);
    return list;
  }

}
