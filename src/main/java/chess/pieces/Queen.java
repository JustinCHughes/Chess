package chess.pieces;
import java.util.ArrayList;

public class Queen extends Piece {

  public Queen(boolean color) {
    super('Q', color);
  }

  @Override
  public ArrayList<Integer[]> possibleMoves(int number, int letter) {
    ArrayList<Integer[]> moves = new ArrayList<>();
    number = 8 - number;
    letter = letter - 1;

    for(int i = 0; i < 8; i++) {
      if(i != number) {
        Integer[] move = {i, letter};
        moves.add(move);
      }
      if(i != letter) {
        Integer[] move = {number, i};
        moves.add(move);
      }
      if(number-i >= 0 && letter-i >= 0 && i != 0) {
        Integer[] move = {number-i, letter-i};
        moves.add(move);
      }
      if(number-i >= 0 && letter+i < 8 && i != 0) {
        Integer[] move = {number-i, letter+i};
        moves.add(move);
      }
      if(number+i < 8 && letter-i >= 0 && i != 0) {
        Integer[] move  = {number+i, letter-i};
        moves.add(move);
      }
      if(number+1 < 8 && letter+i < 8 && i != 0) {
        Integer[] move = {number+i, letter+i};
        moves.add(move);
      }
    }
    return moves;
  }
}
