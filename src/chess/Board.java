package chess;
import chess.pieces.*;

public class Board {
  private Piece[][] cells = new Piece[8][8];

  public Board() {
    for(int i = 0; i < 8; i++) {
      cells[i][1] = new Pawn();
      cells[i][6] = new Pawn();
      if(i == 0 || i == 7) {
        cells[i][0] = new Rook();
        cells[i][7] = new Rook();
      }
      if(i == 1 || i == 6) {
        cells[i][0] = new Knight();
        cells[i][7] = new Knight();
      }
      if(i == 2 || i == 5) {
        cells[i][0] = new Bishop();
        cells[i][7] = new Bishop();
      }
      if(i == 3) {
        cells[i][0] = new Queen();
        cells[i][7] = new Queen();
      }
      if(i == 4) {
        cells[i][0] = new King();
        cells[i][7] = new King();
      }
    }
  }
}
