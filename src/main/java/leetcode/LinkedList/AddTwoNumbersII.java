package leetcode.LinkedList;

import java.util.Stack;

public class AddTwoNumbersII {

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(6);
        list1.add(9);
        list1.add(5);
        list1.add(9);
        list1.add(7);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(5);
        list2.add(6);
        list2.add(9);

        Node node = addTwoNumbers(list1.head, list2.head);
        node.print(node);
    }

    // if reversing is allowed then AddTwoNumbers same method will work


    // Deque interface should be used in preference to legacy stack class.
    // O(n + m + max(n, m)) O(n + m)
    // n : length of first linked list, m : length of second linked list.
    // n : size of the bigger linked list.
    public static Node addTwoNumbers(Node h1, Node h2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (h1 != null) {
            stack1.push(h1.value);
            h1 = h1.next;
        }

        while (h2 != null) {
            stack2.push(h2.value);
            h2 = h2.next;
        }

        int carry = 0;
        Node prev = null;
        // Loop will end only when both stacks are empty and carry is not 0.
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry == 1) {
            int sum = 0;
            if (!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }
            sum += carry;
            Node curr = new Node(sum % 10);
            curr.next = prev;
            prev = curr;
            carry = sum / 10;
        }
        return prev;
    }


}
