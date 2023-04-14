package lecture.recursion.array;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {

    // members of Linear Search
    static int a = 0;
    static final int b = 1;
    public static void main(String[] args) {

//        int[] arr = {3, 42, 34, 2, 34, 5, 34};
        int[] arr = {1, 2, 3, 2, 2};

//        System.out.println(findAllIndex2(arr, 34, 0, new ArrayList<>()));
//        ArrayList<Integer> ans = findAllIndex2(arr, 34, 0, new ArrayList<>());
//        System.out.println(ans);

//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex2(arr, 2, 0, list);
//        System.out.println(ans); // return list we stored in ans list.
//        System.out.println(list); // list got modified

        System.out.println(findAllIndex3(arr, 2, 0));

    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findFirstIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findFirstIndex(arr, target, index + 1);
            // we have to put return statement before this function
            // because the method contains a return statement.
        }
    }

    static int findLastIndex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findLastIndex(arr, target, index - 1);
        }
    }

    // without returning ArrayList
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }

    // list is reference variable which is pointing to the same object.
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, target, index + 1, list);
        // tail recursion?
    }

    // return the list without passing the argument
    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) { // base condition
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        // answer from below calls will get here
        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
        // In the end list and ansFromBelowCalls contain the same list.
        // list contains the list from its current function. which is created when this method start executing (arr, 2, 4)
        // ansFromBelowCalls contain the input from upper function from stack.
        // ansFromBelowCalls keep the list update and list var is same with everytime function getting out of the stack.
    }
    // line 98 execute when the functions calls getting out of the stack


}
