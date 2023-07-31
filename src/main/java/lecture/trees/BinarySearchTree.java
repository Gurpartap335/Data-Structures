package lecture.trees;


import java.util.*;

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


    // https://www.enjoyalgorithms.com/blog/searching-in-binary-search-tree
    // search key or node in tree if it exits
    // TC: O(h) h : height of the tree
    //  When BST is balanced O(log n) log n height of the BST where n is number of nodes
    // When BST is unbalanced O(n) Height of the BST
    // Space complexity is equal to the size of recursion stack which is equal to height of the binary tree.
    // SC O(h) for balanced O(log n) and unbalanced O(n)
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
    // TC same as recursion
    // SC O(1)
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

    public void postOrderI() {

    }

    public void levelOrder() {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    // return number of nodes present in trees
    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        }

        return countNodes(node.left) + countNodes(node.right) + 1;
    }

    // you can add or delete element in binary tree in O(log n)
//    public int countNodes(Node node) {
//        int leftDepth = leftDepth(root);
//        int rightDepth = rightDepth(root);
//
//        if (leftDepth == rightDepth) {
//            return (1 << leftDepth) - 1; // if it's full binary tree, then the result is 2^h - 1
//        } else {
//            return countNodes(root.left) + countNodes(root.left) + 1;
//        }
//
//    }

    // get the left-subtree's height(including root node)
    public int leftDepth(Node root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.left;
        }
        return height;
    }

    public int rightDepth(Node root) {
        int height = 0;
        while (root != null) {
            height++;
            root = root.right;
        }
        return height;
    }

    // get the height of the tree
    public int height() {
        return height(root);
    }

    // TC : O(n)
    // SC : O(h)
    public int height(Node root) {
        if (root == null || root.left == null && root.right == null) { // see if in height edges are counting or nodes
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    // height of the binary tree = no. of levels - 1
    public int heightI(Node root) {
        if (root == null) {
            return 0;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int height = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            height++;
        }
        return height - 1;
    }

    // can you get height of tree using stack




    // Diameter of Binary Tree
    // longest path between two nodes, path does not need to pass via root.
    // count number of edges between two nodes(as for leetcode)

    public int diameter() {
        return diameter(root);
    }
    public int diameter(Node root) {
        int[] diameterNode = new int[1];
        height(root, diameterNode);
        return diameterNode[0];
    }

    public int height(Node root, int[] diameterNode) {
        if (root == null) {
            return 0;
        }

        int left = height(root.left, diameterNode);
        int right = height(root.right, diameterNode);

        diameterNode[0] = Math.max(diameterNode[0], left + right);
        return 1 + Math.max(left, right);
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


//        BinarySearchTree tree1 = new BinarySearchTree();
//        tree1.insertionR(8);
//        tree1.insertionR(4);
//        tree1.insertionR(2);
//        tree1.insertionR(6);
//        tree1.insertionR(5);
//        tree1.insertionR(7);
//        tree1.insertionR(13);
//        tree1.insertionR(11);
//        tree1.insertionR(16);
//        tree1.insertionR(9);
//        tree1.insertionR(12);
//
//        tree1.postOrder();

        BinarySearchTree bt = new BinarySearchTree();
        bt.insertion(5);
        bt.insertion(3);
        bt.insertion(1);
        bt.insertion(4);
        bt.insertion(7);
        bt.insertion(6);
        bt.insertion(9);
        System.out.println(bt.countNodes(bt.root));
        System.out.println(bt.height());
        System.out.println(bt.heightI(bt.root));
        System.out.println(bt.diameter());

//        BinarySearchTree tree = new BinarySearchTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(7);
//        tree.root.left.left = new Node(2);
//        tree.root.left.right = new Node(6);
//        tree.root.left.right.left = new Node(5);
//        tree.root.left.right.right = new Node(11);
//        tree.root.right = new Node(9);
//        tree.root.right.right = new Node(9);
//        tree.root.right.right.left = new Node(5);
//
//        System.out.println(tree.diameter());

    }
}

// why declare your class static?
// why declare global variables?

// delete nodes

/**
 * Merge Two Binary tree recursive iterative dfs, bfs
 * Range Sum of BST
 * can you get height of tree using stack
 */