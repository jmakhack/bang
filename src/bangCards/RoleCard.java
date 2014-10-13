package bangCards;

import cards.*;

/**
 *
 * @author JoshMak
 */
public class RoleCard extends Card {
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    /**
     * Role on card
     * @see Role
     */
    private Role role;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Create a new role card.
     * @param role role of card
     */
    public RoleCard(Role role) {
       super();
       this.role = role;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Get/Set Methods">
    /**
     * Get the role of the card.
     * @return role on card
     * @see Role
     */
    public Role role() {
        return role;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Representation Methods">
    /**
     * Get a String description of the role card.
     * @return description on card
     */
    public String description() {
        if(role == Role.SHERIFF)
            return "Kill all the Outlaws and the Renegade!";
        else if(role == Role.DEPUTY)
            return "Protect the Sheriff! Kill all the Outlaws and the Renegade!";
        else if(role == Role.OUTLAW)
            return "Kill the Sheriff!";
        else
            return "Be the last one in play!";
    }
    
    @Override
    public String title() {
        return toString();
    }
    
    @Override
    public String toString() {
        return role.toString();
    }
    //</editor-fold>
}