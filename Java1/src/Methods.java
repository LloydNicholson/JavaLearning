public class Methods {
  public static void main(String[] args) {
    // This is how you call a method/function in Java
    int highScore = calculateScore(true, 1000, 7, 150);
    System.out.println(highScore);

    calculateScore(true, 1060, 7, 150);
    int pos1 = calculateHighScorePosition(1500);
    int pos2 = calculateHighScorePosition(458);
    int pos3 = calculateHighScorePosition(400);
    int pos4 = calculateHighScorePosition(1000);

    displayHighScorePosition("Lloyd", pos1);
    displayHighScorePosition("Max", pos2);
    displayHighScorePosition("Christine", pos3);
    displayHighScorePosition("Dave", pos4);

    // StringBuilder calling method
    String[] words = {"hello", "goodbye", "no", "way", "it", "works"};
    String joinedWords = joinWords(words);
    System.out.println(joinedWords);
  }
  
  // This is how you define a method/function in Java
  // If you want to return something, void can be changed to any variable type - string, int, double, byte, long (anything you want really!)
  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      return finalScore;
    }
    
    return -1;
  }
  
  public static void displayHighScorePosition(String name, int position) {
    System.out.println(name + " managed to get into position " + position + " on the highscore table.");
  }

  public static int calculateHighScorePosition(int playerScore) {
    // if (playerScore >= 1000) {
    //   return 1;
    // } else if (playerScore >= 500) /*&& playerScore < 1000*/ { //these two extra pieces of code will always be true
    //   return 2;
    // } else if (playerScore >= 100) /*&& playerScore < 500 */{ //these two extra pieces of code will always be true
    //   return 3;
    // }
    //   return 4;

    // If you want to eliminate multiple return statements
    int position = 4;
    if (playerScore >= 1000) {
      position = 1;
    } else if (playerScore >= 500) {
      position = 2;
    } else if (playerScore >= 100) {
      position = 3;
    }
    return position;
  }

  // Creating a method called joinWords
  public static String joinWords(String[] words) {
    StringBuilder sentence = new StringBuilder();
    for (String w : words) {
      sentence.append(w + " ");
    }
    return sentence.toString();
  }

}
