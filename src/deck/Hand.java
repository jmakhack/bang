package deck;

import cards.Card;
import java.util.*;

/**
 *
 * @author JoshMak
 */
public class Hand {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Contains a list of all the cards in the hand.
     */
    private List<Card> hand;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new empty hand.
     */
    public Hand() {
        hand = new ArrayList<>();
    }
    
    /**
     * Creates a new hand.
     * @param cards list of cards in initial hand
     */
    public Hand(List<Card> cards) {
        hand = cards;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set Methods">
    /**
     * Gets a value for the number of cards in the hand.
     * @return size of hand
     */
    public int size() {
        return hand.size();
    }
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Action Methods">
    /**
     * Adds a card to the hand.
     * @param card card to add
     */
    public void add(Card card) {
        hand.add(card);
    }
    
    /**
     * Removes a card from the hand.
     * @param card card to remove
     * @return true if card exists, otherwise false
     */
    public boolean remove(Card card) {
        return hand.remove(card);
    }
    
    /**
     * Gets and removes all the cards from the hand.
     * @return all cards in hand
     */
    public List<Card> takeAll() {
        List<Card> cards = new ArrayList<>();
        cards.addAll(hand);
        hand.clear();
        return cards;
    }
    
    /**
     * Gets and removes a single card from the hand.
     * @param index index of card in hand
     * @return removed card
     */
    public Card take(int index) {
        return index >= hand.size() ? null : hand.remove(index);
    }
    
    /**
     * Gets and removes a random card from the hand.
     * @return removed card
     */
    public Card takeRandom() {
        return hand.isEmpty() ? null : hand.remove((int)(Math.random()*hand.size()));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Representation Methods">
    /**
     * Displays the hand for the text based version of this game.
     * @return string representation of hand
     */
    public String display() {
        String cards = "";
        for(int i = 0; i < hand.size(); i++) {
            cards += "(" + i + ") " + hand.get(i).title();
            if(i < hand.size() - 1)
                cards += ", ";
        }
        return cards;
    }
    
    @Override
    public String toString() {
        return hand.size() + " card hand";
    }
    //</editor-fold>
}