import java.util.Objects;

/**
 * @see <a href="https://en.wikipedia.org/wiki/Playing_card">Wikipedia -- Playing Cards</a>
 * @see <a href="https://en.wikipedia.org/wiki/Playing_card_suit">Wikipedia -- Playing Card Suits</a>
 */


enum Rank {
  TWO(),
  THREE(),
  FOUR(),
  FIVE(),
  SIX(),
  SEVEN(),
  EIGHT(),
  NINE(),
  TEN(),
  JACK(),
  QUEEN(),
  KING(),
  ACE();
}

enum Suit {
  CLUBS,
  DIAMONDS,
  HEARTS,
  SPADES;

  enum Color {
    RED,
    BLACK
  }

  public boolean isRed() {
    return (this.ordinal() == 1) || this.ordinal() == 2;
  }

  public boolean isBlack() {
    return this.ordinal() == 0 || this.ordinal() == 3;
  }

  public Color color() {
    return switch (this) {
      case HEARTS, DIAMONDS -> Color.RED;
      case CLUBS, SPADES -> Color.BLACK;
      default -> throw new IllegalStateException("Unexpected value: " + this);
    };
  }
}

public record Card( Rank rank, Suit suit ) {

  public static void main(String[] args) {
    // Card c = new Card(Rank.ACE, Suit.SPADES);
    // for (Suit s : Suit.values()) for (Rank r : Rank.values()) Card.printName(r, s);
    //
    // Deck d = Deck.standard();
    // for (Card c : d.cards()) {
    //   // System.out.println(c);
    //   c.printName();
    //   System.out.println(c.name());
    // }
    //
    // for (Card c : d.cards()) {
    //   System.out.println(c.namef());
    // }
    //
    final Deck deck = new Deck();
    System.out.println(deck);
    deck.fill();
    System.out.println(deck);
    System.out.println(deck);
    System.out.println(deck.cards());
    for (int i = 0; i < deck.cards().size(); i++) {
      System.out.println(deck.at(i) + " " + deck.at(i).isFaceCard());
    }
  }


  public static void printName(Rank rank, Suit suit) {
    System.out.printf("%s of %s%n", rank.name(), suit);
  }

  /**
   * Prints this {@link Card} object's {@link Rank} and {@link Suit}.
   * Ends with a newline.
   */
  public void printName() {

  }

  public String name() {
    return String.format("%s of %s", this.rank.name(), this.suit.name());
  }

  // FIXME: 7/13/22
  public String namef() {
    return String.format("%-6s %2s %9s", this.rank.name(), "of", this.suit.name());
  }

  /**
   * Returns <code>true</code> if {@link Card}'s ordinal is 9, 10, or 11 (Jack, Queen, King)
   */
  public boolean isFaceCard() {
    return this.rank.ordinal() > 8 && this.rank.ordinal() < 12;
  }

  public boolean isNumberCard() {
    return this.rank.ordinal() <= 8;
  }

  public Suit.Color color() {
    return this.suit.color();
  }

  @Override
  public boolean equals(Object card) {
    if (this == card) return true;
    if (card == null || getClass() != card.getClass()) return false;
    Card c = (Card) card;
    /* Returns true if the Card's Rank and Suit are both the same */
    return this.rank == c.rank && this.suit == c.suit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.rank, this.suit);
  }

  // FIXME: 7/13/22 FIX TOSTRING METHOD
  // @Override
  // public String toString() {
  //   return String.format("Card[rank=%s, suit=%s]", this.rank, this.suit);
  // }

}

