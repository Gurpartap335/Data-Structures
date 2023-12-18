package leetcode.LinkedList;


public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Node node = removeNthFromEnd(list.head, 2);
        System.out.println(node.value);
        System.out.println(list);
    }

    // Brute force
    // indexing starts from 1
    // O(len) + O(len - n) = O(2len)  O(1)
    public static Node removeNthFromEnd(Node head, int n) {
        int len = getSize(head);
        int prevNodeIndex = len - n;

        if (prevNodeIndex == 0) {
            head = head.next;
            return head;
        }

        Node prevNode = getNode(head, prevNodeIndex);
        Node nodeToRemove = prevNode.next;
        prevNode.next = prevNode.next.next;
        nodeToRemove = null; // garbage collector will do it?
        return head;
    }

    // https://stackoverflow.com/questions/22902924/java-how-to-delete-a-node-from-linkedlist
    // prevNode.next(nodeToRemove) will be removed by garbage collector,
    // or you can manually do it.
    // https://javarevisited.blogspot.com/2011/04/garbage-collection-in-java.html
    // Java garbage collector will free the memory for any object that is not reachable anymore.

    public static int getSize(Node head) {
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        return len;
    }

    public static Node getNode(Node head, int index) {
        for (int i = 1; i < index; i++) {
            head = head.next;
        }
        return head;
    }


    // Two pointer
    // If fast moves n times first and then both slow and fast moves till
    // fast reach last element
    // slow will have n times away from last element.
    // O(len) O(1)
    public static Node removeNthFromEnd2(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }


        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head; // gc will remove unreachable node automatically
    }
}

