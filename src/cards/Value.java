package cards;

/**
 *
 * @author JoshMak
 */
public enum Value {
    NONE(0),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14),
    JOKER(15);
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Integer value of card.
     */
    private final int value;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Sets the integer value of the card.
     * @param value integer value of the card
     */
    private Value(final int value){
        this.value = value;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set Methods">
    /**
     * Gets the integer value of the card.
     * @return integer value of card
     */
    public int value() {
        return value > 10 ? (value == 14 ? 11 : (value == 15 ? -1 : 10)) : value;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Comparison Methods">
    /**
     * Checks if the value of this card is greater than the value of another.
     * @param value value of card
     * @return true if this card's value is greater than the other, otherwise false
     */
    public boolean isGreaterThan(Value value) {
        return this.value > value.value;
    }
    
    /**
     * Checks if the value of this card is less than the value of another.
     * @param value value of card
     * @return true if this card's value is less than the other, otherwise false
     */
    public boolean isLessThan(Value value) {
        return this.value < value.value;
    }
    //</editor-fold>
}
