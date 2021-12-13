public class Driver {
  public static void main (String[] args) {
    WordSearch puzzle = new WordSearch(4,5);

System.out.println(puzzle);

puzzle.addWordHorizontal("MATH", 2, 1);
System.out.println(puzzle);
puzzle.addWordVertical("MAAE", 0, 2);
System.out.println(puzzle);
puzzle.addWordDiagonal("MTAA", 0, 0);
System.out.println(puzzle);
  }
}
