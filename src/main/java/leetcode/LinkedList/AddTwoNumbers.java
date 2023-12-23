package leetcode.LinkedList;

// https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(2);
        list.add(4);
        list.add(3);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(9);

        Node node = addTwoNumbers(list.head, list2.head);
        node.print(node);


    }

    /*
    The digits are stored in reverse order.
    Add the two number and return the sum as a Linked List.
    (remember digits are stored in reverse)
    sum linked list will start from the last digit of sum.
     */
    // TC : O(max(n,m) and O(sum(n + m)
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node preHead = new Node();
        Node curr = preHead;
        int carry = 0, sum;

        while (l1 != null || l2 != null || carry == 1) {//carry will be 0 or 1.
            sum = 0;
            if (l1 != null) {
                sum += l1.value;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.value;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }
        return preHead.next;
    }
}
