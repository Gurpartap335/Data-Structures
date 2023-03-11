package lecture.linkedList;

import java.util.LinkedList;

// without tail pointer
class SinglyLinkedList<E> {
    private Node head;

    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void insertFirst(E value) {
        Node node = new Node(value);
        // System.out.println("Node next value: " + node.next);
        if (head == null) {
            head = node;
            size++;
            return;
        }

        node.next = head;
        head = node;
        size++;
    }

    public void insertLast(E value) {
        Node node = new Node(value, null);
        if (head == null) {
            insertFirst(value);
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        size++;
    }

    public E getFirst() {
        return head.value;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.value;
    }

    public E removeFirst() {
        Node temp = head;
        head = head.next;
        size--;
        return temp.value;
    }

    public E removeLast() {
        if (size == 1) {
            return removeFirst();
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node LastNode = temp.next;
        temp.next = null;
        size--;
        return LastNode.value;
    }

    public void add(E value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size - 1) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) { // insert at index not after index
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void remove(int index) {
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        Node prev = get(index - 1);
        prev.next = prev.next.next;
        size--;
    }

    /**
     * Test if the value key is present in the list.
     * @param key the value to be searched
     * @return {@code true} if key is present in the list, otherwise
     * {@code false}
     */
    public boolean search(E value) {
        Node temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public void clear() {
        Node current = head;
        while (current != null) {
            Node prev = current;
            current = current.next;
            prev = null;
        }
        head = null;
        size = 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node temp  = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    // nested or inner class
    // https://www.digitalocean.com/community/tutorials/java-inner-class
    // assert keyboard
    private class Node {
        private Node next;
        private E value;

        public Node(Node next) {
            this.next = next;
        }

        public Node(E value) {
            this.value = value;
        }

        public Node(Node next, E value) {
            this.next = next;
            this.value = value;
        }

        public Node(E value, Node next) {
            this.next = next;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertFirst(5);
        list.display();
        list.add(4, 3);
        list.display();
        System.out.println(list.head);
        System.out.println(list.search(3));
        list.clear();
        list.display();
    }
}

