package lecture.trees;


import java.util.Scanner;


public class CustomBinaryTree {

    Node root;

    Scanner s = new Scanner(System.in);
    public void preOrder() {
        preOrder(root);
    }
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // insertion for binary tree where you can insert elements in any order

    // Node in Binary Tree
    static class Node {
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
        CustomBinaryTree tree = new CustomBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.preOrder();
        System.out.println();

//        Node node = new Node(34);
//        node.left = new Node(12);
//        node.right = new Node(50);
//        CustomBinaryTree tree1 = new CustomBinaryTree();
//        tree1.root = node;
//        tree1.preOrder();
//
//        System.out.println();
//
//        node.left.left = new Node(10);
//        tree1.root.left.right = new Node(40);
//        node.right.right = new Node(222);
//        tree1.preOrder();


        // using insert method
//        CustomBinaryTree tree2 = new CustomBinaryTree();
//        tree2.root = new Node(0);

//        CustomBinaryTree bt = new CustomBinaryTree();
//        bt.insert(1);
//        bt.insert(2);
//        bt.insert(3);
//        bt.insert(4);
//        bt.insert(5);
//
//        bt.preOrder();

    }
}
