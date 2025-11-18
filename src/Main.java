import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);


        // Create a new deck object
        Deck deck1 = new Deck();
        deck1.shuffle();
        System.out.println("Pick a card (1-52)");
        int p1Choice = scan.nextInt();
        Card p1Card = deck1.getCard(p1Choice);
        System.out.println("P1 chose: " + p1Card);
        System.out.println("Pick a card ("+ p1Choice + "-52)");
        int p2Choice = scan.nextInt();
        Card p2Card = deck1.getCard(p2Choice);
        System.out.println("P2 chose: " + p2Card);

        if (p1Card.getFace() > p2Card.getFace()) {
            System.out.println("p1 card number is greater than p2 card number : P1 wins");
        } else if (p2Card.getFace()  > p1Card.getFace()) {
            System.out.println("p2 card number is greater than p1 card number : P2 wins");
        } else if (p1Card.getSuit() > p2Card.getSuit()) {
            System.out.println("p1 card Suit is greater than p2 card Suit : P1 wins");
        } else if (p2Card.getSuit()  > p1Card.getSuit()) {
            System.out.println("p2 card Suit is greater than p1 card Suit : P2 wins");

        }


    }
}