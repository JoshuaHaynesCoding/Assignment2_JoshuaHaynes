package assignment2;

public class PrintError extends Action {
    private Dungeon dungeon;
    private Exception e;

    public PrintError(Dungeon dungeon, Exception e) {
        this.dungeon = dungeon;
        this.e = e;
    }

    @Override
    public void execute() {
        System.out.println("Invalid input. Try again.");
    }

    @Override
    public String toString() {
        return "Error: " + e.getMessage();
    }
}
