public class SeLinkedList {
    SeLinkedList next;
    int a;
    int b;
    int c;
    int index;  

    
    public SeLinkedList(int a, int b, int c, int index) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.index = index;
        this.next = null;
        this.prev = null;
    }

    

public SeLinkedList(int a, int b, int c) {
    this(a, b, c, 0);
}

    @Override
    public String toString() {
        return "Node(index=" + index + ", " + a + "," + b + "," + c + ")";
    }
}
