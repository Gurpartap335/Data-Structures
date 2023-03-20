package neetcode.stack;

import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/

/**
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * EVERY CLOSE BRACKET HAS A CORRESPONDING OPEN BRACKET OF THE SAME TYPE.
 *
 * Hashmap, deque, stacks, Linked list
 */
public class ValidParentheses {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(isValid("(([]))"));
        System.out.println(isValid("([)]")); // debug in copy and intellij
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
