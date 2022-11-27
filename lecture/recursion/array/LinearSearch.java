package lecture.recursion.array;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 42, 2, 422, 4};
//        System.out.println(find(arr, 18, 0));
        System.out.println(findFirstIndex(arr, 4, 0));
//        System.out.println(findLastIndex(arr, 4, arr.length - 1));
//        System.out.println(list);
//        findAllIndex(arr, 4, 0);
//        System.out.println(list);

//        System.out.println(findAllIndex2(arr, 4, 0, new ArrayList<>()));

//        System.out.println(findAllIndex3(arr, 4, 0));
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
        }
        return findFirstIndex(arr, target, index + 1);
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

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr, target, index + 1, list);
    }

    // return the list without passing the argument
    static ArrayList<Integer> findAllIndex3(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex3(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }


}
