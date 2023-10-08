package neetcode.stack.implementation;

import java.util.*;
import java.util.Stack;

public class InBuiltStack {
    public static void main(String[] args) {
        java.util.Stack<String> stack = new Stack<>();
        Vector<Integer> vector = new Vector<>();

        stack.add("Ye");
        stack.add("Yeezus");
        stack.add("Utopia");
        stack.add("Donda");

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.add("Donda"));
        System.out.println(stack.search("Ye"));
        System.out.println(stack.search("Donda"));
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.size());

        Deque<String> deque = new ArrayDeque<>();
        deque.push("Ye");
        deque.push("Carti");
        deque.push("Uzi");
        deque.push("NBA YoungBoy");
        System.out.println(deque);
        System.out.println(deque.isEmpty());
        deque.pop();
        deque.pop();
        deque.pop();
        deque.pop();
        System.out.println(deque);
        System.out.println(deque.pop());



    }
}
// why can we instantiate abstract class
// AbstractList, AbstractCollection
// Include EmptyStackException in implementation
// why should you use Exception when you just simply can print the error and end the message.