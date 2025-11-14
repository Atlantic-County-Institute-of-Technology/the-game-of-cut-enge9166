import java.util.Random;

public class Deck {

    private Card[] deck = new Card[52];
    private int cardsInDeck = 0; // Tracks the number of *available* cards
    private Random rand = new Random();

    public Deck() {
        genDeck();
    }

    private void genDeck() {
        int temp = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int face = 1; face <= 13; face++) {
                deck[temp] = new Card(face, suit);
                temp += 1;
            }
        }
        cardsInDeck = 52;
    }

    private void shuffle() {

        for (int i = 0; i < 52; i++) {
            int temp = deck[i];
            int temp2 = rand.nextInt(deck.length);
            deck[i] = deck[temp2];
            deck[temp2] = temp;
        }
        cardsInDeck = 52;
    }

    private void toString(){
        for (int i = 0; i < deck.length; i++) {
            deck[i].toString();
        }


    }

    // Pulls a random card from the remaining cards in the deck
//    public Card pullCard() {
//        if (cardsInDeck > 0) {
//            // Select a random index from the *remaining* available cards
//            int randomIndex = rand.nextInt(cardsInDeck);
//
//            // Get the card at that random index
//            Card selectedCard = deck[randomIndex];
//
//            // Swap the selected card with the last available card to fill the gap
//            // This ensures we don't pick the same card twice
//            deck[randomIndex] = deck[cardsInDeck - 1];
//            deck[cardsInDeck - 1] = null; // Optional: helps with garbage collection/debugging
//
//            // Decrease the count of available cards
//            cardsInDeck--;
//
//            return selectedCard;
//
//        } else {
//            System.out.println("The deck is empty!");
//            return null;
        }
    }
}