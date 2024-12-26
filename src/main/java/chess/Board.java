package chess;
import chess.pieces.Bishop;
import chess.pieces.King;
import chess.pieces.Knight;
import chess.pieces.Pawn;
import chess.pieces.Piece;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class Board {
  private Piece[][] cells = new Piece[8][8];

  public Board() {
    for(int i = 0; i < 8; i++) {
      cells[1][i] = new Pawn();
      cells[6][i] = new Pawn();
    }
    cells[0][0] = new Rook();
    cells[0][7] = new Rook();
    cells[0][1] = new Knight();
    cells[0][6] = new Knight();
    cells[0][2] = new Bishop();
    cells[0][5] = new Bishop();
    cells[0][3] = new Queen();
    cells[0][4] = new King();
    cells[7][0] = new Rook();
    cells[7][7] = new Rook();
    cells[7][1] = new Knight();
    cells[7][6] = new Knight();
    cells[7][2] = new Bishop();
    cells[7][5] = new Bishop();
    cells[7][3] = new Queen();
    cells[7][4] = new King();
  }

  public void print() {
    System.out.println();
    for(int i = 0; i < 8; i++) {
      char temp;
      for(int j = 0; j < 7; j++) {
        if(this.cells[i][j] == null) {
          temp = ' ';
        }
        else {
          temp = this.cells[i][j].retRep();
        }
        System.out.print(temp + " | ");
      }
      if(this.cells[i][7] == null) {
        temp = ' ';
      }
      else {
        temp = this.cells[i][7].retRep();
      }
      System.out.print(temp);
      System.out.println();
      if(i < 7)
        System.out.println("--+---+---+---+---+---+---+--");
    }
  }
}
