package leetcode.linkedList;

public class MiddleNode {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);

        Node middle = middleNode(node);
        System.out.println(middle.value);
        System.out.println(7/2);
    }

    // TC : O(n) SC : O(1)
    public static Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }



}
