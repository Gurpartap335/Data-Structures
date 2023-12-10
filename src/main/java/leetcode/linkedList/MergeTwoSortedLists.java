package leetcode.linkedList;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        list1.add(1);
        list1.add(5);
        list1.add(5);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        Node node = mergeTwoListsR(list1.head, list2.head);
        node.print(node);

    }

    // The list should be made by splicing together the nodes of the first two lists.
    // TC : O(n) O(1)
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node preHead = new Node();
        Node curr = preHead;

        while (list1 != null && list2 != null) {
            if (list1.value <= list2.value) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        }
        if (list2 != null) {
            curr.next = list2;
        }
        return preHead.next;
    }


    // TC : O(n + m)
    // SC : O(n + m)
    public static Node mergeTwoListsRec(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.value <= list2.value) {
            list1.next = mergeTwoListsRec(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRec(list1, list2.next);
            return list2;
        }
    }


    // tail recursion more optimized in terms of space
    // dry run
    public static Node mergeTwoListsR(Node list1, Node list2) {
        Node head = new Node();
        recursiveMerge(list1, list2, head);
        return head.next;
    }

    public static void recursiveMerge(Node list1, Node list2, Node head) {
        if (list1 == null) {
            head.next = list2;
            return;
        }
        if (list2 == null) {
            head.next = list1;
            return;
        }

        if (list1.value <= list2.value) {
            head.next = list1;
            list1 = list1.next;
        } else {
            head.next = list2;
            list2 = list2.next;
        }
        recursiveMerge(list1, list2, head.next);
    }

}
