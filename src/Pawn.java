import java.util.ArrayList;

class Pawn extends Piece {
  private boolean firstMove;
  private boolean alive;
  
  public Pawn() {
    this.firstMove = true;
    this.alive = true;
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int x, int y) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    if(firstMove == true) {
      Integer[] move = {x + 2, y};
      moves.add(move);
    }
    Integer[] move = {x + 1, y};
    moves.add(move);
    return moves;
  }
}
