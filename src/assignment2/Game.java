package assignment2;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character player = null;

        System.out.println("Choose your class: (1) Wizard or (2) Warrior");
        String input = scanner.nextLine();

        if (input.equals("1")) {
            player = new Wizard("Player");
        } else {
            player = new Warrior("Player");
        }

        
        Item axe = new Axe();
        Item shield = new Shield();

        
        Chamber c1 = new Chamber(axe);
        Chamber c2 = new Chamber(shield);
        Chamber c3 = new Chamber();

        
        Monster goblin = new Monster("Goblin", 3, 0, 5);
        Monster imp = new Monster("Imp", 0, 3, 5);

        
        new Door(c1, c2, goblin);
        new Door(c2, c3, imp);

        
        Dungeon dungeon = new Dungeon(player, c1, c3);
        TextUI ui = new TextUI(scanner);
        ui.play(dungeon);
    }
}
