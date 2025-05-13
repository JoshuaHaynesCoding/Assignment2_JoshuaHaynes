package assignment2;

public class Warrior extends Character {
    private int strength;
    private int craft;

    public Warrior(String name) {
        super(name, 10);
        this.strength = 5;
        this.craft = 1;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getCraft() {
        return craft;
    }
}
