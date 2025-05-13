package assignment2;

public class Pick extends Action {
    private Character player;
    private Item item;
    private Chamber chamber;

    public Pick(Character player, Item item, Chamber chamber) {
        this.player = player;
        this.item = item;
        this.chamber = chamber;
    }

    @Override
    public void execute() {
        player.applyItem(item);
        chamber.getItems().remove(item);
        System.out.println(player.getName() + " picked up " + item.getName());
    }

    @Override
    public String toString() {
        return "Pick up " + item.getName();
    }
}
