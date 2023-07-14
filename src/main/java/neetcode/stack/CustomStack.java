package neetcode.stack;

import lecture.stack.StackException;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.Vector;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 5;

    private int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int n) throws StackException{
        if (isFull()) {
            throw new StackException("Stack is Full");
        }

        data[++ptr] = n;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public void display() throws StackException {
        if (isEmpty()) {
            throw new StackException("Can print elements from empty stack");
        }

        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1; //if 0 means when element is already added in the stack.
    }

    public int size() {
        if (isEmpty()) {
            return -1;
        }
        return ptr + 1;
    }

    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(3);
        assert stack.isEmpty();
        assert stack.isEmpty();

        stack.push(3);
        stack.push(5);
        stack.push(2);

    }
}
/**
 * What time complexity of each method.
 * Implementing stack using array.
 */
