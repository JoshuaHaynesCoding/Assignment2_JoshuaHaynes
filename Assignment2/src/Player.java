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
    public SeLinkedList findMaxWeight() {
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
        return maxNode;
    }

    // findMinWeight
    public SeLinkedList findMinWeight() {
        SeLinkedList current = head;
        SeLinkedList minNode = null;
        int minWeight = Integer.MAX_VALUE;

        while (current != null) {
            int weight = current.a + current.b + current.c;
            if (weight < minWeight) {
                minWeight = weight;
                minNode = current;
            }
            current = current.next;
        }

        if (minNode != null) {
            System.out.println("Min weight player >> " + minNode + " and its weight=" + minWeight);
        } else {
            System.out.println("List is empty.");
        }
        return minNode;
    }

    // removeNode
    public void removeNode(SeLinkedList node) {
        if (node == null) return;

        if (node == head) {
            head = node.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
    }

    // findMinMaxWeight (single traversal)
    public void findMinMaxWeight() {
        SeLinkedList current = head;
        SeLinkedList minNode = null;
        SeLinkedList maxNode = null;

        int minWeight = Integer.MAX_VALUE;
        int maxWeight = Integer.MIN_VALUE;

        while (current != null) {
            int weight = current.a + current.b + current.c;

            if (weight < minWeight) {
                minWeight = weight;
                minNode = current;
            }
            if (weight > maxWeight) {
                maxWeight = weight;
                maxNode = current;
            }

            current = current.next;
        }

        if (minNode != null && maxNode != null) {
            System.out.println("Min weight player >> " + minNode + " and its weight=" + minWeight);
            System.out.println("Max weight player >> " + maxNode + " and its weight=" + maxWeight);
        } else {
            System.out.println("List is empty.");
        }
    }

    // main demo
    public static void main(String[] args) {
        System.out.println("[Joshua Haynes - Git Assignment]");

        PlayerData pd = new PlayerData();
        PlayerData[] dataArray = pd.getMyData();

        Player p = new Player();
        p.initializeList(dataArray);

        for (int i = 0; i < 3; i++) {
            System.out.println(">>> round " + (i + 1) + " <<<");

            SeLinkedList minNode = p.findMinWeight();
            SeLinkedList maxNode = p.findMaxWeight();

            p.removeNode(minNode);
            p.removeNode(maxNode);
        }

        System.out.println("[Done!]");
    }
}
