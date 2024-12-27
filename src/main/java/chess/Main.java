package chess;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Board chess = new Board();
    chess.print();

    int letter = 4;
    int number = 1;

    System.out.println(chess.getPiece(number,letter).getColor());
    System.out.println(chess.getPiece(number,letter).getLetter());
    ArrayList<Integer[]> list = chess.getPiece(number,letter).possibleMoves(number,letter);
    ArrayList<String> strlist = new ArrayList<>();
    for(Integer[] item : list) {
      char let;
      switch (item[1]) {
        case 0:
          let = 'A';
          break;
        case 1:
          let = 'B';
          break;
        case 2:
          let = 'C';
          break;
        case 3:
          let = 'D';
          break;
        case 4:
          let = 'E';
          break;
        case 5:
          let = 'F';
          break;
        case 6:
          let = 'G';
          break;
        case 7:
          let = 'H';
          break;
        default:
          let = 'Q';
          break;
      }
      strlist.add(let + "" + (8-item[0]));
    }
    Collections.sort(strlist);
    for(String item : strlist)
      System.out.println(item);
  }
}