package lecture.linkedList.practise;

// Linked list consists of nodes where each node contains a DATA FIELD and a
// reference(link or address of other node) to the next node in the list.

import lecture.linkedList.LL;

import java.util.StringJoiner;

/**
 * Basic operations
 * Display
 * Insertion
 * Deletion
 * Search
 * Size
 * IsEmpty
 * get
 */

public class SinglyLinkedList<k> {

    private int size;

    // head is reference variable of Node object. head stores the address of node
    // on heap
    private Node head;

    private Node tail;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Test if the value key is present in the list.
     * @param key the value to be searched
     * @return {@code true} if key is present in the list, otherwise
     * {@code false}
     */
    public boolean search(k key) {
        Node current = head;
        while (current.next != null) {
            if (current.value == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public void addFirst(k value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

//    @Override
//    public String toString() {
//        StringJoiner joiner = new StringJoiner("->");
//        Node cur = head;
//        while (cur != null) {
//            joiner.add(cur.value + "");
//            cur = cur.next;
//        }
//        return joiner.toString();
//    }

    public void add(k value, int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            addLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void addLast(k value) {
        Node node = new Node(value);
        if (head == null) { // head is null only one when linked list is empty
            addFirst(value);
            return;
        }
        node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        size++;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node temp = get(size - 2);
        temp.next = null;
        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }

        if (index == size - 1) {
            deleteLast();
            return;
        }
        Node prev = get(index - 1);
        prev.next = prev.next.next;
        size--;
    }

    public void clear() {
        Node cur = head;
        while (cur != null) {
            Node prev = cur;
            cur = cur.next;
            prev = null;
        }
        head = null;
        size = 0;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private class Node<k> {
        private k value;

        private Node next;

        public Node(k value) {
            this.value = value;
        }

        public Node(k value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
