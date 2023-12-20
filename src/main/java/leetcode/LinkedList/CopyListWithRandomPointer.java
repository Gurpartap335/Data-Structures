package leetcode.LinkedList;

import java.util.HashMap;

// https://leetcode.com/problems/copy-list-with-random-pointer/
// https://medium.com/spotthedifference/deep-copy-a-linked-list-b90d8376223f
public class CopyListWithRandomPointer {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Node node = copyRandomList(list.head);
        node.print(node);
        System.out.println(list);

        list.add(5);
        node.print(node);
        System.out.println(list);


    }

    public static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;

        while (temp != null) {
            map.put(temp, new Node(temp.value));
            temp = temp.next;
        }

        temp = head;

        while (temp != null) {
            Node newTempNode = map.get(temp);
            newTempNode.next = map.get(temp.next);
            temp = temp.next;
        }

        return map.get(head);
    }
}
