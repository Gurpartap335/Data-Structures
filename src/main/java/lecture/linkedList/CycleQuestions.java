package lecture.linkedList;

import org.w3c.dom.Node;

public class CycleQuestions {

    // Linked List Cycle
    // fast and slow pointer method. used for
    // 1. Cycle detection
    // 2. Finding a node in cycle etc.
    // slow pointer will move one by one and fast pointer will move 2x
    // if these pointers are meeting at some node it means cycle is present.
    // if any pointer pointing to null then cycle does not exit.
    // has cycle
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // find length of the cycle
    // Floyd's tortoise and hare algorithm.
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }

    // cycle II
    /**
     * Find length of cycle
     * Move s ahead by length of cycle times
     * move s and f one by one it will
     */

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
