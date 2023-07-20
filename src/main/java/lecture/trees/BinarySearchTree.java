package lecture.trees;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTree {
    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

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
    public boolean searchI(int value) {
        return searchI(root, value);
    }

    // we are not updating root node here
    public boolean searchI(Node node, int value) {

        while (node != null) {
            if (node.value == value) {
                return true;
            }
            if (value < node.value) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return false;
    }


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

    public void preOrderI() {
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.print(node.value + " ");
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
    }

    public void preOrderI2() {
        Deque<Node> stack = new ArrayDeque<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            System.out.print(node.value + " ");
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
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

    public void inOrderI() {
        Stack<Node> stack = new Stack<>();
        Node cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.print(cur.value + " ");
            cur = cur.right;
        }
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

        tree1.postOrder();

    }
}

// why declare your class static?
// why declare global variables?
// search element
// debug read article
// https://www.enjoyalgorithms.com/blog/insertion-in-binary-search-tree
// debug a tree
// https://www.enjoyalgorithms.com/blog/minimum-absolute-difference-in-bst

// count nodes
// delete nodes