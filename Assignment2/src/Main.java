public class Main {
    public static void main(String[] args) {
        System.out.println("Assignment 2 – setup OK");

        // Test SeLinkedList
        SeLinkedList node1 = new SeLinkedList(1, 2, 3);
        SeLinkedList node2 = new SeLinkedList(4, 5, 6);
        node1.next = node2;

        System.out.println("Node1: " + node1);
        System.out.println("Node2: " + node1.next);
    }
}
