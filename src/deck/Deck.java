package deck;

import cards.Card;
import java.util.*;

/**
 *
 * @author JoshMak
 */
public class Deck {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Contains a list of all the cards in the deck.
     */
    private List<Card> deck;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new empty deck.
     */
    public Deck() {
        deck = new ArrayList<>();
    }
    
    /**
     * Creates a deck of cards.
     * @param cards list of cards in initial deck
     */
    public Deck(List<Card> cards) {
        deck = cards;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Action Methods">
    /**
     * Draws the top card from the deck and removes it from the deck.
     * @return top card of the deck
     */
    public Card draw() {
        return deck.remove(0);
    }
    
    /**
     * Adds a card to the top of the deck.
     * @param card card to add to the top of the deck
     */
    public void add(Card card) {
        deck.add(0, card);
    }
    
    /**
     * Adds a list of cards to the top of the deck.
     * @param cards list of cards to add to top of deck
     */
    public void add(List<Card> cards) {
        deck.addAll(0, cards);
    }
    
    /**
     * Randomly shuffles the entire deck of cards.
     * @see Collections.shuffle
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set Methods">
    /**
     * Gets a value for the number of cards in the deck.
     * @return size of deck
     */
    public int size() {
        return deck.size();
    }
    
    /**
     * Gets whether or not there are still cards in the deck.
     * @return true if deck is empty, otherwise false
     */
    public boolean isEmpty() {
        return deck.isEmpty();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Representation Methods">
    @Override
    public String toString() {
        return deck.size() + " card deck";
    }
    //</editor-fold>
}