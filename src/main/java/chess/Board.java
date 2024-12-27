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
      cells[1][i] = new Pawn(true);
      cells[6][i] = new Pawn(false);
    }
    cells[0][0] = new Rook(true);
    cells[0][7] = new Rook(true);
    cells[0][1] = new Knight(true);
    cells[0][6] = new Knight(true);
    cells[0][2] = new Bishop(true);
    cells[0][5] = new Bishop(true);
    cells[0][3] = new Queen(true);
    cells[0][4] = new King(true);
    cells[7][0] = new Rook(false);
    cells[7][7] = new Rook(false);
    cells[7][1] = new Knight(false);
    cells[7][6] = new Knight(false);
    cells[7][2] = new Bishop(false);
    cells[7][5] = new Bishop(false);
    cells[7][3] = new Queen(false);
    cells[7][4] = new King(false);
  }

  public void print() {
    System.out.println();
    for(int i = 0; i < 8; i++) {
      char temp;
      for(int j = 0; j < 7; j++) {
        if(j==0) {
          System.out.print(" " + (8 - i) + " | ");
        }
        if(this.cells[i][j] == null) {
          temp = ' ';
        }
        else {
          temp = this.cells[i][j].getLetter();
        }
        System.out.print(temp + " | ");
      }
      if(this.cells[i][7] == null) {
        temp = ' ';
      }
      else {
        temp = this.cells[i][7].getLetter();
      }
      System.out.print(temp);
      System.out.println();
      System.out.println("---+---+---+---+---+---+---+---+---");
    }
    System.out.println("   | A | B | C | D | E | F | G | H ");
  }

  public Piece getPiece(int number, int letter) {
    return this.cells[(8-number)][letter-1];
  }
}
