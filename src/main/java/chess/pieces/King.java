package chess.pieces;
import java.util.ArrayList;

public class King extends Piece{
  
  public King(boolean color) {
    super('K', color);
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    number = 8 - number;
    letter = letter - 1;

    if(number - 1 >= 0) {
      Integer[] move = {number-1, letter};
      moves.add(move);
    }
    if(number + 1 < 8) {
      Integer[] move = {number+1, letter};
      moves.add(move);
    }
    if(letter - 1 >= 0) {
      Integer[] move = {number, letter-1};
      moves.add(move);
    }
    if(letter + 1 < 8) {
      Integer[] move = {number, letter+1};
      moves.add(move);
    }
    if(number - 1 >= 0 && letter - 1 >= 0) {
      Integer[] move = {number-1, letter-1};
      moves.add(move);
    }
    if(number - 1 >= 0 && letter + 1 < 8) {
      Integer[] move = {number-1, letter+1};
      moves.add(move);
    }
    if(number + 1 < 8 && letter - 1 >= 0) {
      Integer[] move = {number+1, letter-1};
      moves.add(move);
    }
    if(number + 1 < 8 && letter + 1 < 8) {
      Integer[] move = {number+1, letter+1};
      moves.add(move);
    }
    return moves;
  }
}
