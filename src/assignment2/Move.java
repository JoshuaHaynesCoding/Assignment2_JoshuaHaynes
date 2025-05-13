package assignment2;

public class Move extends Action {
    private Dungeon dungeon;
    private Door door;

    public Move(Dungeon dungeon, Door door) {
        this.dungeon = dungeon;
        this.door = door;
    }

    @Override
    public void execute() {
        Chamber next = door.getOtherChamber(dungeon.getCurrentChamber());
        dungeon.moveTo(next);
        System.out.println("You moved to another chamber.");
    }

    @Override
    public String toString() {
        return "Move to next chamber";
    }
}
