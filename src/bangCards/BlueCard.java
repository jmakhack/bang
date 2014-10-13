package bangCards;

import cards.*;
/**
 *
 * @author JoshMak
 */
public class BlueCard extends Card {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Name of blue card
     */
    private Blue name;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new blue card.
     * @param name name of card
     * @param value value of card
     * @param suit suit of card
     */
    public BlueCard(Blue name, Value value, Suit suit) {
        super(value, suit);
        this.name = name;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set Methods">
    /**
     * Gets the name of the blue card.
     * @return name of card
     */
    public Blue name() {
        return name;
    }
    
    /**
     * Gets the range of the blue card gun.
     * @return range of gun, 0 if not a gun
     */
    public int range() {
        switch(name) {
            case VOLCANIC: return 1;
            case SCHOFIELD: return 2;
            case REMINGTON: return 3;
            case REV_CARBINE: return 4;
            case WINCHESTER: return 5;
            default: return 0;
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Representation Methods">
    /**
     * Gets a String description of the blue card.
     * @return string description of blue card
     */
    public String description() {
        switch(name) {
            case BARREL: return "\"Draw!\" when you are attacked by cards with BANG! symbols. If it is a heart, then the attack misses.";
            case MUSTANG: return "Others view you at distance +1.";
            case SCOPE: return "You view others at distance -1.";
            case JAIL: return "\"Draw!\" at the beginning of your turn. If it is a heart, discard the card, play normally. Else discard the Jail and skip your turn.";
            case DYNAMITE: return "\"Draw!\" at the beginning of your turn. If the \"drawn!\" card is a 2-9 of spades, lose 3 life points. Else pass the Dynamite on your left.";
            case VOLCANIC: return "With this card in play you may play any number of BANG! cards during your turn. These BANG! cards can be aimed at the same or different targets, but are limited to a distance of 1.";
            case SCHOFIELD: return "While this is in play, you may fire BANG! at any player you see within distance 2.";
            case REMINGTON: return "While this is in play, you may fire BANG! at any player you see within distance 3.";
            case REV_CARBINE: return "While this is in play, you may fire BANG! at any player you see within distance 4.";
            case WINCHESTER: return "While this is in play, you may fire BANG! at any player you see within distance 5.";
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