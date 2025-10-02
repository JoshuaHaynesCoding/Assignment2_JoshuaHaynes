public class PlayerData {
    public int a;
    public int b;
    public int c;

    
    public PlayerData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    public PlayerData() {}

    
    public PlayerData[] getMyData() {
        return new PlayerData[] {
            new PlayerData(4, 5, 6),
            new PlayerData(1, 2, 3),
            new PlayerData(24, 15, 26),
            new PlayerData(23, 15, 10),
            new PlayerData(19, 28, 28)
        };
    }

    @Override
    public String toString() {
        return "Node(" + "a=" + a + ", b=" + b + ", c=" + c + ")";
    }
}
