package chess.pieces;
import java.util.ArrayList;

public class Piece {
  protected boolean color;
  protected boolean alive;
  protected char rep;
  
  public Piece(char rep, boolean color) {
    this.rep = rep;
    this.color = color;
    this.alive = true;
  }

  public ArrayList<Integer[]> possibleMoves(int x, int y) {
    ArrayList<Integer[]> list = new ArrayList<>();
    Integer[] dummyMove = {x,y};
    list.add(dummyMove);
    return list;
  }

  public char getLetter() { return this.rep; }

  public boolean getColor() { return this.color; }
}
