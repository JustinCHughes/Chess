public class Rook {
  private boolean alive;

  public Rook() {
    this.alive = true;
  }

  public int[][] possibleMoves(int x, int y) {
    int[][] moves = new int[14][2];
    for(int i = 0; i < 8; i++) {
      if(i != x) {
        moves[i][0] = i;
        moves[i][1] = y;
      }
    }
    for(int i = 8; i < 16; i++) {
      if(i - 8 != y) {
        moves[i][0] = x;
        moves[i][1] = i - 8;
      }
    }
    return moves;
  }
}
