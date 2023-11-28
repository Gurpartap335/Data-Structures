package leetcode.stack;

import java.util.Deque;
import java.util.HashMap;
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
        System.out.println(isValid(")))"));
        System.out.println(isValid("([)]")); // debug in copy and intellij
    }


    // TC: O(n), SC: O(n)
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
    // ({}[])

    // using HashMap
    // O(n)
    public static boolean isValid2(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }

            else if (stack.isEmpty() || map.get(c) != stack.pop ()) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    // using LinkedList

}
