package cards;

/**
 *
 * @author JoshMak
 */
public class Card {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Value of card.
     * @see Value
     */
    private Value value;
    /**
     * Suit of card.
     * @see Suit
     */
    private Suit suit;
    /**
     * Color of card.
     * @see Color
     */
    private Color color;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a card with a value and suit.
     * @param value value of card
     * @param suit suit of card
     */
    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        this.color = color(suit);
    }
    
    /**
     * Creates a card with a value.
     * @param value value of card
     */
    public Card(Value value) {
        this.value = value;
        this.suit = Suit.NONE;
        this.color = Color.NONE;
    }
    
    /**
     * Creates a card.
     */
    public Card() {
        this.value = Value.NONE;
        this.suit = Suit.NONE;
        this.color = Color.NONE;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set Methods">
    /**
     * Gets the value of the card.
     * @return value of card
     * @see Value
     */
    public Value value() {
        return value;
    }
    
    /**
     * Gets the suit of the card.
     * @return suit of card
     * @see Suit
     */
    public Suit suit() {
        return suit;
    }
    
    /**
     * Gets the color of the card.
     * @return color of card
     * @see Color
     */
    public Color color() {
        return color;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Helper Methods">
    /**
     * Determines color of card based on suit.
     * @param suit suit of card
     * @return color of card
     * @see Color
     */
    private Color color(Suit suit) {
        if(suit == Suit.DIAMONDS || suit == Suit.HEARTS)
            return Color.RED;
        else if(suit == Suit.CLUBS || suit == Suit.SPADES)
            return Color.BLACK;
        return Color.NONE;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Representation Methods">
    /**
     * Gets a phrase describing the value and value of the card.
     * @return display string of card
     */
    public String title() {
        return value.value() > 10 ? toString() : value.value() + " of " + suit.name().toLowerCase();
    }
    
    @Override
    public String toString() {
        return value.name().toLowerCase() + " of " + suit.name().toLowerCase();
    }
    //</editor-fold>
}