package leetcode.LinkedList;


public class SinglyLinkedList {

    public Node head; // pointer

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


    public void addFirst(int value) {
        head = new Node(value, head);
        size++;
    }

    public void addLast(int value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
            size++;
            return;
        }

        Node temp = lastNode();
        temp.next = node;
        size++;
    }


    public void addAtIndex(int index, int value) {
        if (0 > index || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next= node;
        size++;
    }

    public void add(int value) {
        addLast(value);
    }

    public int getFirst() {
        return head.value;
    }

    public int getLast() {
        Node last = lastNode();
        return last.value;
    }

    public int getAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return -1;
        }
        if (index == 0) {
            return getFirst();
        }

        if (index == size - 1) {
            return getLast();
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public int removeFirst() {
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        return temp.value;
    }

    public int removeLast() {
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        Node last = secondLast.next;
        secondLast.next = null;
        size--;
        return last.value;
    }

    public int remove(int index) {
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }

        Node prev = getNode(index - 1);
        Node removeNode = getNode(index);
        prev.next = prev.next.next;
        removeNode.next = null;
        size--;
        return removeNode.value;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
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
        while (current != null) {
            Node prev = current;
            current = current.next;
            prev.next = null;
        }
        head = null;
        size = 0;
    }

    public boolean search(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }


    @Override
    public String toString() {
        Node temp = head;
        if (temp == null) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.value).append(" -> ");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        System.out.println(list);

    }



}


// A node only knows about what data it contains, and who its neighbor is
class Node {
    int value;
    Node next;

    public Node() {

    }
    public Node(int data) {
        this.value = data;
    }

    public Node(int data, Node next) {
        this.value = data;
        this.next = next;
    }

    public void print(Node node) {
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

}