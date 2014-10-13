package bangCards;

/**
 *
 * @author JoshMak
 */
public enum Brown {
    BANG("Bang!"),
    MISSED("Missed!"),
    BEER("Beer"),
    CAT_BALOU("Cat Balou"),
    STAGECOACH("Stagecoach"),
    PANIC("Panic!"),
    DUEL("Duel"),
    WELLS_FARGO("Wells Fargo"),
    GATLING("Gatling"),
    INDIANS("Indians!"),
    GENERAL_STORE("General Store"),
    SALOON("Saloon");
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Name of brown card
     */
    private final String name;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new brown card name.
     * @param name name of brown card
     */
    private Brown(String name) {
        this.name = name;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Representation Methods">
    @Override
    public String toString() {
        return name;
    }
    //</editor-fold>
}
