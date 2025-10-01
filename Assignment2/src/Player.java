public class Player {
    public static int numPlayers = 0;
    SeLinkedList head;

    public Player() {
        numPlayers++;
        head = null;
    }

    // addPlayer
    public void addPlayer(int a, int b, int c) {
    int newIndex = (head == null) ? 0 : head.index + 1;
    SeLinkedList newNode = new SeLinkedList(a, b, c, newIndex);

    
    newNode.next = head;   
    if (head != null) {
        head.prev = newNode;  
    }

    head = newNode; 
}

    // initializeList
    public void initializeList(PlayerData[] dataArray) {
        for (int i = 0; i < dataArray.length; i++) {
            addPlayer(dataArray[i].a, dataArray[i].b, dataArray[i].c);
        }
    }

    // findMaxWeight
    public void findMaxWeight() {
        SeLinkedList current = head;
        SeLinkedList maxNode = null;
        int maxWeight = Integer.MIN_VALUE;

        while (current != null) {
            int weight = current.a + current.b + current.c;
            if (weight > maxWeight) {
                maxWeight = weight;
                maxNode = current;
            }
            current = current.next;
        }

        if (maxNode != null) {
            System.out.println("Max weight player >> " + maxNode + " and its weight=" + maxWeight);
        } else {
            System.out.println("List is empty.");
        }
    }

    public static void main(String[] args) {
        System.out.println(">>> Running Task 8 + 9 test <<<");

        PlayerData pd = new PlayerData();
        PlayerData[] dataArray = pd.getMyData();

        Player p = new Player();
        p.initializeList(dataArray);

        p.findMaxWeight(); 
    }
}
