/**
 * ...
 * @author Josh
 */


package assignment2;

public abstract class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void loseHealth(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public abstract int getStrength();

    public abstract int getCraft();

    @Override
    public String toString() {
        return name + " (HP: " + health + ")";
    }
    
    public void applyItem(Item item) {
        System.out.println(name + " used " + item.getName());
    }

}
