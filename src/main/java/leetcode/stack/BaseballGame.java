package leetcode.stack;

// https://leetcode.com/problems/baseball-game/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Linked List
 * Stack
 */
public class BaseballGame {
    public static void main(String[] args) {
        String[] s = {"5", "2", "C", "D", "+"};
        System.out.println(calPoints(s));
        System.out.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
    }

    // using Linked list
    public static int callPoints(String[] operations) {
        int sum = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for (String op : operations) {
            if (op.equals("C")) {
                sum -= list.removeLast();
            } else if (op.equals("D")) {
                list.add(list.peekLast() * 2);
                sum += list.peek();
            } else if (op.equals("+")) {
                list.add(list.peekLast() + list.get(list.size() - 2));
                sum += list.peekLast();
            } else {
                list.add(Integer.parseInt(op));
                sum += list.peekLast();
            }
        }
        return sum;
    }

    // stack using switch if else
    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            if (op.equals("+")) {
                int a = stack.pop();
                int newScore = a + stack.peek();
                stack.push(a); // element we removed pushed it again
                stack.push(newScore); // sum of previous two elements
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op)); // parses the string argument as a signed decimal integer.
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }

    // using ArrayList
    public static int calPoints2(String[] ops) {

        ArrayList<Integer> list = new ArrayList<>();
        for (String op : ops) {
            if (op.equals("+")) {
                int sum = list.get(list.size() - 1) + list.get(list.size() - 2);
                list.add(sum);
            } else if (op.equals("D")) {
                int sum = list.get(list.size() - 1) * 2;
                list.add(sum);
            } else if (op.equals("C")) {
                list.remove(list.size() - 1);
            } else {
                int sum = Integer.parseInt(op);
                list.add(sum);
            }
        }

        int ans = 0;
        for (int i  = 0; i < list.size(); i++) {
            ans += list.get(i);
        }

        return ans;
    }
}



