public class Main {
    public static void main(String[] arg) {
        Card Ace = new Card(1, 1);
        System.out.println("A single card: " + Ace);

        // Create a new deck object
        Deck deck1 = new Deck();
//        deck1.shuffle();
        System.out.println(deck1.toString());
    }
}