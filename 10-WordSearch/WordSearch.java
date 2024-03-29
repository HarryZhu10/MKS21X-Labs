import java.util.*;
import java.io.*;
public class WordSearch{
  private char[][] grid;
  private ArrayList<String> wordsAdded;
  private Random rng;
  private int seed;

  //assume a rectangular grid
  private void addAllWords(String filename){
    ArrayList<String> wordsToAdd = loadWordsFromFile(filename);
    //You are writing this

    for (int i = 1; i <= wordsToAdd.size(); i += 0 ) {
      int reps = 0;
      boolean on = true;
      String word = wordsToAdd.remove(0);
      while (reps <= 100 && on) {
        int randomRow = rng.nextInt(grid.length);
        int randomCol = rng.nextInt(grid[0].length);
        int randRowInc = rng.nextInt() % 2;
        int randColInc = rng.nextInt() % 2;

        if (addWord(word, randomRow, randomCol, randRowInc, randColInc)) {
          on = false;
        } else {
          reps++;
        }
      }
    }
  }

  public void fillInRandomLetters() {
    for (int i = 0; i < grid.length; i ++) {
      for (int x = 0; x < grid[i].length; x ++) {
        if (grid[i][x] == '_') {
          grid[i][x] = (char) ('A' + rng.nextInt(26));
        }
      }
    }
  }

  public static void main (String[] args) {
    int givenRow = Integer.parseInt(args[0]);
    int givenCol = Integer.parseInt(args[1]);
    String fileName = args[2];
    int mode = Integer.parseInt(args[3]);
    int seed = 0;
    WordSearch puzzle = new WordSearch (givenRow, givenCol, fileName);
    if (args.length == 5) {
      seed = Integer.parseInt(args[4]);
      puzzle = new WordSearch (givenRow, givenCol, fileName, seed);
    }

    if (mode == 0) {
      puzzle.fillInRandomLetters();
      System.out.println(puzzle.toString());
    } else {
      System.out.println(puzzle.toString());
    }

  }

  public WordSearch(int rows,int cols, String fileName){
    rng = new Random();
    seed = rng.nextInt();
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public WordSearch(int rows,int cols, String fileName, int s){
    seed = s;
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }



  private void clear(){
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        grid[r][c]='_';
      }
    }
  }


  //precondition word grids are rectangular
  private boolean inBounds(int r, int c){
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }
  public boolean addWord(String word,int row, int col, int dr, int dc){
    //make sure there is some non 0 vector for direction
    if(dr == 0 && dc == 0){
      return false;
    }
    //check endpoints of word
    if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
      return false;
    }
    //check for conflicting letters
    for(int i = 0; i < word.length(); i++){
      char c = grid[row + i * dr][col + i * dc];
      if(c != '_' && c != word.charAt(i)){
        return false;
      }
    }
    //change
    for(int i = 0; i < word.length(); i++){
      grid[row + i * dr][col + i * dc] = word.charAt(i);
    }
    wordsAdded.add(word);
    return true;
  }

  public String toString(){
    String ans = "";
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        ans += grid[r][c]+" ";
      }
      ans+="\n";
    }
    ans += "words: ";
    for(String word:wordsAdded){
      ans+= word+" ";
    }
    ans += "\nseed: "+seed;
    return ans;
  }
}
