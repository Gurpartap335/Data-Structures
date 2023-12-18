package leetcode.LinkedList;

// https://leetcode.com/problems/reorder-list/
// You may not modify the values in the list's nodes.
// Only nodes themselves may be changed.
public class ReorderList {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list);
        reorderList2(list.head);
        System.out.println(list);
    }


    // O(n^2) O(1)
    public static void reorderList(Node head) {
        Node pointer = head;
        Node secondLast, last, pointerNext;

        while (pointer != null && pointer.next != null && pointer.next.next != null) {
            secondLast = getSecondLastNode(pointer);
            last = secondLast.next;
            secondLast.next = null;
            pointerNext = pointer.next;
            pointer.next = last;
            last.next = pointerNext;
            pointer = pointer.next.next;
        }
    }


    public static Node getSecondLastNode(Node second) {
        while (second.next.next != null) {
            second = second.next;
        }
        return second;
    }


    // O(3n) = O(n), O(1)
    public static void reorderList2(Node head) {
        Node second = divideList(head);
        second = reverseList(second);
        mergeList(head, second);

    }

    /**
     * set middle of the linked list to null
     * and return middle following node as head of the second list
     * @param head of the linked list
     * @return middle next node as head of the second list
     */
    public static Node divideList(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node slowNext = slow.next;
        slow.next = null;
        return slowNext;
    }

    public static Node reverseList(Node head) {
        Node prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void mergeList(Node head1, Node head2) {

        while (head2 != null) {
            Node list1 = head1.next;
            Node list2 = head2.next;
            head1.next = head2;
            head2.next = list1;
            head1 = list1;
            head2 = list2;
        }
    }

    // using deque

    // two pointer
    // post recursion


}
