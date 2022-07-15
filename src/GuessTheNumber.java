import java.util.Scanner;

public class GuessTheNumber {

  // TODO: implement reward system
  // TODO: implement difficulty system
  // TODO: implement dynamic difficulty system

  private enum Difficulty {
    BEGINNER,
    EASY,
    MEDIUM,
    HARD,
    IMPOSSIBLE;
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int limit = 10;
    int num = Luck.randomPositiveInteger(limit);
    num = Luck.randNum(limit);

    int guess;

    System.out.println("~ ~ ~ GUESS THE NUMBER ~ ~ ~");
    printBounds(limit);
    System.out.print("Enter your guess now: ");
    guess = keyboard.nextInt();
    System.out.println(guess);


  }

  private static void printBounds(int limit) {
    System.out.printf("The number will be a whole number between 1 and %d%n", limit);
  }

  private static boolean isEqual(int a, int b) {
    return a == b;
  }
}
