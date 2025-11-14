import java.util.Random;

public class Deck {

    private Card[] deck = new Card[52];
    private int cardsInDeck = 0; // Tracks the number of *available* cards
    private Random rand = new Random();

    public Deck() {
        genDeck();
    }

    public void genDeck() {
        int temp = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int face = 1; face <= 13; face++) {
                deck[temp] = new Card(face, suit);
                temp += 1;
            }
        }
        cardsInDeck = 52;
    }

    public void shuffle() {

        for (int i = 0; i < 52; i++) {
            Card temp = deck[i];
            int temp2 = rand.nextInt(deck.length);
            deck[i] = deck[temp2];
            deck[temp2] = temp;
        }
        cardsInDeck = 52;
    }

    // Corrected toString method
    public String toString(){
        // Use a StringBuilder to efficiently build the string representation
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deck.length; i++) {
            // Append the string representation of each card to the StringBuilder
            // Assumes the Card class has a working toString() method
            sb.append(deck[i].toString());
            sb.append("\n"); // Add a newline for better readability
        }
        // Return the final string
        return sb.toString();
    }
}