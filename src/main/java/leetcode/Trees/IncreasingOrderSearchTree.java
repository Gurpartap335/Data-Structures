package leetcode.Trees;

import lecture.trees.BinarySearchTree;
import lecture.trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/increasing-order-search-tree/
public class IncreasingOrderSearchTree {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertion(2);
        tree.insertion(1);
        tree.insertion(4);
        tree.insertion(3);
        tree.levelOrder();

        IncreasingOrderSearchTree tree1 = new IncreasingOrderSearchTree();
        tree.levelOrder();
    }

    // Created a new binary tree, by rearrange nodes of previous tree.
    // TC : O(n) , SC : O(1)
    // TC: O(2n) -> O(n); SC : O(n)
    public Node increasingBST(Node root) {
        Queue<Node> queue = new LinkedList<>();
        inOrderR(root, queue);

        root = queue.poll();
        Node node = root;
        while (!queue.isEmpty()) {
            node.right = queue.poll();
            node.left = null;
            node = node.right;
        }
        node.left = null;
        return root;
    }

    // TC : O(n), SC : O(h) + O(n) -> worst case O(n) skewed tree.
    public void inOrderR(Node root, Queue<Node> queue) {
        if (root == null) {
            return;
        }

        inOrderR(root.left, queue);
        queue.add(root);
        inOrderR(root.right, queue);
    }


    // Objects are passed by reference
    // Java passes reference by value

    // We did not rearrange the binary tree, but we created a new one.

    public static Node increasingBSTI(Node root) {
        Queue<Integer> queue = new LinkedList<>();
        inOrder(root, queue);

        root = new Node(queue.remove());
        Node node = root;
        while (!queue.isEmpty()) {
            node.right = new Node(queue.poll());
            node = node.right;
        }
        return root;
    }

    public static void inOrder(Node root, Queue<Integer> queue) {
        if (root == null) {
            return;
        }

        inOrder(root.left, queue);
        queue.add(root.value);
        inOrder(root.right, queue);
    }


}
