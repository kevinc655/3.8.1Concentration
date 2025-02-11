/*
 * Activity 3.8.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    
    /* your code here */
    Tile[][] gameboard = new Tile[3][4];
    for (int row = 0; row < 3; row++){
        for (int column = 0; column < 4; column++){
            gameboard[row][column] = new Tile(tileValues[4*row+column]);
        }
    }
    System.out.println(java.util.Arrays.toString(gameboard[0]));
    System.out.println(java.util.Arrays.toString(gameboard[1]));
    System.out.println(java.util.Arrays.toString(gameboard[2]));
  }
}
