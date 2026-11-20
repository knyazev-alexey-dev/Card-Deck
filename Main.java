import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) hand.add(deck.deal());
        System.out.println("Карты в руке: " + hand);
        System.out.println("В колоде осталось: " + deck.size());
        Card returned = hand.remove(0);
        System.out.println("Первый возврат: " + deck.returnCard(returned));
        System.out.println("Повторный возврат: " + deck.returnCard(returned));
        System.out.println("Теперь в колоде: " + deck.size());
    }
}
