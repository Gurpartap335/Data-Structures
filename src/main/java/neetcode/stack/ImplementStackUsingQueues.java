package neetcode.stack;

import java.util.*;

// https://leetcode.com/problems/implement-stack-using-queues/

public class ImplementStackUsingQueues {

    public static void main(String[] args) {
        ImplementStackUsingQueues stack = new ImplementStackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.top());
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
