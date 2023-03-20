package lecture.stack;

import java.util.*;


// internally array?
// stack extends vector class
// queue is like linked list.
// why use stack and queues?
public class InBuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(23);
//        stack.push(45);
//        stack.push(42);
//        stack.push(90);
//        stack.push(3333);
//
//        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(34);
        queue.add(45);
        queue.add(99);
        queue.add(23);
        System.out.println(queue);
        System.out.println(queue.add(55));
        System.out.println(queue.peek());
        System.out.println(queue.offer(4));
        System.out.println(queue.contains(2222));
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());

        Deque<Integer> deque = new ArrayDeque<>();

    }
}
