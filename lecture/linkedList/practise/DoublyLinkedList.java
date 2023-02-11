package lecture.linkedList.practise;

public class DoublyLinkedList<k> {

    private int size;

    private Node head;

    private Node tail;


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // addFirst
    public void addFirst(k value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    // addLast

    // add

    // deleteFirst

    // deleteLast

    // delete

    // print
    public void printList() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
    }

    // search

    private class Node<k> {
        private k value;

        private Node next;

        private Node prev;

        public Node(k value) {
            this.value = value;
        }

        public Node(k value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

