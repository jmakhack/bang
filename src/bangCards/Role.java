package bangCards;

/**
 *
 * @author JoshMak
 */
public enum Role {
    SHERIFF("Sheriff"),
    DEPUTY("Deputy"),
    OUTLAW("Outlaw"),
    RENEGADE("Renegade");
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Name of role
     */
    private final String name;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new role
     * @param name name of role
     */
    private Role(String name) {
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
