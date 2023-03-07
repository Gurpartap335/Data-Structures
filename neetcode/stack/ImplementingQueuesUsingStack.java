package neetcode.stack;

import java.util.Stack;

public class ImplementingQueuesUsingStack {
    public static void main(String[] args) {
        ImplementingQueuesUsingStack queues = new ImplementingQueuesUsingStack();
        queues.push(23);
        queues.push(12);
        queues.push(2);
        queues.push(90);
        queues.push(5); // 23 12 2 90 5

        System.out.println(queues.peek());
        System.out.println(queues.pop());
        System.out.println(queues.pop());
        System.out.println(queues.pop());
        System.out.println(queues.pop());
        System.out.println(queues.pop());
        System.out.println(queues.isEmpty());

    }

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(int x) {
        stack1.push(x);
    }

    public int pop(){
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.empty() && stack2.empty();
    }

}
