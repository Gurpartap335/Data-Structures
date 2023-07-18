package lecture.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    private Node root;

    // insertion
    // to the left, to the left, all the small numbers in the tree to the left.

    // TC:   SC:
    // root node always returned not other nodes
    public void insertionR(int value) {
        root = insertionR(root, value);
    }

    // as an output we need to return the root of the modified BST.
    public Node insertionR(Node node,int value) {
        if (node == null) { // new node created only when we reach null
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insertionR(node.left, value);
        }
        if (value > node.value) {
            node.right = insertionR(node.right, value);
        }

        return node;
    }
//     new node or key insertion always happens at one of the null links at the bottom of the tree.


    public void insertion(int value) {
        root = insertion(root, value);
    }
    public Node insertion(Node root, int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return root;
        }

        Node curr = root;
        Node parent = null;
        while (curr != null) {
            parent = curr;
            if (value < curr.value) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (value < parent.value) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        return root;
    }

    // search key or node in tree if it exits
    public Boolean search(int value) {
        return search(root, value);
    }

    public Boolean search(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (node.value == value) {
            return true;
        }

        if (value < node.value) {
            return search(node.left, value);
        }
        else {
            return search(node.right, value);
        }

    }

    // search iterative


    // preorder traversal
    public void preorder() {
        preorder(root);
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }
    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // if there is no element in the root []
        if (root == null) {
            return list;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                level.add(node.value);


                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(level);
        }
        return list;
    }

    // Node class
     private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }


    public static void main(String[] args) {
//        BinarySearchTree bt = new BinarySearchTree();
//        bt.root = new Node(3);
//        bt.root.left = new Node(2);
//        bt.root.right = new Node(5);
//        bt.root.left.left = new Node(1);
//        bt.root.left.right = new Node(4);
//        bt.root.right.right = new Node(10);
//
//        bt.preorder();

//        System.out.println();
//
//        BinarySearchTree tree = new BinarySearchTree();
//        tree.insertion(8);
//        tree.insertion(4);
//        tree.insertion(3);
//        tree.insertion(6);
//        tree.insertion(5);
//        tree.insertion(7);
//
//        tree.preorder();
//        System.out.println();
//        System.out.println(tree.levelOrder(tree.root));
//        System.out.println();
//        System.out.println(tree.levelOrder(tree.root));

        BinarySearchTree tree1 = new BinarySearchTree();
        tree1.insertionR(8);
        tree1.insertionR(4);
        tree1.insertionR(2);
        tree1.insertionR(6);
        tree1.insertionR(5);
        tree1.insertionR(7);
        tree1.insertionR(13);
        tree1.insertionR(11);
        tree1.insertionR(16);
        tree1.insertionR(9);
        tree1.insertionR(12);

        tree1.preorder();
        System.out.println();
        tree1.inOrder();
        System.out.println();
        tree1.postOrder();
        System.out.println();
        System.out.println(tree1.levelOrder(tree1.root));

        System.out.println(tree1.search(12));



    }
}

// why declare your class static?
// why declare global variables?
// search element
// debug read article
// https://www.enjoyalgorithms.com/blog/insertion-in-binary-search-tree
// debug a tree