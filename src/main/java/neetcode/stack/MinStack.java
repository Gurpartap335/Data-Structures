package neetcode.stack;

import java.util.Deque;
import java.util.Stack;

// https://leetcode.com/problems/min-stack/
public class MinStack {

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-1);
    }

    private Node top;


    public void push(int value) {
        if (top == null) {
            top = new Node(value, value, null);
        } else {
            top = new Node(value, Math.min(value, top.min), top);
        }
    }

    public void pop() {
        top = top.next;
    }

    public int top() {
        return top.value;
    }

    public int getMin() {
        return top.min;
    }

    private class Node {
        int value;

        int min;
        Node next;

        public Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }
}
