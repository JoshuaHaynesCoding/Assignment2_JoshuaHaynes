package assignment2;

public abstract class Item {
    private final String name;
    private final int strength;
    private final int craft;

    public Item(String name, int strength, int craft) {
        this.name = name;
        this.strength = strength;
        this.craft = craft;
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

    @Override
    public String toString() {
        return name + " (Str: " + strength + ", Craft: " + craft + ")";
    }
}
