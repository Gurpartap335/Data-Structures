package lecture.trees;

/**
 * Trees are like linked lists -- are made up of nodes and links.
 *
 * Terms:
 * Root: the topmost node of the tree, which never has any links or edges connecting it.
 * Link: the reference that a parent node contains that tells it what its child node is
 * Child: any node that has a parent node that links to it
 * Sibling: any group of nodes that are the children  of the same node.
 * Internal: any node that has a child node(basically all parent nodes)
 * Leaf: any node that does not have a child node in the tree
 *
 * if a tree has n nodes, it will always have one less numb of edges/links(n-1)
 * Trees are recursive data structures because a tree is usually composed of smaller
 * trees -often referred to as subtrees -inside of it.
 *
 * For the most part, the two properties that we will be the most concerned with
 * are either the depth of a node or the height of a node.
 *
 * The depth of a node is the number of links or edges it takes to reach that
 * node from the root of the tree.
 * The height of a node is the maximum number of links or edges(or the longest path)
 * from that node to its furthest leaf.
 *
 * Balanced tree vs Unbalanced tree
 *
 * Example: File structure or file system are really just trees.
 *
 * Binary Search tree BST
 *
 * Full Binary Tree either has 0 or 2 children
 * Complete Binary Tree
 * --- all levels are completely filled except the last level.
 * -- the last level has all nodes in left as possible
 *
 * Perfect Binary tree : all leaf nodes are at same level.
 *
 * Balanced tree :: height of tree at max log(N) n : number of nodes.
 *
 * Degenerate tree
 */
public class Intro {
    public static void main(String[] args) {




    }
}
