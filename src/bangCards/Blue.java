package bangCards;

/**
 *
 * @author JoshMak
 */
public enum Blue {
    BARREL("Barrel"),
    MUSTANG("Mustang"),
    SCOPE("Scope"),
    JAIL("Jail"),
    DYNAMITE("Dynamite"),
    VOLCANIC("Volcanic"),
    SCHOFIELD("Schofield"),
    REMINGTON("Remington"),
    REV_CARBINE("Rev. Carbine"),
    WINCHESTER("Winchester");
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Name of blue card
     */
    private final String name;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new blue card name.
     * @param name name of blue card
     */
    private Blue(String name) {
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