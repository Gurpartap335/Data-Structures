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
    // what if the value is the same as root node?
    public Node insertionR(Node node, int value) {
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
    // When BST is balanced O(log n) log n height of the BST where n is number of nodes
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
        System.out.println();
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
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
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
        System.out.println();
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
        System.out.println();
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

    // T : O(n) ans Space : O(n)
    public void postOrder1() {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        Node node = root;
        stack1.push(node);
        while (!stack1.isEmpty()) {
            node = stack1.pop();
            stack2.add(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().value + " ");
        }
        System.out.println();
    }

    public List<Integer> postOrder2() {
        Stack<Node> stack = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null) {
            return list;
        }

        stack.push(root);
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            list.addFirst(node.value);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return list;
    }

    // printing list, using one stack
    public void postOrder3() {
        Stack<Node> stack = new Stack<>();
        LinkedList<Integer> list = new LinkedList<>();
        if (root == null) {
            return;
        }

        stack.push(root);
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            list.addFirst(node.value);
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        System.out.println(list);
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }
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
        System.out.println();
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

    // return number of nodes present in trees
    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        }

        return countNodes(node.left) + countNodes(node.right) + 1;
    }

    // you can add or delete element in binary tree in O(log n)
    public int countNodesI(Node node) {
        int leftDepth = leftDepth(root);
        int rightDepth = rightDepth(root);

        if (leftDepth == rightDepth) {
            return (1 << leftDepth) - 1; // if it's full binary tree, then the result is 2^h - 1
        } else {
            return countNodes(root.left) + countNodes(root.left) + 1;
        }

    }

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


     private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }


    public static void main(String[] args) {

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



/**
 Trees are like linked lists -- are made up of nodes and links.

 Terms:
 Root: the topmost node of the tree, which never has any links or edges connecting it.
 Link: the reference that a parent node contains that tells it what its child node is
 Child: any node that has a parent node that links to it
 Sibling: any group of nodes that are the children of the same node.
 Internal: any node that has a child node(basically all parent nodes)
 Leaf: any node that does not have a child node in the tree

 A tree can only ever have 1 root node, and the root node cannot have any parents,
 which means nothing can link to it.


 n nodes -> (n - 1) links
 Trees are recursive data structures because a tree is usually composed of smaller
 trees -5often referred to as subtrees -inside of it.

 For the most part, the two properties that we will be the most concerned with
 are either the depth of a node or the height of a node.

 The depth of a node is the number of links it takes to reach that node to
 the root of the tree.

 The height of a node is the maximum number of links(or the longest path)
 from that node to its furthest leaf.
 The height of a tree would be the height of its root node or
 the depth of its deepest node.

 height: leaf to root
 depth: node to root

 The diameter or width of a tree is the number of nodes on the longest path between
 any two lead nodes.

 Properties
 * size = total number of nodes

 * There can be a maximum of (2^h - 1) nodes in a binary tree with height h.
 * Additionally, the height of the root is 1.
 * Perfect BT, total nodes = 2^(h + 1) - 1.
 *
 * The minimum height or level of the binary tree would be log2(n + 1)
 *
 * We can have a maximum of 2^L nodes at the L level of a binary tree.
 * The level of the root node of binary tree is always 0.
 * 2^0 = 1 so only one node.
 * root can have max to 2 nodes 2^1 = 2. 2^2 = 4.
 *
 * The level of a node is the number of edges along the unique path between it and
 * root node. Root node has a level of 0.

 Example: File structure or file system are really just trees.
 Data Structures, Algorithms/networking, Compression of files


 Balanced tree vs Unbalanced tree
 A tree is considered to be balanced if any two sibling subtrees do not differ
 in height by more than one level.
 However, if two sibling subtrees differ significantly in height(and have more than
 one level of depth difference), the tree is unbalanced.

 * Trees,
 * Binary Trees,
 * Binary Search trees BST
 * > To the left, to the left, all the small numbers in the tree to the left.
 *
 * Any tree can be binary tree if each node has only two child nodes. It's the
 * ordering of nodes that makes a binary tree searchable and by extension, what makes
 * it so powerful.
 *
 *
 * Types of Binary trees
 *  Full Binary Tree : either has 0 or 2 children
 *
 * Complete Binary Tree
 * -- all levels are completely filled except the last level.
 * -- the last level has all nodes in left as possible.
 *
 * Perfect Binary tree : all leaf nodes are at same level.
 *
 * Balanced tree :: height of tree at max log(n) n : number of nodes.
 *
 * Degenerate tree : every node has single children(singly linked list)
 *
 * Ordered BT or sorted Binary tree (Binary search tree).
 * BST height???
 *
 * You can add or delete elements in O(log n) time
 * limitation unbalanced binary tree insertion and deletion take more time.
 * how to solve this problem?
 * self balance Binary tree
 *
 * inefficient for sorted data
 *
 *
 * Traversal Techniques
 * BFS and DFS
 *
 * DFS : goes depth wise
 * Inorder Traversal (left root right).
 * Preorder Traversal (root left right)
 * Post Order Traversal (left right root)
 *
 * BFS : goes level wise
 */

