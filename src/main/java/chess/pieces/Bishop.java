package chess.pieces;
import java.util.ArrayList;

public class Bishop extends Piece {

  public Bishop(boolean color) {
    super('B', color);
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    number = 8 - number;
    letter = letter - 1;
    for(int i = 1; i < 8; i++) {
      if(number-i >= 0 && letter-i >= 0 && number-i < 8 && letter-i < 8) {
        Integer[] move = {number-i, letter-i};
        moves.add(move);
      }
      if(number-i >= 0 && letter+i < 8 && number-i < 8 && letter+i >= 0) {
        Integer[] move = {number-i, letter+i};
        moves.add(move);
      }
      if(number+i < 8 && letter-i >= 0 && number+i >= 0 && letter-i < 8) {
        Integer[] move  = {number+i, letter-i};
        moves.add(move);
      }
      if(number+1 < 8 && letter+i < 8 && number+1 >= 0 && letter+i >= 0) {
        Integer[] move = {number+i, letter+i};
        moves.add(move);
      }
    }
    return moves;
  }
}
