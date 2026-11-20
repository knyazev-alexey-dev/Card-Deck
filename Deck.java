import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Deck {
    private final List<Card> cards = new ArrayList<>();
    public Deck() {
        for (Card.Suit suit : Card.Suit.values())
            for (Card.Rank rank : Card.Rank.values()) cards.add(new Card(suit, rank));
    }
    public void shuffle() { Collections.shuffle(cards); }
    public Card deal() {
        if (cards.isEmpty()) throw new IllegalStateException("Колода пуста.");
        return cards.remove(cards.size() - 1);
    }
    // false означает, что карта уже есть в колоде.
    public boolean returnCard(Card card) {
        if (card == null || cards.contains(card)) return false;
        cards.add(card);
        return true;
    }
    public int size() { return cards.size(); }
    public List<Card> getCards() { return Collections.unmodifiableList(cards); }
}
