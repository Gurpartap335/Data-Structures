package leetcode.stack;

import java.util.Stack;

public class ImplementQueuesUsingStack {
    public static void main(String[] args) {
        ImplementQueuesUsingStack queues = new ImplementQueuesUsingStack();
        queues.push(1);
        queues.push(2);
        queues.push(3);
        queues.push(4);
        queues.pop();
        queues.push(5);
        queues.pop();
        queues.pop();
        queues.pop();
        queues.pop();
    }

    private final Stack<Integer> input;
    private final Stack<Integer> output;

    public ImplementQueuesUsingStack() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop(){
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int peek() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean isEmpty() {
        return input.empty() && output.empty();
    }

}
/**
 * 1 2 3 4 pop 5 pop pop pop pop
 */
