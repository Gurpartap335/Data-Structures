package neetcode.stack;

import lecture.queue.CircularQueue;

import java.util.*;

// https://leetcode.com/problems/implement-stack-using-queues/

public class ImplementStackUsingQueues {

    public static void main(String[] args) throws Exception {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.top());


        System.out.println("====");
        CircularQueue queue1 = new CircularQueue();
        queue1.insert(1);
        queue1.insert(2);
        queue1.insert(3);
        queue1.insert(4);
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());

    }

    // using one queue
    private final Queue<Integer> queue;

    public ImplementStackUsingQueues() {
        queue = new ArrayDeque<>();
    }
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
