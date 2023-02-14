package HW_26_01_2023;


public class LinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public LinkedList() {
        first.next = last;
        last.prev = first;
    }

    Node head;

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void add(String data) {
        Node node = new Node();
        node.data = data;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
   }

}
