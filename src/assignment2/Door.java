package assignment2;

public class Door {
    private Chamber chamberA;
    private Chamber chamberB;
    private Monster monster;

    public Door(Chamber a, Chamber b) {
        this.chamberA = a;
        this.chamberB = b;
        this.monster = null;
        a.addDoor(this);
        b.addDoor(this);
    }

    public Door(Chamber a, Chamber b, Monster m) {
        this(a, b);
        this.monster = m;
    }

    public Chamber getOtherChamber(Chamber current) {
        return current == chamberA ? chamberB : chamberA;
    }

    public Monster getMonster() {
        return monster;
    }

    public void defeatMonster() {
        this.monster = null;
    }

    public boolean isBlocked() {
        return monster != null && monster.isAlive();
    }
}
