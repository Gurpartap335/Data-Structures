package leetcode.LinkedList;

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(3);
        System.out.println(list);
        list.head = deleteDuplicates(list.head);
        System.out.println(list);
    }

    // TC : O(n) SC : O(1)
    public static Node deleteDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;

        // break the loop is temp reaches last node.
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    // recursive
    // O(n) , O(n)
    public static Node deleteDuplicates2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates2(head.next);
        if (head.value == head.next.value) {
            return head.next;
        } else {
            return head;
        }
    }
}
