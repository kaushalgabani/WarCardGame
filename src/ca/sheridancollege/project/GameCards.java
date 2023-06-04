package ca.sheridancollege.project;

/**
 *
 * @author Kaushal Gabani
 * @author Jay Paranjkumar Patel
 * @author Feby Jomy
 * @author Ramandeep Dhaliwal
 * @date: July 19, 2022
 */
public class GameCards extends Card{
    
    public enum Suit {
        CLUB, SPADES, HEART, DIAMOND
    }

    public enum Value {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, 
        TEN, JACK, QUEEN, KING, ACE
    }
    
    private final Suit suit;
    private final Value value;

    public GameCards(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }
    
    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card [Suit = " + suit + " | rank = " + value + "]";
    }
}
