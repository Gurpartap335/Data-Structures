package leetcode.linkedList;


public class DeleteTheMiddleNodeOfLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        deleteMiddleNode(list.head);
        System.out.println(list);

    }


    // Tortoise and Hare/rabbit Algorithm
    // Two pointer
    // TC : O(n) SC : O(1)
    public static void deleteMiddleNode(Node head) {
        Node fast = head.next.next; //we want slow to run one step behind so that slow point one step behind middle element
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node middleNode = slow.next;
        slow.next = middleNode.next;
        middleNode.next = null;
    }


    // Three pointer
    public static void deleteMiddleNode2(Node head) {
        if (head.next == null) {
            head = null;
            return;
        }
        Node prev = null;
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;

        }
        prev.next = slow.next;
        slow = null;
    }




    // TC: O(n) + (n/2) -> O(n)
    // SC : O(1)
    public Node deleteMiddle(Node head) {
        if (head.next == null) {
            head = null; // we have to delete the element from the list.
            return head;
        }

        Node temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int index = size / 2;
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        Node removeNode = curr.next;
        curr.next = removeNode.next;
        removeNode.next = null;
        return head;
    }


}
