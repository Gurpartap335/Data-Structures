package lecture.linkedList;

import java.util.Stack;

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

    public E getNodeValue(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public boolean isPalindrome(SinglyLinkedList<E> list) {
        int i = 0;
        int j = size - 1; //  size variable is not provided in leetcode problems
        while (i <= j) { // <= for odd length list.
            if (getNodeValue(i) != getNodeValue(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindromeStack(SinglyLinkedList<E> list) {
        Node fast = head;
        Node slow = head;

        Stack stack = new Stack<>();

        while(fast!=null && fast.next!=null){
            stack.push(slow.value);
            fast = fast.next.next;
            slow = slow.next;

        }

        if(fast != null)
            slow = slow.next;

        while(slow != null){
            if (stack.pop() != slow.value) return false;
            slow = slow.next;
        }
        return true;
    }



    // is linked list Palindrome using Two pointers
    public boolean isPalindrome2(SinglyLinkedList<E> list) {
        Node fast = head;
        Node slow = head, temp;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        fast = head;
        slow = prev; // first node of the reversed part
        while (slow != null) {
            if (slow.value != fast.value) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
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
    // why use dummy node find in this question.
//    public void removeElements(SinglyLinkedList<E> list, int value) {
//        if (head != null && head.value == value) {
//            head = head.next;
//        }
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
    // iterative method
    // after reversing the whole list next and curr will be pointing to null and prev
    // pointer will be at the first node of the linked list
    // You will not use extra memories unless you use new keyword.
    // All java objects live in java heap.
    // O(n) O(1)
    public void reverse(SinglyLinkedList<E> list) {
        if (list.head == null) {
            System.out.println("List is empty");
            return;
        }
        if (size < 2) {
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) { // to escape NullPointerException
                next = next.next; // cannot read field next because next is null.
            }
           }
        head = prev;
    }

    // recursion reverse linked list
    // O(n) O(n)
    // reach the end of LL and start reversing the linked list when I move out of the recursion.
    public void reverseRec(Node node) {
        int i = 1;
        Node tail = null;
        if (i == 1) {
            tail = get(size - 1);
            i++;
        }

        if (node.next == null) {
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // return list from the middle of the linked list
    // https://leetcode.com/problems/middle-of-the-linked-list/
    public E middleElement(SinglyLinkedList<E> list) {
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

    // to check what comes after null??
    public void nullNext() {
        Node temp = null;
        System.out.println(temp.next);
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        list.clear();
        list.display();
//        System.out.println(list.isPalindrome2(list));

    }
}

