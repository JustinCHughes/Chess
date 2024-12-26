package chess.pieces;
import java.util.ArrayList;

public class Piece {
  protected boolean color;
  protected boolean alive;
  protected char rep;
  
  public Piece(char rep) {
    this.rep = rep;
    this.alive = true;
  }

  public ArrayList<Integer[]> possibleMoves(int x, int y) {
    ArrayList<Integer[]> list = new ArrayList<>();
    Integer[] dummyMove = {x,y};
    list.add(dummyMove);
    return list;
  }

  public char retRep() { return this.rep; }
}
