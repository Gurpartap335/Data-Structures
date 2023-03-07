package neetcode.stack;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

// https://leetcode.com/problems/implement-stack-using-queues/

/**
 * Implemented stack: push top pop empty
 * queue :
 */
public class ImplementStackUsingQueues {

    public static void main(String[] args) {

    }

    // using one queue
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        queue.add(x);
        // rotate the queue to make the tail be the head
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // using two queues


}
