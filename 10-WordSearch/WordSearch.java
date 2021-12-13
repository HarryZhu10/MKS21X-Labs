import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.lang.IndexOutOfBoundsException;
public class WordSearch{
    private char[][]data;
    private int seed;
    private Random randgen;
    private ArrayList<String> wordsAdded;
    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
    data = new char[rows][cols];
      for (int i = 0; i < rows; i ++) {
        for (int x = 0; x < cols; x ++) {
          data[i][x] = '_';
        }
      }
    }

// No given seed so you have to generate yourself
    public WordSearch(int rows, int cols, String fileName) {
      rng = new Random();
      seed = rng.nextInt();
      rng = new Random (seed);
      data = new char[rows][cols];
      clear();
      wordsAdded = new ArrayList<String>();
      //addAllWords(fileName);  Not complete yet
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i ++) {
        for (int x = 0; x < data[i].length; x ++) {
          data[i][x] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String newString = "";
      for (int i = 0; i < data.length; i ++) {
        for (int x = 0; x < data[i].length; x ++) {
          if (x == data[i].length - 1) {
            newString = newString + data[i][x] + "\n";
          } else {
            newString = newString + data[i][x] + " ";
          }
        }
      }
      return newString;
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word,int row, int col){
      if (word.length() + col <= data[row].length ) {
        int count = 0;
        for (int i = col; i - col < word.length(); i ++) {
          if (!(data[row][i] == '_' || data[row][i] == word.charAt(count))) {
            return false;
          }
          count ++;
        }
        count = 0;
        for (int i = col; i - col < word.length(); i ++) {
          data[row][i] = word.charAt(count);
          count ++;
        }
      }
      return true;
    }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */

    public boolean addWordVertical(String word,int row, int col){
      if (word.length() + row <= data.length) {
        int count = 0;
        for (int i = row; i - row < word.length(); i ++) {
          if (!(data[i][col] == '_' || data[i][col] == word.charAt(count))) {
            return false;
          }
          count ++;
        }
        count = 0;
        for (int i = row; i - row < word.length(); i ++) {
          data[i][col] = word.charAt(count);
          count ++;
        }
      }
      return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned
     *and the board is not modified.
     */
    public boolean addWordDiagonal(String word,int row, int col){
      int c = col;
      int count = 0;
      for (int i = row; i < data.length; i ++) {
        if (c < data[i].length) {
          count ++;
        }
        c ++;
      }

        if (count >= word.length()) {
          int indexOfWord = 0;
          int c2 = col;
          for (int i = row; i - row < count; i ++) {
            if (!(data[i][c2] == word.charAt(indexOfWord) || data[i][c2] == '_')) {
              return false;
            }
            c2++;
            indexOfWord ++;
          }
          indexOfWord = 0;
          c2 = col;
          for (int i = row; i - row < count; i ++) {
            data[i][c2] = word.charAt(indexOfWord);
            indexOfWord ++;
            c2 ++;
          }
        }
        return true;
    }

    public boolean addWord(int row, int col, String word, int rowInc, int colInc) {
      int newRow = row;
      int newCol = col;
      boolean on = true;
      if (rowInc == 0 && colInc == 0) {
        return false;
      }
      try {
      for (int i = 0; i < word.length(); i ++) {
        if (!(data[newRow][newCol] == '_' || data[newRow][newCol] == word.charAt(i))) {
          on = false;
        }
        newRow = newRow + rowInc;
        newCol = newCol + colInc;
      }
    } catch (IndexOutOfBoundsException ex) {
      on = false;
    }
      if (on) {
        newRow = row;
        newCol = col;
      for (int i = 0; i < word.length(); i ++) {
        data[newRow][newCol] = word.charAt(i);
        newRow += rowInc;
        newCol += colInc;
      }
    }
    return true;
    }

}
