package chess.pieces;
import java.util.ArrayList;

public class Knight extends Piece {
  
  public Knight(boolean color) {
    super('N', color);
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    number = 8 - number;
    letter = letter - 1;

    if(number - 1 >= 0 && letter - 2 >= 0) {
      Integer[] move = {number-1, letter-2};
      moves.add(move);
    }
    if(number + 1 < 8 && letter - 2 >= 0) {
      Integer[] move = {number+1, letter-2};
      moves.add(move);
    }
    if(number - 1 >= 0 && letter + 2 < 8) {
      Integer[] move = {number-1, letter+2};
      moves.add(move);
    }
    if(number + 1 < 8 && letter + 2 < 8) {
      Integer[] move = {number+1,letter+2};
      moves.add(move);
    }
    if(number - 2 >= 0 && letter - 1 >= 0) {
      Integer[] move = {number-2, letter-1};
      moves.add(move);
    }
    if(number + 2 < 8 && letter - 1 >= 0) {
      Integer[] move = {number+2, letter-1};
      moves.add(move);
    }
    if(number - 2 >= 0 && letter + 1 < 8) {
      Integer[] move = {number-2, letter+1};
      moves.add(move);
    }
    if(number + 2 < 8 && letter + 1 < 8) {
      Integer[] move = {number+2,letter+1};
      moves.add(move);
    }

    return moves;
  }
}
