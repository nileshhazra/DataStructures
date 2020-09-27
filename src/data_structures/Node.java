package data_structures;

public class Node {
    private final int value;
    private Node next;
    public Node(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
    }
}
