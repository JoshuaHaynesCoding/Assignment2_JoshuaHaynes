package assignment2;

public class Wizard extends Character {
    private int craft;
    private int strength;

    public Wizard(String name) {
        super(name, 10);
        this.craft = 5;
        this.strength = 1;
    }

    @Override
    public int getCraft() {
        return craft;
    }

    @Override
    public int getStrength() {
        return strength;
    }
}
