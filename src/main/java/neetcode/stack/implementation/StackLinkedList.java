package neetcode.stack.implementation;

import java.util.NoSuchElementException;

public class StackLinkedList {

    public static void main(String[] args) {

        LinkedListStack stack = new LinkedListStack();

        System.out.println(stack);
        System.out.println(stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Peek " + stack.peek());

        System.out.println(stack);
        stack.push(33);
        System.out.println(stack);
    }


}


class Node {
    public int value;
    public Node next;


    public Node(int data) {
        this.value = data;
        this.next = null;
    }
}

class LinkedListStack {

    /* Top of stack */
    Node head;

    /* size of stack */
    private int size;

    /* Init properties */
    public LinkedListStack() {
        head = null;
        size = 0;
    }

    /**
     * Push element at top
     * @param value to be added
     * @return true if add successfully
     */
    public boolean push(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
        return true;
    }

    /**
     * Removes element at top of stack
     * @return element at top of stack
     */
    public int pop() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        Node node = head;
        head = head.next;
        size--;
        return node.value;
    }

    /**
     * Peek element at top of stack
     * @return element at top of stack
     */
    public int peek() {
        if (size == 0) {
            throw new NoSuchElementException("Empty stack. Nothing to pop");
        }

        return head.value;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
             throw new NoSuchElementException("Can't print from empty stack");
        }
        Node cur = head;
        StringBuilder builder = new StringBuilder();
        while (cur != null) {
            builder.append(cur.value).append("->");
            cur = cur.next;
        }
        builder.delete(builder.length() - 2, builder.length());
        return builder.toString();
    }
}
