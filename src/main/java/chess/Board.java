package chess;
import java.util.ArrayList;

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

  public ArrayList<Integer[]> pruneMoves(int number, int letter) {
    if(this.getPiece(number, letter) instanceof Queen) {
      return pruneQueen(number, letter);
    } else if(this.getPiece(number, letter) instanceof King) {
      return pruneKnight(number, letter);
    } else if(this.getPiece(number, letter) instanceof Rook) {
      return pruneRook(number, letter);
    } else if(this.getPiece(number, letter) instanceof Bishop) {
      return pruneBishop(number, letter);
    } else if(this.getPiece(number, letter) instanceof Knight) {
      return pruneKnight(number, letter);
    } else if(this.getPiece(number, letter) instanceof Pawn) {
      return prunePawn(number, letter);
    } else {
      return null;
    }
  }

  public Piece getPiece(int number, int letter) {
    if(number > 8 || number < 1 || letter < 1 || number > 8)
      return null;
    return this.cells[(8-number)][letter-1];
  }

  public ArrayList<Integer[]> pruneQueen(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    moves = this.getPiece(number, letter).possibleMoves(number, letter);
    return moves;
  }

  public ArrayList<Integer[]> pruneKing(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    moves = this.getPiece(number, letter).possibleMoves(number, letter);
    return moves;
  }

  public ArrayList<Integer[]> pruneRook(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    Piece rook = this.getPiece(number, letter);
    moves = rook.possibleMoves(number, letter);

    int maxX = 10;
    int minX = -10;
    int maxY = 10;
    int minY = -10;

    for(int i = 1; i < 8; i++) {
      Piece temp = this.getPiece(number, letter + i);
      if(maxX == 10 && temp != null) {
        if(rook.getColor() == temp.getColor()) {
          maxX = letter + i - 1;
        } else {
          maxX = letter + i;
        }
      }
      temp = this.getPiece(number, letter - i);
      if(minX == -10 && temp != null) {
        if(rook.getColor() == temp.getColor()) {
          maxX = letter - i - 1;
        } else {
          minX = letter - i;
        }
      }
      temp = this.getPiece(number + i, letter);
      if(maxY == 10 && temp != null) {
        if(rook.getColor() == temp.getColor()) {
          maxX = number + i - 1;
        } else {
          maxX = number + i;
        }
      }
      temp = this.getPiece(number - i, letter);
      if(minY == -10 && temp != null) {
        if(rook.getColor() == temp.getColor()) {
          maxX = number - i - 1;
        } else {
          maxX = number - i;
        }
      }
    }

    moves.removeIf(item -> item[0] < minX);

    return moves;
  }

  public ArrayList<Integer[]> pruneBishop(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    moves = this.getPiece(number, letter).possibleMoves(number, letter);
    return moves;
  }

  public ArrayList<Integer[]> pruneKnight(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    moves = this.getPiece(number, letter).possibleMoves(number, letter);
    return moves;
  }

  public ArrayList<Integer[]> prunePawn(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    moves = this.getPiece(number, letter).possibleMoves(number, letter);
    return moves;
  }
}
