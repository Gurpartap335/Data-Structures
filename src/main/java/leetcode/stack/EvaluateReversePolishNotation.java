package leetcode.stack;


import java.util.*;

// https://leetcode.com/problems/evaluate-reverse-polish-notation/
// The division between two integers always truncates toward zero. (java by default)
// The answer and all the intermediate calculations can be represented in a 32-bit integer.
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        System.out.println(reversePolishNotation3(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}, 0, new ArrayDeque<>()));

    }

    // TC : O(n)
    // SC : O(n)
    public static int reversePolishNotation(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int first, second;

        for (String s : tokens) {
            if (s.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (s.equals("-")) {
                second = stack.pop();
                first = stack.pop();
                stack.push(first - second);
            } else if (s.equals("/")) {
                second = stack.pop();
                first = stack.pop();
                stack.push(first / second);
            } else if (s.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    // better use deque instead of stack
    // https://github.com/google/error-prone/blob/master/docs/bugpattern/JdkObsolete.md
    public static int reversePolishNotation2(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int first, second;

        for (String s : tokens) {
            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "-":
                    second = stack.pop();
                    first = stack.pop();
                    stack.push(first - second);
                    break;
                case "/":
                    second = stack.pop();
                    first = stack.pop();
                    stack.push(first / second);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }

    // recursive
    // TC : O(n) whole method will run n times behave like for loop.
    // SC : O(n) there will n methods stacked on stack
    public static int reversePolishNotation3(String[] tokens, int i, ArrayDeque<Integer> stack) {
        if (i == tokens.length - 1) {
            return stack.pop();
        }

        int first, second;
        switch (tokens[i]) {
            case "+":
                stack.push(stack.pop() + stack.pop());
                break;
            case "*":
                stack.push(stack.pop() * stack.pop());
                break;
            case "-":
                second = stack.pop();
                first = stack.pop();
                stack.push(first - second);
                break;
            case "/":
                second = stack.pop();
                first = stack.pop();
                stack.push(first / second);
                break;
            default:
                stack.push(Integer.parseInt(tokens[i]));
        }
        return reversePolishNotation3(tokens, i + 1, stack);
    }




}
