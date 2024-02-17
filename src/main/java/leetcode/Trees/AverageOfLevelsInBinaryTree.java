package leetcode.Trees;

import lecture.trees.BinarySearchTree;
import lecture.trees.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {

    public static void main(String[] args) {

    }


    // TC : O(n) n : total node in tree
    // SC : O(k) queue holds one level of the tree at a time k is max of the tree ||O(n) skewed tree
    public List<Double> averageOfLevels2(Node root) {
        List<Double> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }

                sum += node.value;
            }
            list.add(sum / size);
        }
        return list;
    }



    // brute
    public List<Double> averageOfLevels(Node root) {
        List<Double> list = new ArrayList();
        Queue<Node> queue = new LinkedList();

        queue.add(root);
        while (!queue.isEmpty()) {
            double size = queue.size();
            double sum = 0;
            // use for-each loop to visit every elements in ds without index
            for (Node n : queue) {
                sum += n.value;
            }

            list.add(sum/size);

            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return list;

    }

}
