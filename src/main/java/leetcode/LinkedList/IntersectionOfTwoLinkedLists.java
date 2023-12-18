package leetcode.LinkedList;

import java.util.HashSet;

public class IntersectionOfTwoLinkedLists {

    public static void main(String[] args) {

    }

    // hashing
    // O(m + n) O(m)
    public static Node getIntersectionNodes(Node headA, Node headB) {
        HashSet<Node> set = new HashSet<>();

        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    // write all optimized approaches
    // https://www.youtube.com/watch?v=0DYoPz2Tpt4&ab_channel=takeUforward
}
