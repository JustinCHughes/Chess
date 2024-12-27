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

  public ArrayList<Integer[]> possibleMoves(int number, int letter) {
    ArrayList<Integer[]> list = new ArrayList<>();
    number = 8 - number;
    letter = letter - 1;

    Integer[] dummyMove = {number,letter};
    list.add(dummyMove);
    return list;
  }

  public char getLetter() { return this.rep; }

  public boolean getColor() { return this.color; }
}
