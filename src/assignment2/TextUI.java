package assignment2;

import java.util.List;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;

    public TextUI(Scanner scanner) {
        this.scanner = scanner;
    }

    public void play(Dungeon dungeon) {
        while (!dungeon.isFinished()) {
            System.out.println("\n Chamber ");
            System.out.println("You are in a chamber!");
            List<Action> actions = dungeon.getActions();

            for (int i = 0; i < actions.size(); i++) {
                System.out.println((i + 1) + ". " + actions.get(i));
            }

            System.out.print("Choose action: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine()) - 1;
                Action action = actions.get(choice);
                action.execute();
            } catch (Exception e) {
                new PrintError(dungeon, e).execute();
            }
        }

        System.out.println("\n YOU LOSE");
    }
}
