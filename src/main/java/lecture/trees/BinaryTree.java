package lecture.trees;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class BinaryTree {
    private List<Integer> list = new ArrayList<>();
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

    private Node root;

    // insert a node into the proper position based on its value.
    public void insert(int value) {
        root = addRecursive(root, value);
    }

    public Node addRecursive(Node node, int value) {

        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
              node.left = addRecursive(node.left, value);
        } else {
            node.right = addRecursive(node.right, value);
        }

        return node;
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    public boolean containsNodeRecursive(Node node, int value) {
        if (node == null) {
            return false;
        }

        if (node.value == value) {
            return true;
        }

        if (value < node.value) {
            return containsNodeRecursive(node.left, value);
        } else {
            return containsNodeRecursive(node.right, value);
        }
    }

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

    // Iterative method
    // we will print it directly, or we can list to return
    public void preOrder() {
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

    public void inOrder() {
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


    public void inOrder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.value);
        inOrder(root.right, list);
    }

    // T : O(n) ans Space : O(n)
    public void postOrder() {
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


    public void inorder() {
        inorder(root);
    }

    public void inorder(Node node) {
        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }

    public void postorder() {
        postorder(root);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value + " ");
    }

    //level order traversal
    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            Node node = nodes.remove();

            System.out.print(node.value + " ");

            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
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

    // TC : O(number of nodes)
    // SC : O(height of the tree)
    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }
        int left = maxDepth(node.left);
        int right = maxDepth(node.right);
        return 1 + Math.max(left, right);
    }

    // https://leetcode.com/problems/invert-binary-tree/
    public Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        Node temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }

    // You can find the problem size that will overflow the stack and crash
    // your application, so more robust solution be to use stack data structure.
    public Node invertTree2(Node root) {
        if (root == null) {
            return null;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.left == null && node.right == null) {
                continue;
            }
            Node left = node.left;
            node.left = node.right;
            node.right = left;

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return root;
    }

    // Diameter of Binary Tree
    // longest path between two nodes, path does not need to pass via root.

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(4);
        bt.insert(2);
        bt.insert(7);
        bt.insert(1);
        bt.insert(3);
        bt.insert(6);
        bt.insert(9);
        bt.postOrder();
        System.out.println();
        bt.invertTree(bt.root);
        bt.postorder();

    }
}



/**
 * Trees are like linked lists -- are made up of nodes and links.
 Terms:
 Root: the topmost node of the tree, which never has any links or edges connecting it.
 Link: the reference that a parent node contains that tells it what its child node is
 Child: any node that has a parent node that links to it
 Sibling: any group of nodes that are the children  of the same node.
 Internal: any node that has a child node(basically all parent nodes)
 Leaf: any node that does not have a child node in the tree

 A tree can only ever have 1 root node, and the root node cannot have any parents
 ,which means nothing can link to it.


 if a tree has n nodes, it will always have one less numb of edges/links(n-1)
 Trees are recursive data structures because a tree is usually composed of smaller
 trees -often referred to as subtrees -inside of it.

 For the most part, the two properties that we will be the most concerned with
 are either the depth of a node or the height of a node.

 The depth of a node is the number of links or edges it takes to reach that
 node to the root of the tree.
 The height of a node is the maximum number of links or edges(or the longest path)
 from that node to its furthest leaf.

 height: leaf to root
 depth: node to root

The height of a tree would be the height of its root node or
 the depth of its deepest node.

 The diameter or width of a tree is the number of nodes on the longest path between
 any two lead nodes

 Balanced tree vs Unbalanced tree
 A tree is considered to be balanced if any two sibling subtrees do not differ
 in height by more than one level.
 However, if two sibling subtrees differ significantly in height(and have more than
 one level of depth difference), the tree is unbalanced.

 Example: File structure or file system are really just trees.
 Data Structures, Algorithms/networking, Compression of files

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
 * -- the last level has all nodes in left as possible
 *
 * Perfect Binary tree : all leaf nodes are at same level.
 *
 * Balanced tree :: height of tree at max log(n) n : n   umber of nodes.
 *
 * Degenerate tree : every node has single children(singly linked list)
 *
 * Ordered BT or sorted Binary tree (Binary search tree).
 *
 * You can add or delete elements in O(log n) time
 * limitation unbalanced binary tree insertion and deletion take more time.
 * how to solve this problem?
 * self balance Binary tree
 *
 * inefficient for sorted data
 *
 * Properties
 * size = total number of nodes
 *
 * Perfect BT, total nodes = 2^(h + 1) - 1
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

