package leetcode.linkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.print(node);
        node = reverseListRec(node);
        node.print(node);

        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.head = reverseListRec(list.head);
        System.out.println(list);
    }


    // You will not use extra memories unless you use new keyword.
    // all java objects live in java heap.
    // TC : O(n) SC : O(1)
    public Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {// curr and next both pointer will be null when while loop break
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    // tail recursion
    // TC : O(n), SC : O(n)
    public static Node reverseListRec(Node head) {
        return reverseListRec(head, null);
    }

    public static Node reverseListRec(Node head, Node prev) {
        if (head == null) {
            return prev; // returning prev as head?
        }
        Node next = head.next;
        head.next = prev;
        return reverseListRec(next, head);
    }

}
