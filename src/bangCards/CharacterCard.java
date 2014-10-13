package bangCards;

import cards.*;
/**
 *
 * @author JoshMak
 */
public class CharacterCard extends Card {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Number of maximum life points for the character
     */
    private int maxLifePoints;
    /**
     * Name of character
     */
    private Character name;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new character card.
     * @param name name of character
     */
    public CharacterCard(Character name) {
        super();
        this.name = name;
        this.maxLifePoints = name == Character.PAUL_REGRET || name == Character.EL_GRINGO ? 3 : 4;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set Methods">
    /**
     * Gets the maximum number of life points of character.
     * @return maximum life points
     */
    public int maxLifePoints() {
        return maxLifePoints;
    }
    
    /**
     * Gets the name of character on card.
     * @return name of character
     */
    public Character name() {
        return name;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Representation Methods">
    /**
     * Gets a String description of the character on the card.
     * @return string description of card
     */
    public String description() {
        switch(name) {
            case BART_CASSIDY: return "Each time he is hit,he draws a card.";
            case BLACK_JACK: return "He shows the second card he draws. On Heart or Diamonds, he draws one more card.";
            case CALAMITY_JANET: return "She can play Bang! cards as Missed! cards and vice versa.";
            case EL_GRINGO: return "Each time he is hit by a player, he draws a card from the hand of that player.";
            case JESSE_JONES: return "He may draw his first card from the hand of a player.";
            case JOURDONNAIS: return "Whenever he is the target of a Bang!, he may \"draw!\": on a Heart, he is missed.";
            case KIT_CARLSON: return "He looks at the top three cards of the deck and chooses the 2 to draw.";
            case LUCKY_DUKE: return "Each time he \"draws!\", he flips the top two cards and chooses one.";
            case PAUL_REGRET: return "All players see him at a distance increased by 1.";
            case PEDRO_RAMIREZ: return "He maydraw his first card from the discard pile.";
            case ROSE_DOOLAN: return "She sees all players at a distance decreased by 1.";
            case SID_KETCHUM: return "He may discard 2 cards to regain one life point.";
            case SLAB_THE_KILLER: return "Player need 2 Missed! cards to cancel his Bang! card.";
            case SUZY_LAFAYETTE: return "As soon as she has no cards in hand, she draws a card.";
            case VULTURE_SAM: return "Whenever a player is eliminated from play, he takes in hand all the cards of that player.";
            case WILLY_THE_KID: return "He can play any number of Bang! cards.";
            default: return "???";
        }
    }
    
    @Override
    public String title() {
        return toString();
    }
    
    @Override
    public String toString() {
        return name.toString();
    }
    //</editor-fold>
}