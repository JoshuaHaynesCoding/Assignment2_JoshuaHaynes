public class Player {
    public static int numPlayers = 0;

    public Player() {
        numPlayers++;
    }

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println("Number of players: " + Player.numPlayers);
    }
}
