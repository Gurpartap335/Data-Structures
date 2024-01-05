package leetcode.LinkedList;

public class RotateList {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Node ans = rotateRight2(list.head, 4);
        ans.print(ans);
    }

    // TC : O(k ^ n) n : number of nodes in linked list
    // k : number of time we have to rotate list to the right
    // we can decrease the value of k if k is greater than size of LL
    // we don't have to rotate the LL k times only k = k % size;
    public static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        k %= size;
        while (k > 0) {
            Node last = lastNode(head);
            last.next = head;
            head = last;
            k--;
        }
        return head;
    }

    public static Node lastNode(Node head) {
        while (head.next.next != null) {
            head = head.next;
        }
        Node last = head.next;
        head.next = null;
        return last;
    }

    // TC : O(n + k) -> O(n) O(1)
    public static Node rotateRight2(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int size = 1;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        temp.next = head;

        k %= size;
        k = size - k;
        while (k > 0) {
            temp = temp.next;
            k--;
        }

        head = temp.next;
        temp.next = null;
        return head;

    }

}
