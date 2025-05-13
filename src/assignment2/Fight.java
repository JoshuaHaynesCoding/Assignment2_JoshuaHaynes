package assignment2;

import java.util.Random;

public class Fight extends Action {
    private Character player;
    private Monster monster;
    private Random rand = new Random();

    public Fight(Character player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    @Override
    public void execute() {
        if (!monster.isAlive()) {
            System.out.println("Monster already defeated.");
            return;
        }

        int rollPlayer = rand.nextInt(6) + 1;
        int rollMonster = rand.nextInt(6) + 1;

        int playerStat = monster.getCraft() > 0 ? player.getCraft() : player.getStrength();
        int monsterStat = monster.getCraft() > 0 ? monster.getCraft() : monster.getStrength();

        int playerTotal = rollPlayer + playerStat;
        int monsterTotal = rollMonster + monsterStat;

        System.out.println(player.getName() + " rolls " + rollPlayer + " + " + playerStat + " = " + playerTotal);
        System.out.println(monster.getName() + " rolls " + rollMonster + " + " + monsterStat + " = " + monsterTotal);

        int damage = Math.abs(playerTotal - monsterTotal);
        if (playerTotal >= monsterTotal) {
            monster.loseHealth(damage);
            System.out.println("You hit the " + monster.getName() + " for " + damage + " damage!");
        } else {
            player.loseHealth(damage);
            System.out.println("You got hit for " + damage + " damage!");
        }
    }

    @Override
    public String toString() {
        return "Fight " + monster.getName();
    }
}
