package bangCards;

/**
 *
 * @author JoshMak
 */
public enum Character {
    BART_CASSIDY("Bart Cassidy"), //
    BLACK_JACK("Black Jack"), //
    CALAMITY_JANET("Calamity Janet"), //Done
    EL_GRINGO("El Gringo"), //
    JESSE_JONES("Jesse Jones"), //
    JOURDONNAIS("Jourdonnais"), //
    KIT_CARLSON("Kit Carlson"), //
    LUCKY_DUKE("Luky Duke"), //
    PAUL_REGRET("Paul Regret"), //Done
    PEDRO_RAMIREZ("Pedro Ramirez"), //Done
    ROSE_DOOLAN("Rose Doolan"), //
    SID_KETCHUM("Sid Ketchum"), //
    SLAB_THE_KILLER("Slab the Killer"), //
    SUZY_LAFAYETTE("Suzy Lafayette"), //Done
    VULTURE_SAM("Vulture Sam"), //
    WILLY_THE_KID("Willy the Kid"); //
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Name of character
     */
    private final String name;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Creates a new Character.
     * @param name name of character
     */
    private Character(String name) {
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
