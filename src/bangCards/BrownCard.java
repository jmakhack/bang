package bangCards;

import cards.*;
/**
 *
 * @author JoshMak
 */
public class BrownCard extends Card {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Name of brown card.
     */
    private Brown name;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new brown card.
     * @param name name of card
     * @param value value of card
     * @param suit suit of card
     */
    public BrownCard(Brown name, Value value, Suit suit) {
        super(value, suit);
        this.name = name;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set Methods">
    /**
     * Gets the name of the card.
     * @return name of card
     */
    public Brown name() {
        return name;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Representation Methods">
    /**
     * Gets a String description of the brown card.
     * @return string description of card
     */
    public String description() {
        switch(name) {
            case BANG: return "Bang! cards are the main method to reduce other players life points.";
            case MISSED: return "If you are hit by a Bang! you may immediately play a Missed! to cancel the shot";
            case BEER: return "This card lets you regain one life point.";
            case CAT_BALOU: return "Force any one player to discard a card regardless of the distance.";
            case STAGECOACH: return "Draw two cards from the top of the deck.";
            case PANIC: return "Draw a card from a player at distance 1";
            case DUEL: return "A target player regardless of distance discards a Bang!, then you, etc. First player failing to discard a Bang! loses one life point.";
            case WELLS_FARGO: return "Draw three cards from the top of the deck.";
            case GATLING: return "Shoots a Bang! to all the other players regardless of the distance.";
            case INDIANS: return "All the other players may discard a Bang! card or lose one life point.";
            case GENERAL_STORE: return "Turn as many cards from the deck face up as the players still playing. Starting with you and proceeding clockwise, each player chooses one of those cards and puts it in his hand.";
            case SALOON: return "All players in play regain one life point.";
            default: return "???";
        }
    }
    
    @Override
    public String title() {
        return name.toString();
    }
    
    @Override
    public String toString() {
        return name.toString() + " (" + super.toString() + ")";
    }
    //</editor-fold>
}