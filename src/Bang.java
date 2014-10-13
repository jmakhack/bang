import deck.Deck;
import deck.Hand;
import deck.Discard;
import bangCards.Brown;
import bangCards.Blue;
import bangCards.BrownCard;
import bangCards.Role;
import bangCards.CharacterCard;
import bangCards.Character;
import bangCards.RoleCard;
import bangCards.BlueCard;
import cards.*;
import java.util.*;
/**
 * A computer version of the popular card game BANG!
 * @author JoshMak
 */
public class Bang {
    
    //<editor-fold defaultstate="collapsed" desc="Class Variables">
    private static List<Player> players = new ArrayList<>();
    private static Card[] characters = new Card[] {
        //<editor-fold defaultstate="collapsed" desc="Character Cards">
        new CharacterCard(Character.BART_CASSIDY),
        new CharacterCard(Character.BLACK_JACK),
        new CharacterCard(Character.CALAMITY_JANET),
        new CharacterCard(Character.EL_GRINGO),
        new CharacterCard(Character.JESSE_JONES),
        new CharacterCard(Character.JOURDONNAIS),
        new CharacterCard(Character.KIT_CARLSON),
        new CharacterCard(Character.LUCKY_DUKE),
        new CharacterCard(Character.PAUL_REGRET),
        new CharacterCard(Character.PEDRO_RAMIREZ),
        new CharacterCard(Character.ROSE_DOOLAN),
        new CharacterCard(Character.SID_KETCHUM),
        new CharacterCard(Character.SLAB_THE_KILLER),
        new CharacterCard(Character.SUZY_LAFAYETTE),
        new CharacterCard(Character.VULTURE_SAM),
        new CharacterCard(Character.WILLY_THE_KID)
        //</editor-fold>
    };
    private static Card[] cards = new Card[] { 
        //<editor-fold defaultstate="collapsed" desc="Cards in Deck">
        new BrownCard(Brown.SALOON, Value.FIVE, Suit.HEARTS),
        new BrownCard(Brown.GENERAL_STORE, Value.NINE, Suit.CLUBS),
        new BrownCard(Brown.GENERAL_STORE, Value.QUEEN, Suit.SPADES),
        new BrownCard(Brown.INDIANS, Value.KING, Suit.DIAMONDS),
        new BrownCard(Brown.INDIANS, Value.ACE, Suit.DIAMONDS),
        new BrownCard(Brown.GATLING, Value.TEN, Suit.HEARTS),
        new BrownCard(Brown.WELLS_FARGO, Value.THREE, Suit.HEARTS),
        new BrownCard(Brown.DUEL, Value.QUEEN, Suit.DIAMONDS),
        new BrownCard(Brown.DUEL, Value.EIGHT, Suit.CLUBS),
        new BrownCard(Brown.DUEL, Value.JACK, Suit.SPADES),
        new BrownCard(Brown.PANIC, Value.ACE, Suit.HEARTS),
        new BrownCard(Brown.PANIC, Value.JACK, Suit.HEARTS),
        new BrownCard(Brown.PANIC, Value.QUEEN, Suit.HEARTS),
        new BrownCard(Brown.PANIC, Value.EIGHT, Suit.DIAMONDS),
        new BrownCard(Brown.STAGECOACH, Value.NINE, Suit.SPADES),
        new BrownCard(Brown.STAGECOACH, Value.NINE, Suit.SPADES),
        new BrownCard(Brown.CAT_BALOU, Value.TEN, Suit.DIAMONDS),
        new BrownCard(Brown.CAT_BALOU, Value.NINE, Suit.DIAMONDS),
        new BrownCard(Brown.CAT_BALOU, Value.JACK, Suit.DIAMONDS),
        new BrownCard(Brown.CAT_BALOU, Value.KING, Suit.HEARTS),
        new BrownCard(Brown.BEER, Value.TEN, Suit.HEARTS),
        new BrownCard(Brown.BEER, Value.SEVEN, Suit.HEARTS),
        new BrownCard(Brown.BEER, Value.EIGHT, Suit.HEARTS),
        new BrownCard(Brown.BEER, Value.JACK, Suit.HEARTS),
        new BrownCard(Brown.BEER, Value.SIX, Suit.HEARTS),
        new BrownCard(Brown.BEER, Value.NINE, Suit.HEARTS),
        new BrownCard(Brown.MISSED, Value.QUEEN, Suit.HEARTS),
        new BrownCard(Brown.MISSED, Value.SEVEN, Suit.SPADES),
        new BrownCard(Brown.MISSED, Value.KING, Suit.CLUBS),
        new BrownCard(Brown.MISSED, Value.THREE, Suit.SPADES),
        new BrownCard(Brown.MISSED, Value.TEN, Suit.CLUBS),
        new BrownCard(Brown.MISSED, Value.SIX, Suit.SPADES),
        new BrownCard(Brown.MISSED, Value.FOUR, Suit.SPADES),
        new BrownCard(Brown.MISSED, Value.TWO, Suit.SPADES),
        new BrownCard(Brown.MISSED, Value.JACK, Suit.CLUBS),
        new BrownCard(Brown.MISSED, Value.ACE, Suit.CLUBS),
        new BrownCard(Brown.MISSED, Value.EIGHT, Suit.SPADES),
        new BrownCard(Brown.MISSED, Value.FIVE, Suit.SPADES),
        new BrownCard(Brown.BANG, Value.TWO, Suit.CLUBS),
        new BrownCard(Brown.BANG, Value.FIVE, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.QUEEN, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.NINE, Suit.CLUBS),
        new BrownCard(Brown.BANG, Value.JACK, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.THREE, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.SEVEN, Suit.CLUBS),
        new BrownCard(Brown.BANG, Value.SIX, Suit.CLUBS),
        new BrownCard(Brown.BANG, Value.THREE, Suit.CLUBS),
        new BrownCard(Brown.BANG, Value.QUEEN, Suit.HEARTS),
        new BrownCard(Brown.BANG, Value.SIX, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.ACE, Suit.SPADES),
        new BrownCard(Brown.BANG, Value.ACE, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.SEVEN, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.TWO, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.ACE, Suit.HEARTS),
        new BrownCard(Brown.BANG, Value.FOUR, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.KING, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.FOUR, Suit.CLUBS),
        new BrownCard(Brown.BANG, Value.FIVE, Suit.CLUBS),
        new BrownCard(Brown.BANG, Value.EIGHT, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.NINE, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.TEN, Suit.DIAMONDS),
        new BrownCard(Brown.BANG, Value.KING, Suit.HEARTS),
        new BrownCard(Brown.BANG, Value.EIGHT, Suit.CLUBS),
        new BlueCard(Blue.DYNAMITE, Value.TWO, Suit.HEARTS),
        new BlueCard(Blue.JAIL, Value.FOUR, Suit.HEARTS),
        new BlueCard(Blue.JAIL, Value.JACK, Suit.SPADES),
        new BlueCard(Blue.JAIL, Value.TEN, Suit.SPADES),
        new BlueCard(Blue.VOLCANIC, Value.TEN, Suit.CLUBS),
        new BlueCard(Blue.VOLCANIC, Value.TEN, Suit.SPADES),
        new BlueCard(Blue.SCHOFIELD, Value.JACK, Suit.CLUBS),
        new BlueCard(Blue.SCHOFIELD, Value.QUEEN, Suit.CLUBS),
        new BlueCard(Blue.SCHOFIELD, Value.KING, Suit.SPADES),
        new BlueCard(Blue.REMINGTON, Value.KING, Suit.CLUBS),
        new BlueCard(Blue.REV_CARBINE, Value.ACE, Suit.SPADES),
        new BlueCard(Blue.WINCHESTER, Value.EIGHT, Suit.SPADES),
        new BlueCard(Blue.SCOPE, Value.ACE, Suit.SPADES),
        new BlueCard(Blue.MUSTANG, Value.EIGHT, Suit.HEARTS),
        new BlueCard(Blue.MUSTANG, Value.NINE, Suit.HEARTS),
        new BlueCard(Blue.BARREL, Value.KING, Suit.SPADES),
        new BlueCard(Blue.BARREL, Value.QUEEN, Suit.SPADES) //</editor-fold> 
    };
    private static Deck deck;
    private static Discard discard;
    private static boolean bangPlayed;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Setup Methods">
    private static void setup() {
        System.out.println("Bang! The Virtual Card Game\n");
        int numPlayers = getNumberOfPlayers();
        createPlayers(numPlayers);
        Deck roleDeck = createRoles(numPlayers);
        roleDeck.shuffle();
        setRoles(roleDeck);
        Deck characterDeck = new Deck(new ArrayList<>(Arrays.asList(characters)));
        characterDeck.shuffle();
        setCharacters(characterDeck);
        deck = new Deck(new ArrayList<>(Arrays.asList(cards)));
        deck.shuffle();
        giveStartingHands();
        discard = new Discard();
    }
    
    private static int getNumberOfPlayers() {
        Scanner reader = new Scanner(System.in);
        int numPlayers;
        while(true) {
            try {
                System.out.print("How many players: ");
                numPlayers = reader.nextInt();
                if(numPlayers < 4) {
                    System.out.println("Bang! requires at least 4 players.\n");
                } else if(numPlayers > 7) {
                    System.out.println("Bang! can only play up to 7 players.\n");
                } else {
                    return numPlayers;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                reader.nextLine();
            }
        }
    }
   
    private static void createPlayers(int numPlayers) {
        players.add(new Player(getName(1)));
        players.add(new Player(getName(2)));
        players.add(new Player(getName(3)));
        players.add(new Player(getName(4)));
        if(numPlayers > 4) players.add(new Player(getName(5)));
        if(numPlayers > 5) players.add(new Player(getName(6)));
        if(numPlayers > 6) players.add(new Player(getName(7)));
        System.out.println("");
    }
    
    private static String getName(int playerNum) {
        Scanner reader = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("\nPlayer " + playerNum + ", what is your name?");
                return reader.next();
            } catch(InputMismatchException e) {
                System.out.println("Invalid Output");
                reader.nextLine();
            }
        }
    }
    
    private static Deck createRoles(int numPlayers) {
        Card sheriff = new RoleCard(Role.SHERIFF);
        Card outlaw = new RoleCard(Role.OUTLAW);
        Card renegade = new RoleCard(Role.RENEGADE);
        Card deputy = new RoleCard(Role.DEPUTY);
        Deck roleDeck = new Deck(new ArrayList<>(Arrays.asList(sheriff, renegade, outlaw, outlaw)));
        switch(numPlayers) {
            case(7): roleDeck.add(deputy);
            case(6): roleDeck.add(outlaw);
            case(5): roleDeck.add(deputy);
        }
        return roleDeck;
    }
   
    private static void setRoles(Deck roles) {
        for(Player player: players) 
            player.setRole((RoleCard)roles.draw());
        System.out.println(getSheriff().name() + " is the Sheriff!\n");
    }
    
    private static Player getSheriff() {
        for(Player player: players)
            if(player.role().role() == Role.SHERIFF)
                return player;
        return null;
    }
   
    private static void setCharacters(Deck characters) {
        for(Player player: players) {
            player.setCharacter((CharacterCard)characters.draw());
            System.out.println(player.name() + "'s character is " + player.character().toString() + ".");
        }
        System.out.println("");
    }
   
    private static void giveStartingHands() {
        for(Player player: players)
            for(int i = 0; i < player.lifePoints(); i++)
                player.hand().add(deck.draw());
        System.out.println("All players have been given their starting hands.\n");
    }
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Status/Action Methods">
    private static List<Role> getRolesLeft() {
        List<Role> rolesLeft = new ArrayList<>();
        for(Player player: players)
            rolesLeft.add(player.role().role());
        return rolesLeft;
    }
   
    private static boolean isGameOver() {
        return !(getRolesLeft().contains(Role.SHERIFF) && 
                (getRolesLeft().contains(Role.OUTLAW) || getRolesLeft().contains(Role.RENEGADE)));
    }
    
    private static Role getWinner() {
        List<Role> rolesLeft = getRolesLeft();
        if(rolesLeft.contains(Role.SHERIFF)) return Role.SHERIFF;
        if(rolesLeft.size() > 1 || rolesLeft.contains(Role.OUTLAW)) return Role.OUTLAW;
        return Role.RENEGADE;
    }
    
    private static void displayWinMessage() {
        switch(getWinner()) {
            case SHERIFF:
                System.out.println("Congratulations Sheriff and Deputy! You Win!");
                break;
            case OUTLAW:
                System.out.println("Congratulations Outlaws! You Win!");
                break;
            case RENEGADE:
                System.out.println("Congratulations Renegade! You Win!");
                break;
            default:
                System.out.println("Somehow, no one won... Weird...");
        }
    }
    
    private static Player nextPlayer(Player player) {
        return players.indexOf(player) == players.size() - 1 ? players.get(0) : players.get(players.indexOf(player) + 1);
    }
    
    private static void removePlayer(Player player, Player killer) {
        players.remove(player);
        discard.add(player.takeAllCardsFromPlay());
        discard.add(player.takeAllCardsFromHand());
        System.out.println(player.name() + " is dead!");
        System.out.println(player.name() + " was a " + player.role().toString() + ".\n");
        if(killer != null) {
            if(player.role().role() == Role.OUTLAW) {
                killer.hand().add(deck.draw());
                killer.hand().add(deck.draw());
                killer.hand().add(deck.draw());
                System.out.println(killer.name() + " gets to draw three cards for killing an Outlaw.\n");
            }
            if(player.role().role() == Role.DEPUTY && killer.role().role() == Role.SHERIFF) {
                discard.add(killer.takeAllCardsFromPlay());
                discard.add(killer.takeAllCardsFromHand());
                System.out.println(killer.name() + " must discard all of his/her cards for killing a Deputy.\n");
            }
        }
    }
    
    private static Card drawCard() {
        if(deck.isEmpty()) {
            deck.add(discard.top(discard.size()));
            deck.shuffle();
            System.out.println("The discard pile has been shuffled into the deck.\n");
        }
        return deck.draw();
    }
    
    private static String displayOtherPlayers(Player player) {
        String display = "";
        int i = 0;
        for(Player p: players)
            if(p != player)
                display += "(" + i++ + ") " + p.name() + " ";
        return display;
    }
    
    private static void play(Player player, Card card) {
        if(card instanceof BlueCard) {
            playBlueCard(player, (BlueCard)card);
        } else if(card instanceof BrownCard){
            playBrownCard(player, (BrownCard)card);
        }
    }
    
    private static void playBlueCard(Player player, BlueCard card) {
        if((card).name() == Blue.JAIL) {
            playJail(player, card);
        } else {
            Card replacedCard = player.addToPlay(card);
            if(replacedCard != null)
                discard.add(replacedCard);
        }
    }
    
    private static void playBrownCard(Player player, BrownCard card) {
        switch(card.name()) {
            case BANG:
                playBang(player, card);
                break;
            case MISSED:
                playMissed(player, card);
                break;
            case BEER:
                playBeer(player, card);
                break;
            case SALOON:
                playSaloon(card);
                break;
            case STAGECOACH:
                playStagecoach(player, card);
                break;
            case WELLS_FARGO:
                playWellsFargo(player, card);
                break;
            case PANIC:
                playPanic(player, card);
                break;
            case CAT_BALOU:
                playCatBalou(player, card);
                break;
            case GATLING:
                playGatling(player, card);
                break;
            case INDIANS:
                playIndians(player, card);
                break;
            case GENERAL_STORE:
                playGeneralStore(player, card);
                break;
            case DUEL:
                playDuel(player, card);
                break;
        }
    }
    
    private static List<Player> playersInRange(Player player) {
        int vision; 
        int distance;
        List<Player> playersInRange = new ArrayList<>();
        for(Player p: players) {
            if(p != player) {
                vision = player.hasScope() ? player.gunRange() + 1 : player.gunRange();
                distance = Math.min(Math.abs(players.indexOf(p) - players.indexOf(player)), players.size() - Math.abs(Math.abs(players.indexOf(p) - players.indexOf(player))));
                if(p.hasMustang()) distance++;
                if(vision >= applyPaulRegretEffect(player, distance)) playersInRange.add(p);
            }
        }
        return playersInRange;
    }
    
    private static List<Player> playersInRangeOne(Player player) {
        List<Player> playersInRangeOne = new ArrayList<>();
        int range;
        for(Player p: players) {
            if(p != player) {
                range = Math.min(Math.abs(players.indexOf(p) - players.indexOf(player)), players.size() - Math.abs(Math.abs(players.indexOf(p) - players.indexOf(player))));
                if(p.hasMustang()) range++;
                if(player.hasScope()) range--;
                if(applyPaulRegretEffect(player, range) <= 1) playersInRangeOne.add(p);
            }
        }
        return playersInRangeOne;
    }
    
    private static List<Player> otherPlayers(Player player) {
        List<Player> otherPlayers = new ArrayList<>();
        for(Player p: players)
            if(p != player)
                otherPlayers.add(p);
        return otherPlayers;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Turn Phases">
    private static void drawPhase(Player player) {
        if(player.character().name() == Character.PEDRO_RAMIREZ) {
            applyPedroRamirezEffect(player);
        } else if(player.character().name() == Character.JESSE_JONES) {
            applyJesseJonesEffect(player);
        } else {
            player.hand().add(drawCard());
        }
        player.hand().add(drawCard());
        System.out.println(player.name() + " drew two cards.");
    }
    
    private static boolean playPhase(Player player) {
        Scanner reader = new Scanner(System.in);
        bangPlayed = false;
        int input;
        while(true) {
            System.out.println( player.hand().display()+ ", (" + player.hand().size() + ") End\n");
            System.out.print("Choose a card to play: ");
            try {
                input = reader.nextInt();
                if(input > player.hand().size() || input < 0) {
                    System.out.println("Invalid Input\n");
                    continue;
                } 
            } catch(InputMismatchException e) {
                System.out.println("Invalid Input\n");
                reader.next();
                continue;
            }
            System.out.println("");
            if(input == player.hand().size()) break;
            play(player, player.hand().take(input));
            applySuzyLafayetteEffect(player);
        }
        return true;
    }
    
    private static void discardPhase(Player player) {
        if(player.hand().size() > player.lifePoints()) {
            Scanner reader = new Scanner(System.in);
            System.out.println("You must discard " + (player.hand().size() - player.lifePoints()) + " cards.\n");
            int input;
            while(player.hand().size() > player.lifePoints()) {
                System.out.println(player.hand().display());
                System.out.print("Choose a card to discard: ");
                try {
                    input = reader.nextInt();
                    discard.add(player.hand().take(input));
                } catch(InputMismatchException e) {
                    System.out.println("Invalid Input");
                    reader.next();
                }
            }
            System.out.println();
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Character Effects">
    
    private static void applyBartCassidyEffect() {
        
    }
    
    private static boolean applyCalamityJanetEffect(Player player, BrownCard card) {
        return player.character().name() == Character.CALAMITY_JANET && (card.name() == Brown.MISSED || card.name() == Brown.BANG) ? true : false;
    }
    
    private static void applyElGringoEffect(Player player, Player shooter) {
        if(player.character().name() == Character.EL_GRINGO) {
            Card card = shooter.hand().takeRandom();
            if(card != null) {
                player.hand().add(card);
            }
        }
    }
    
    private static void applyJesseJonesEffect(Player player) {
        Scanner reader = new Scanner(System.in);
        String response;
        int index;
        System.out.println("Do you want to draw your first card from the hand of another player?");
        System.out.print("Y or N: ");
        OUTER:
        while (true) {
            System.out.print("Type Y or N: ");
            try {
                response = reader.next();
                if(response.toLowerCase().equals("y")) {
                    System.out.println(displayOtherPlayers(player) + ", (" + (players.size()-1) + ") Cancel");
                    System.out.print("Choose a player: ");
                    while(true) {
                        try {
                            index = reader.nextInt();
                            if(index < 0 || index >= players.size()) {
                                throw new InputMismatchException();
                            } else if(index == players.size() - 1) {
                                break;
                            } else {
                                player.hand().add(otherPlayers(player).get(index).hand().takeRandom());
                                System.out.println("You draw your first card from " + otherPlayers(player).get(index).name() + ".\n");
                                break OUTER;
                            }
                        } catch(InputMismatchException e) {
                            System.out.println("Invalid Input");
                            reader.nextLine();
                        }
                    }
                    break;
                } else if(response.toLowerCase().equals("n")) {
                    player.hand().add(drawCard());
                    break; 
                } else {
                    throw new InputMismatchException();
                }
            } catch(InputMismatchException e) {
               System.out.println("Invalid Input");
               reader.nextLine();
           }
        }
    }
    
    private static boolean applyJourdonnaisEffect(Player player) {
        if(player.character().name() == Character.JOURDONNAIS) {
            System.out.println("You draw a card for Jourdonnais' character effect.");
            Card card = drawCard();
            System.out.println("You draw a " + card.toString() + ".");
            if(card.suit() == Suit.HEARTS) {
                System.out.println("You have successfully used your character ability.\n");
                return true;
            }
            System.out.print("You have failed to use your character ability.\n");
        }
        return false;
    }
    
    private static Card applyLuckyDukeEffect() {
        Card card1 = drawCard();
        Card card2 = drawCard();
        System.out.println("You drew a " + card1.toString() + " and a " + card2.toString() + " using your character ability.");
        System.out.println("Which card would you like to get the effect of: (1) " + card1.toString() + ", (2) " + card2.toString() + "?");
        Scanner reader = new Scanner(System.in);
        int index;
        while(true) {
            try {
                index = reader.nextInt();
                if (index == 1) {
                    discard.add(card2);
                    discard.add(card1);
                    return card1;
                } else if(index == 2) {
                    discard.add(card1);
                    discard.add(card2);
                    return card2;
                } else {
                    throw new InputMismatchException();
                }
            } catch(InputMismatchException e) {
                System.out.println("Invalid Input");
                reader.nextLine();
            }
        }
    }
    
    private static int applyPaulRegretEffect(Player player, int distance) {
        return player.character().name() == Character.PAUL_REGRET ? distance + 1 : distance;
    }
    
    private static void applyPedroRamirezEffect(Player player) {
        if(discard.size() > 0) {
            Scanner reader = new Scanner(System.in);
            String response;
            System.out.println("Would you like to draw your first card from the discard pile?");
            System.out.println("The card is " + discard.top().title() + ".");
            OUTER:
            while (true) {
                System.out.print("Type Y or N: ");
                try {
                    response = reader.next();
                    switch (response.toLowerCase()) {
                        case "y":
                            player.hand().add(discard.takeTop());
                            break OUTER;
                        case "n":
                            player.hand().add(drawCard());
                            break OUTER; 
                        default:
                            throw new InputMismatchException();
                    }
                } catch(InputMismatchException e) {
                   System.out.println("Invalid Input");
                   reader.nextLine();
               }
            }
        }
    }
    
    private static boolean applySlabTheKillerEffect(Player shooter, Player player, Card card) {
        if(shooter.character().name() == Character.SLAB_THE_KILLER) {
            Card card2;
            Scanner reader = new Scanner(System.in);
            int index;
            System.out.println("Choose whether or not to play another card in response to Bang! due to Slab The Killer's ability.");
            System.out.println(player.hand().display() + ", (" + player.hand().size() + ") End");
            while(true) {
                System.out.print("Choose a card to play: ");
                try {
                    index = reader.nextInt();
                    if(index == player.hand().size()) {
                        player.hand().add(card);
                        applyElGringoEffect(player, shooter);
                        player.loseLife();
                        System.out.println(player.name() + " decided to take the hit.");
                        if(!player.isAlive()) {
                            removePlayer(player, shooter);
                        }
                        return true;
                    } else if(index >= player.hand().size() || index < 0) {
                        throw new InputMismatchException();
                    } else {
                        card2 = player.hand().take(index);
                        if(card2 instanceof BrownCard && (((BrownCard)card2).name() == Brown.MISSED) || applyCalamityJanetEffect(player, (BrownCard)card2)) {
                            System.out.println(player.name() + " played a second Missed!\n");
                            applySuzyLafayetteEffect(player);
                            discard.add(card2);
                            return false;
                        }
                        System.out.println("You cannot play this card in response to a Bang!");
                        player.hand().add(card2);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input");
                    reader.next();
                }
            }
        }
        return false;
    }
    
    private static void applySuzyLafayetteEffect(Player player) {
        if(player.character().name() == Character.SUZY_LAFAYETTE && player.hand().size() == 0)
            player.hand().add(deck.draw());
    }
    
    private static boolean applyWillyTheKidEffect(Player player) {
        return player.character().name() == Character.WILLY_THE_KID ? true : false;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Brown Card Effects">
    private static void playBang(Player player, BrownCard card) {
        if(!bangPlayed || (player.gun() != null && player.gun().name() == Blue.VOLCANIC) || applyWillyTheKidEffect(player)) {
            Scanner reader = new Scanner(System.in);
            List<Player> playersInRange = playersInRange(player);
            int index;
            for(int i = 0; i < playersInRange.size(); i++)
                System.out.print("(" + i + ") " + playersInRange.get(i).name() + ", ");
            System.out.println("(" + playersInRange.size() + ") Cancel");
            while(true) {
                System.out.print("Who do you want to Bang!: ");
                try {
                    index = reader.nextInt();
                    if(index <= playersInRange.size()) {
                        break;
                    } else {
                        System.out.println("Invalid Input");
                        reader.nextLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Input");
                    reader.nextLine();
                }
            }
            if(index < playersInRange.size()) {
                respondToBang(playersInRange.get(index), player);
                bangPlayed = true;
                discard.add(card);
            } else {
                player.hand().add(card);
            }
        } else {
            System.out.println("You cannot play more than one Bang! this turn.");
            player.hand().add(card);
        }
    }
    
    private static void playMissed(Player player, BrownCard card) {
        if(player.character().name() == Character.CALAMITY_JANET) {
            playBang(player, card);
        } else {
            System.out.println("You cannot play a Missed! during your own turn.");
            player.hand().add(card);
        }
    }
    
    private static void playBeer(Player player, BrownCard card) {
        if(players.size() == 2) {
            System.out.println("Beers do not apply when there are only two players left.");
            player.hand().add(card);
        } else if(player.gainLife()) {
            System.out.println("You have restored one life.");
            discard.add(card);
        } else {
            System.out.println("You are currently at full health.");
            player.hand().add(card);
        }
    }
    
    private static void playSaloon(BrownCard card) {
        for(Player player: players)
            player.gainLife();
        discard.add(card);
    }
    
    private static void playStagecoach(Player player, BrownCard card) {
        player.hand().add(deck.draw());
        player.hand().add(deck.draw());
        discard.add(card);
    }
    
    private static void playWellsFargo(Player player, BrownCard card) {
        player.hand().add(deck.draw());
        player.hand().add(deck.draw());
        player.hand().add(deck.draw());
        discard.add(card);
    }
    
    private static void playPanic(Player player, BrownCard card) {
        Scanner reader = new Scanner(System.in);
        int index;
        Player target;
        System.out.println("Choose who you want to Panic!");
        while(true) {
            try {
                for(int i = 0; i < playersInRangeOne(player).size(); i++)
                    System.out.print("(" + i + ") " + playersInRangeOne(player).get(i).name() + ", ");
                System.out.println("(" + playersInRangeOne(player).size() + ") Cancel");
                System.out.print("Play Panic! on: ");
                index = reader.nextInt();
                if(index > playersInRangeOne(player).size()) {
                    System.out.println("Invalid Input");
                    reader.nextLine();
                } else if(index == playersInRangeOne(player).size()) {
                    player.hand().add(card);
                    break;
                } else {
                    target = playersInRangeOne(player).get(index);
                    System.out.println("Choose a card you want to Panic!");
                    System.out.println(target.cardsInPlay() + ", (" + target.numCardsInPlay() + ") Take Random From Hand, (" + (target.numCardsInPlay()+1) + ") Cancel");
                    System.out.print("Play Panic! on: ");
                    index = reader.nextInt();
                    if(index < target.numCardsInPlay()) {
                        player.hand().add(target.takeCard(index));
                        discard.add(card);
                        break;
                    } else if(index == target.numCardsInPlay()) {
                        if(target.hand().size() > 0) {
                            player.hand().add(target.hand().takeRandom());
                            applySuzyLafayetteEffect(target);
                            discard.add(card);
                            break;
                        } 
                        System.out.println(target.name() + "'s hand is empty.");
                    } else if(index == target.numCardsInPlay()+1) {
                        continue;
                    } else {
                        System.out.println("Invalid Input");
                        reader.nextLine();
                    }
                }
            } catch(InputMismatchException e) {
                System.out.println("Invalid Input");
                reader.nextLine();
            }
        }
    }
    
    private static void playCatBalou(Player player, BrownCard card) {
        Scanner reader = new Scanner(System.in);
        int index;
        Player target;
        System.out.println("Choose who you want to Cat Balou.");
        while(true) {
            try {
                System.out.println(displayOtherPlayers(player) + ", (" + (players.size()-1) + ") Cancel");
                System.out.print("Play Cat Balou on: ");
                index = reader.nextInt();
                if(index >= players.size()) {
                    throw new InputMismatchException();
                } else if(index == players.size() - 1) {
                    player.hand().add(card);
                    break;
                } else {
                    target = otherPlayers(player).get(index);
                    System.out.println("Choose a card you want to Cat Balou.");
                    System.out.println(target.cardsInPlay() + ", (" + target.numCardsInPlay() + ") Take Random From Hand, (" + (target.numCardsInPlay()+1) + ") Cancel");
                    System.out.print("Play Cat Balou on: ");
                    index = reader.nextInt();
                    if(index < target.numCardsInPlay()) {
                        discard.add(card);
                        discard.add(target.takeCard(index));
                        break;
                    } else if(index == target.numCardsInPlay()) {
                        if(target.hand().size() > 0) {
                            discard.add(card);
                            discard.add(target.hand().takeRandom());
                            applySuzyLafayetteEffect(target);
                            break;
                        }
                        System.out.println(target.name() + "'s hand is empty.");
                    } else if(index == target.numCardsInPlay()+1) {
                        continue;
                    } else {
                        throw new InputMismatchException();
                    }
                }
            } catch(InputMismatchException e) {
                System.out.println("Invalid Input");
                reader.nextLine();
            }
        }
    }
    
    private static void playGatling(Player player, BrownCard card) {
        discard.add(card);
        Scanner reader = new Scanner(System.in);
        int index; 
        Card playedCard;
        for(Player p: otherPlayers(player)) {
            if(!resolveBarrel(p)) {
                System.out.println(p.name() + ", will you play a card in response to Gatling?");
                while(true) {
                    System.out.println(p.hand().display() + ", (" + p.hand().size() + ") Cancel");
                    System.out.print("Choose a card: ");
                    try {
                        index = reader.nextInt();
                        if(index < 0 || index > p.hand().size()) {
                            throw new InputMismatchException();
                        } else if(index == p.hand().size()) {
                            System.out.println(p.name() + " decided to take the hit from Gatling.");
                            applyElGringoEffect(p, player);
                            p.loseLife();
                            if(!p.isAlive())
                                removePlayer(p, player);
                            break;
                        } else {
                            playedCard = p.hand().take(index);
                            if(playedCard instanceof BrownCard && (((BrownCard)playedCard).name() == Brown.MISSED || applyCalamityJanetEffect(p, (BrownCard)card))) {
                                System.out.println(p.name() + " has successfully Missed! the Gatling.");
                                applySuzyLafayetteEffect(p);
                                discard.add(playedCard);
                                break;
                            } else {
                                System.out.println("You can only played Missed! in response to Gatling");
                                p.hand().add(playedCard);
                            }
                        }
                    } catch(InputMismatchException e) {
                        System.out.println("Invalid Input");
                        reader.nextLine();
                    }
                }
            }
        }
    }
    
    private static void playIndians(Player player, BrownCard card) {
        discard.add(card);
        Scanner reader = new Scanner(System.in);
        int index; 
        Card playedCard;
        for(Player p: otherPlayers(player)) {
            System.out.println(p.name() + ", will you play a card in response to Indians?");
            while(true) {
                System.out.println(p.hand().display() + ", (" + p.hand().size() + ") Cancel");
                System.out.print("Choose a card: ");
                try {
                    index = reader.nextInt();
                    if(index < 0 || index > p.hand().size()) {
                        throw new InputMismatchException();
                    } else if(index == p.hand().size()) {
                        System.out.println(p.name() + " decided to take the hit from Indians.");
                        applyElGringoEffect(p, player);
                        p.loseLife();
                        if(!p.isAlive())
                            removePlayer(p, player);
                        break;
                    } else {
                        playedCard = p.hand().take(index);
                        if(playedCard instanceof BrownCard && (((BrownCard)playedCard).name() == Brown.BANG || applyCalamityJanetEffect(p, (BrownCard)card))) {
                            System.out.println(p.name() + " has successfully played Bang! in response to Indians!");
                            discard.add(playedCard);
                            applySuzyLafayetteEffect(p);
                            break;
                        } else {
                            System.out.println("You can only played Bang! in response to Indians");
                            p.hand().add(playedCard);
                        }
                    }
                } catch(InputMismatchException e) {
                    System.out.println("Invalid Input");
                    reader.nextLine();
                }
            }
        }
    }
    
    private static void playGeneralStore(Player player, BrownCard card) {
        discard.add(card);
        Scanner reader = new Scanner(System.in);
        Hand hand = new Hand();
        int i = 0;
        while(++i <= players.size()) hand.add(drawCard());
        while(hand.size() > 0) {
            System.out.println(player.name() + ", choose a card to take.");
            while(true) {
                System.out.println(hand.display());
                System.out.print("Choose a card: ");
                try {
                    i = reader.nextInt();
                    if(i < 0 || i >= hand.size()) {
                        throw new InputMismatchException();
                    } else {
                        player.hand().add(hand.take(i));
                        player = nextPlayer(player);
                        break;
                    }
                } catch(InputMismatchException e) {
                    System.out.println("Invalid Inpit");
                    reader.nextLine();
                }
            }
        }
    }
    
    private static void playDuel(Player player, BrownCard card) {
        discard.add(card);
        Scanner reader = new Scanner(System.in);
        int index;
        System.out.println("Select a player to duel.");
        while(true) {
            System.out.println(displayOtherPlayers(player) + ", (" + (players.size()-1) + ") Cancel");
            System.out.print("Choose a player: ");
            try {
                index = reader.nextInt();
                if(index < 0 || index >= players.size()) {
                    throw new InputMismatchException();
                } else if(index == players.size()-1) {
                    break;
                } else {
                    respondToDuel(otherPlayers(player).get(index), player);
                    break;
                }
            } catch(InputMismatchException e) {
                System.out.println("Invalid Input");
                reader.nextLine();
            }
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Blue Card Effects">
    private static boolean resolveDynamite(Player player) {
        if(player.hasDynamite()) {
            System.out.println("You must draw a card for dynamite.");
            Card card = player.character().name() == Character.LUCKY_DUKE ? applyLuckyDukeEffect() : drawCard();
            System.out.println("You drew a " + card.toString() + ".");
            if(card.value().value() < 10 && card.suit() == Suit.SPADES) {
                player.loseLife(3);
                System.out.println("The dynamite exploded!\n");
                discard.add(player.takeCard(Blue.DYNAMITE));
                if(!player.isAlive()) {
                    removePlayer(player, null);
                    return true;
                }
                return false;
            } else {
                System.out.println("You're safe! The dynamite did not explode!\n");
                nextPlayer(player).addToPlay(player.takeCard(Blue.DYNAMITE));
                return false;
            }
        }
        return false;
    }
    
    private static boolean resolveJail(Player player) {
        if(player.inJail()) {
            System.out.println(player.name() + " must draw a card for jail.");
            Card card = player.character().name() == Character.LUCKY_DUKE ? applyLuckyDukeEffect() : drawCard();
            System.out.println(player.name() + " drew a " + card.toString() + ".");
            discard.add(player.takeCard(Blue.JAIL));
            if(card.suit() == Suit.HEARTS) {
                System.out.println(player.name() + " successfully escaped jail.\n");
            } else {
                System.out.println(player.name() + " was not able to get out of jail.\n");
                return false;
            }
        }
        return true;
    }
    
    private static boolean resolveBarrel(Player player) {
        if(player.hasBarrel()) {
            System.out.println(player.name() + " draws a card for barrel.");
            Card card = player.character().name() == Character.LUCKY_DUKE ? applyLuckyDukeEffect() : drawCard();
            System.out.println(player.name() + " drew a " + card.toString() + ".");
            if(card.suit() == Suit.HEARTS) {
                System.out.println(player.name() + " successfully used the barrel.\n");
                return true;
            }
            System.out.println(player.name() + " was not able to use the barrel.\n");
        }
        return false;
    }
    
    private static void playJail(Player player, BlueCard card) {
        Scanner reader = new Scanner(System.in);
        System.out.println(displayOtherPlayers(player) + ", (" + (players.size()-1) + ") Cancel");
        int index;
        Player target;
        while(true) {
            try {
                System.out.print("Play jail on: ");
                index = reader.nextInt();
                if(index == players.size() - 1) {
                    player.hand().add(card);
                    break;
                }
                target = otherPlayers(player).get(index);
                if(target != null) {
                    if(target.role().role() == Role.SHERIFF) {
                        System.out.println("You cannot play the jail on the Sheriff.\n");
                        continue;
                    }
                    if(target.inJail()) {
                        System.out.println(target.name() + " is already in jail.\n");
                        continue;
                    }
                    target.addToPlay(card);
                    break;
                }
            } catch(Exception e) {
                reader.nextLine();
            }
            System.out.println("Invalid Input");
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Response Effects">
    private static void respondToBang(Player player, Player shooter) {
        if(!resolveBarrel(player) || (player.character().name() == Character.JOURDONNAIS && !applyJourdonnaisEffect(player))) {
            Scanner reader = new Scanner(System.in);
            int index;
            Card card;
            System.out.println("Choose whether or not to play a card in response to Bang!");
            System.out.println(player.hand().display() + ", (" + player.hand().size() + ") End");
            while(true) {
                System.out.print("Choose a card to play: ");
                try {
                    index = reader.nextInt();
                    if(index == player.hand().size()) {
                        applyElGringoEffect(player, shooter);
                        player.loseLife();
                        System.out.println(player.name() + " decided to take the hit.");
                        if(!player.isAlive()) {
                            removePlayer(player, shooter);
                        }
                        break;
                    } else if(index >= player.hand().size()) {
                        System.out.println("Invalid Input");
                        reader.next();
                    } else {
                        card = player.hand().take(index);
                        if(card instanceof BrownCard && (((BrownCard)card).name() == Brown.MISSED) || applyCalamityJanetEffect(player, (BrownCard)card)) {
                            System.out.println(player.name() + " played a Missed!\n");
                            applySuzyLafayetteEffect(player);
                            if(!applySlabTheKillerEffect(shooter, player, card)) 
                                discard.add(card);
                            break;
                        }
                        System.out.println("You cannot play this card in response to a Bang!");
                        player.hand().add(card);
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Input");
                    reader.next();
                }
            }
        }
    }
    
    private static void respondToDuel(Player p1, Player p2) {
        Scanner reader = new Scanner(System.in);
        int index;
        Card card;
        System.out.println("Play a Bang! in response to duel?");
        while(true) {
            System.out.println(p1.hand().display() + ", (" + p1.hand().size() + ") Cancel");
            System.out.print("Choose a card: ");
            try {
                index = reader.nextInt();
                if(index < 0 || index > p1.hand().size()) {
                    throw new InputMismatchException();
                } else if(index == p1.hand().size()) {
                    System.out.println(p1.name() + " lost the duel against " + p2.name() + ".");
                    applyElGringoEffect(p1, p2);
                    p1.loseLife();
                    if(!p1.isAlive())
                        removePlayer(p1, null);
                    break;
                } else {
                    card = p1.hand().take(index);
                    if(card instanceof BrownCard && (((BrownCard)card).name() == Brown.BANG) || applyCalamityJanetEffect(p1, (BrownCard)card)) {
                        System.out.println("You fire back in your Duel against " + p2.name() + ".");
                        applySuzyLafayetteEffect(p1);
                        discard.add(card);
                        respondToDuel(p2, p1);
                        break;
                    } else {
                        System.out.println("You can only play Bang! in a Duel.");
                    }
                }
            } catch(InputMismatchException e) {
                System.out.println("Invalid Input");
                reader.nextLine();
            }
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Main Logic">
    public static void main(String[] args) {
        setup();
        Player player = getSheriff(); //set starting player to whoever is Sheriff
        int position;
        while(!isGameOver()) {
            position = players.indexOf(player);
            if(resolveDynamite(player)) { //true if player dies to dynamite
                player = position == players.size() ? players.get(0) : players.get(position);
                continue;
            }
            if(!resolveJail(player)) { //true if player fails jail escape
                player = nextPlayer(player); 
                continue;
            }
            drawPhase(player);
            if (!playPhase(player)) break; //true if game ending move is made
            discardPhase(player);
            player = nextPlayer(player);
        }
        displayWinMessage();
    }
    //</editor-fold>
}