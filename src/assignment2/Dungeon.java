/**
 * ...
 * @author Josh
 */


/**
 * controls the players position and game logic
 * tracks current chamber, goal, and available action
 * 
 * @author Josh
 */


package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    private Character player;
    private Chamber current;
    private Chamber goal;

    public Dungeon(Character player, Chamber start, Chamber goal) {
        this.player = player;
        this.current = start;
        this.goal = goal;
    }
    
    /**
     * Gets the current chamber the player is in
     * @return current chamber
     */
    
   


    public Chamber getCurrentChamber() {
        return current;
    }
    
    /**
     * chec if the game is finished (player dead or reached goal)
     * @return true if finished
     */
    

    public boolean isFinished() {
        return current == goal || !player.isAlive();
    }
    
    
    /**
     * gets all available actions for the current chamber
     * includes picking up items, fighting, or moving
     * @return list of actions
     */
    


    public List<Action> getActions() {
        List<Action> actions = new ArrayList<>();
        for (Item item : current.getItems()) {
            actions.add(new Pick(player, item, current));
        }

        for (Door door : current.getDoors()) {
            if (door.isBlocked()) {
                actions.add(new Fight(player, door.getMonster()));
            } else {
                actions.add(new Move(this, door));
            }
        }

        return actions;
    }
    
    /**
     * Moves the player to the given chamber
     * @param chamber the chamber to move to
     */
    


    public void moveTo(Chamber chamber) {
        this.current = chamber;
    }
}
