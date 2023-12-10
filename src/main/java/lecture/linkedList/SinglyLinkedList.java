package lecture.linkedList;

// Implemented Linked List using both Head and Tail pointer.
public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;
    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    // O(1)
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // using head pointer O(n)
    public void insertLast2(int value) {
        Node node = new Node(value, null);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;

    }

    public void insert(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = new Node(val, temp.next);
        size++;
    }

    // insert using recursion
    // void return type and make changes in ll
    // node return type that returns the list node to change the structure

    public void insertRec(int value, int index) {
        if (index > size) {
            return;
        }
        head = insertRec(value, index, head);
    }
    public Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    @Override
    public String toString() {
        Node temp = head;
        if (temp == null) {
            return "Linked List is Empty";
        }

        StringBuilder sb = new StringBuilder();
        while (temp != null) {
            sb.append(temp.value).append(" -> ");
            temp = temp.next;
        }
        sb.append("End");
        return sb.toString();
    }

    public void deleteFirst() {
        head = head.next; // just move head by once
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;
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

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // questions
    // sorted list; remove duplicate elements
    public void duplicate() {
        Node node = head;
        while (node.next != null) {
            if (node.next != null && node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }


    // https://leetcode.com/problems/remove-linked-list-elements/
    public void removeElements(SinglyLinkedList list, int val) {
        Node curr = head;
        if (head.value == val) {
            head = head.next;
            size--;
        }

        while (curr.next != null) {
            if (curr.next.value == val) {
                curr.next = curr.next.next;
                size--;
            } else {
                curr = curr.next;
            }
        }
    }


    private void reverse(Node node) {
        if (node.next == null) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null; // so last node will point to null.
    }


    public void createLoop(Node head, int k) {
        if (head == null) {
            return;
        }

        int count = 1;
        Node temp = head;
        while (count < k) {
            temp = temp.next;
            count++;
        }

        Node connectedPoint = temp;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = connectedPoint;
    }

    private class Node {
        private int value;
        private Node next; // reference variable

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.insertLast(6);
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(6);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(6);
        list1.insertLast(5);
        list1.reverse(list1.head);

    }
}
