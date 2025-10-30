/*
RubberDuck.java
@description: A simple class instantiation to show how objects work.
@author: pcostjr
@created: 10.14.2025
@last-update: 10.14.2025
*/

// all Java classes are housed in between this class declaration
public class Card
{

    private final int face;
    private final int suit;
    private final String[] faces = {null,"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}
    private final String[] suits = {null, "Spades","Hearts","Clubs","Diamonds"}



    public Card( int face, int suit) {
        // in this case, we can use the same variable names, so long as we use the 'this' keyword to specify
        // when we want to use the instance variables vs the local variables.

        this.face = face;
        this.suit = suit;

    }

    public String getFace(){
        return face;
    }


    public String getSuit(){
        return suit;
    }
    public String toString(){return faces[face] + " of " + suits[suit]; }


}