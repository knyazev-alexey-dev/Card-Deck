import java.util.Objects;

public final class Card {
    public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }
    public enum Rank { TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }
    private final Suit suit;
    private final Rank rank;
    public Card(Suit suit, Rank rank) { this.suit = Objects.requireNonNull(suit); this.rank = Objects.requireNonNull(rank); }
    public Suit getSuit() { return suit; }
    public Rank getRank() { return rank; }
    @Override public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Card)) return false;
        Card card = (Card) other;
        return suit == card.suit && rank == card.rank;
    }
    @Override public int hashCode() { return Objects.hash(suit, rank); }
    @Override public String toString() { return rank + " of " + suit; }
}
