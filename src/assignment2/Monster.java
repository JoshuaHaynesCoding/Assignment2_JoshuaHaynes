package assignment2;

public class Monster {
    private String name;
    private int strength;
    private int craft;
    private int health;

    public Monster(String name, int strength, int craft, int health) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getCraft() {
        return craft;
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

    @Override
    public String toString() {
        return name + " (HP: " + health + ", Str: " + strength + ", Craft: " + craft + ")";
    }
}
