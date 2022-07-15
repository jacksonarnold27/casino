import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class HighLow {
  private static final int DEFAULT_LIMIT = 21;
  List<Integer> numbers = new ArrayList<>();
  List<Boolean> guessHistory = new ArrayList<>();
  private int limit, buyin, payoutMultiplier;
  private int score;

  public HighLow() {
    this.limit = DEFAULT_LIMIT;
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("""
            Welcome to High-Low!
            Here you will guess whether the following number will be higher or lower than the previous.
            Would you like to play?
            """);
  }

}
