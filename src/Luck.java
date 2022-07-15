import java.util.Random;

@SuppressWarnings( "unused" )
public class Luck {
  static private final Random rand = new Random();

  public static Random rand() {
    return rand;
  }


  public static int randInt(int limit) {
    return rand.nextInt(limit);
  }

  public static int randomInteger(int limit) {
    return rand.nextInt(limit);
  }

  public static int randNum(int limit) {
    return rand.nextInt(limit) + 1;
  }

  public static int randomPositiveInteger(int limit) {
    return rand.nextInt(limit) + 1;
  }

  public static void main(String[] args) {
    System.out.println(rand);
    System.out.println(randomInteger(50));
  }

}
