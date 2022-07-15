import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {

  private final List<Card> cards;

  public enum Template {
    STANDARD
  }

  public Deck() {
    this.cards = new ArrayList<>();
  }

  public static void main(String[] args) {
    Deck d = new Deck();
    d.fill();
    int i = 0;
    // d.at(i).name();
    // i++;
    d.cards.forEach(c -> {
      System.out.printf("%-31s => %-2d", String.format("%s", c), d.cards.indexOf(c));
      if (c.isFaceCard()) System.out.print(" is FACE");
      if (c.isNumberCard()) System.out.print(" is NUMBER");
      System.out.println();
    });

    System.out.println(Arrays.toString(Suit.values()));
    System.out.println(Arrays.toString(Rank.values()));
  }


  /**
   * @return <strong>new</strong> {@link Deck} object filled with 52 cards
   */
  public static Deck standard() {
    Deck d = new Deck();
    d.fill();
    return d;
  }

  public void fill() {
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        Card c = new Card(r, s);
        cards.add(c);
      }
    }
  }

  public void empty() {
    System.out.println("Deck.empty");
    this.cards.clear();
  }

  public void shuffle() {

  }

  public Card at(int index) {
    return this.cards.get(index);
  }

  public List<Card> cards() {
    return this.cards;
  }

  public void print() {
    for (Card card : cards) {

    }
  }
}