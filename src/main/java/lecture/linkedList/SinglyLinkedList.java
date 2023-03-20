package lecture.linkedList;

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

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/
    public void removeDuplicate(SinglyLinkedList list) {
       Node node = head;
       while (node.next != null) {
           if (node.value == node.next.value) {
               node.next = node.next.next; // we moved node.next value not node.
               size--;
           } else {
               node = node.next;
           }
       }
    }


    // nested or inner class
    // https://www.digitalocean.com/community/tutorials/java-inner-class
    // assert keyboard
    public class Node {
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

    public Node getHead() {
        return head;
    }

    // Create and detect loop
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

    public  boolean detectLoop(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // https://leetcode.com/problems/remove-linked-list-elements/
//    public void removeElements(SinglyLinkedList<E> list, int value) {
//        Node curr = head;
//
//        while (curr.next != null) {
//            if (curr.next.value == value) {
//                curr = curr.next.next;
//            } else {
//                curr.next = curr.next.next;
//            }
//        }
//    }

    // reverse Linked list
    public void reverse(SinglyLinkedList list) {

    }

    // return list from the middle of the linked list
    // https://leetcode.com/problems/middle-of-the-linked-list/
    public E middleElement(SinglyLinkedList list) {
        Node fast = list.head;
        Node slow = list.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.value;
    }

    public SinglyLinkedList<E> middleList(SinglyLinkedList<E> list) {
        Node fast = list.head;
        Node slow = list.head;

        SinglyLinkedList<E> ans = new SinglyLinkedList<E>();

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        while (slow != null) {
            ans.insertLast(slow.value);
            slow = slow.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);
        list.display();

    }
}

