package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Chamber {
    private List<Item> items = new ArrayList<>();
    private List<Door> doors = new ArrayList<>();

    public Chamber() {
    }

    public Chamber(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void addItem(Item item) {
        items.add(item);
    }
   
    public void addDoor(Door door) {
        doors.add(door);
    }
}
