public class SeLinkedList {
    SeLinkedList next;  
    int a;
    int b;
    int c;

    // Constructor
    public SeLinkedList(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.next = null;
    }

    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }
}
