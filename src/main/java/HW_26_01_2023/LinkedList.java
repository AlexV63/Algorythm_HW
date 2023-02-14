package HW_26_01_2023;


public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void print() {
        Node currentNode = head;
        if (head != null) {
            System.out.print(head.data + " ");
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.data + " ");
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;

//             head = newNode;  //  todo для вставки сначала

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void remove(int data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null) {
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
}


