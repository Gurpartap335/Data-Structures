package lecture.hashtable;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(10);
        queue.add(9);
        queue.add(45);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        PriorityQueue<Integer> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.add(45);
        queue1.add(23);
        queue1.add(-2343);
        queue1.add(0);
        queue1.add(41);
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());


        PriorityQueue<String> queue2 = new PriorityQueue<>();
        queue2.add("a");
        queue2.add("e");
        queue2.add("i");
        queue2.add("b");
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());
        System.out.println(queue2.remove());


    }
}

/**
 * add and remove works in O(log n)
 * peek O(1)
 *
 * PriorityQueue by default give priority to the smallest element which we can
 * change.
 *
 * HeapSort out-place sort
 */
