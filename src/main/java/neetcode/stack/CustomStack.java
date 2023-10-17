package neetcode.stack;

import lecture.stack.StackException;

import java.util.EmptyStackException;
import java.util.Stack;


public class CustomStack {

    private int[] data;
    private static final int DEFAULT_SIZE = 4;

    private int ptr;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    /**
     * Constructor
     * @param size Size of the stack
     */
    public CustomStack(int size) {
        this.data = new int[size];
        ptr = -1;
    }


    public boolean push(int value) {
        if (isFull()) {
            resize();
        }
        data[++ptr] = value;
        return true;
    }


    public void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
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
            throw new StackException();
//            throw new StackException("Can print elements from empty stack");
        }

        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    /**
     * Returns true if the stack is empty
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return ptr == -1;
    }

    /**
     * Return size of stack
     * @return size of stack
     */
    public int size() {
        return ptr + 1;
    }

    public void makeEmpty() {
        ptr = -1;
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();

        assert stack.isEmpty():"stack is empty";
        assert !stack.isFull():"stack is not Full";

        stack.push(3);
        stack.push(5);
        stack.push(2);
        stack.push(9);

        assert !stack.isEmpty();
        assert stack.isFull();
        assert stack.pop() == 9;
        assert stack.peek() == 2;
        assert stack.size() == 3;
        assert stack.pop() == 2;

        stack.push(1);
        stack.push(2);

        System.out.println(stack.data.length);
        System.out.println(stack.size());
        assert stack.size() == 4;
        assert stack.pop() == 2;
        assert stack.pop() == 1;

        stack.push(6);
        stack.display();

        while (!stack.isEmpty()) {
            stack.pop();
        }

        assert stack.isEmpty();

        try {
            stack.pop();
            assert false;
        } catch (EmptyStackException e) {
            assert true;
        }

    }
}


// why can we instantiate abstract class
// AbstractList, AbstractCollection
// Include EmptyStackException in implementation
// why should you use Exception when you just simply can print the error and end the message.
