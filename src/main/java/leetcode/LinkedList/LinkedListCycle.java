package leetcode.LinkedList;

import java.util.HashSet;

// https://leetcode.com/problems/linked-list-cycle/
// https://cp-algorithms.com/others/tortoise_and_hare.html
// https://medium.com/swlh/floyds-cycle-detection-algorithm-32881d8eaee1
public class LinkedListCycle {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        Node cycle = node.next;
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        node.next.next.next.next.next.next = new Node(7);
        node.next.next.next.next.next.next.next = cycle;

        System.out.println(hasCycle(node));
        System.out.println(hasCycleII(node));
        System.out.println(startingPointOfCycle(node));
        System.out.println(lengthOfTheCycle(node));

    }

    // using Hashing
    // TC : O(n) SC : O(n) extra space to store n elements.
    public static boolean hasCycleII(Node head) {
        HashSet<Node> set = new HashSet<>();

        Node temp = head;
        while (temp != null) {
            if (!set.add(temp)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }


    // if cycle exists in linked list
    public static boolean hasCycle(Node head) {
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

    // starting point of the cycle
    public static Node startingPointOfCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    // length of the cycle
    public static int lengthOfTheCycle(Node head) {
        Node slow = startingPointOfCycle(head);
        Node fast = slow.next;
        int length = 1;

        while (fast != slow) {
            fast = fast.next;
            length++;
        }
        return length;
    }

}

/*
Floyd's Cycle Algorithm

If at any point slow and fast meet each other means there is cycle in linked list.
If fast points to null that means cycle does not exit in LL.
 */
