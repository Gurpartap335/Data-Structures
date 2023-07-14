package neetcode.linkedList;

public class LinkedList {

    private Node head;

    private int size = 0;
    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addAtIndex(int index, int value) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        temp.next= node;
        size++;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value, null);
        if (head == null) {
            addFirst(value);
            return;
        }

        Node temp = lastNode();
        temp.next = node;
        node.next = null;
        size++;
    }

    public Node lastNode() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public void clear() {
        Node current = head;
        while (current.next != null) {
            Node prev = current;
            prev = null;
            current = current.next;
        }
        head = null;
        size = 0;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    // Two pointers
    // T O(n)  M O(1)
    public void reverseList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (size < 2) {
            return;
        }

        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) { // curr and next both pointer will be null when while loop break.
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // recursion
    // T : O(n) M : O(n)
    public void reverseListRec() {
        head = reverseListRec(head);
    }
    public Node reverseListRec(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node newHead = reverseListRec(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }


    // merge two lists
    public static LinkedList mergeTwoSortedLists(LinkedList list1, LinkedList list2) {
        Node h1 = list1.head;
        Node h2 = list2.head;

        LinkedList list = new LinkedList();

        while (h1 != null && h2 != null) {
            if (h1.value < h2.value) {
                list.addLast(h1.value);
                h1 = h1.next;
            } else {
                list.addLast(h2.value);
                h2 = h2.next;
            }
        }
        while (h1 != null) {
            list.addLast(h1.value);
            h1 = h1.next;
        }
        while (h2 != null) {
            list.addLast(h2.value);
            h2 = h2.next;
        }
        return list;
    }


    // A node only knows about what data it contains, and who its neighbor is.
    private class Node {
        int value;
        Node next;

        public Node(int data) {
            this.value = data;
        }

        public Node(Node next) {
            this.next = next;
        }

        public Node(int data, Node next) {
            this.value = data;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);
        LinkedList list2 = new LinkedList();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);

        LinkedList list = LinkedList.mergeTwoSortedLists(list2, list2);
        list.display();

    }
}
// https://javarevisited.blogspot.com/2017/03/how-to-reverse-linked-list-in-java-using-iteration-and-recursion.html