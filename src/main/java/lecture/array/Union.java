package lecture.array;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 2, 3, 4, 9, 11, 14};
        int[] arr2 = {1, 1, 1, 2, 2, 2, 3, 4, 10, 12, 13};

        System.out.println(Arrays.toString(union(arr1, arr2)));
        System.out.println(Arrays.toString(union2(arr1, arr2)));

    }

    // O(n log n), O(n) set + O(n) array. n : size of arr1 and arr2
    public static int[] union(int[] arr1, int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int j : arr1) {
            set.add(j);
        }

        for (int i : arr2) {
            set.add(i);
        }

        int[] arr3 = new int[set.size()];

        int i = 0;
        for (int a : set) {
            arr3[i++] = a;
        }

        return arr3;
    }


    // O(k), O(k) for returning the answer not for solving
    // k is size of arr1 + size of arr2.
    public static int[] union2(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (list.size() == 0 || arr1[i] != list.get(list.size() - 1)) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                if (list.size() == 0 || arr1[i] != list.get(list.size() - 1)) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (list.size() == 0 || arr2[j] != list.get(list.size() - 1)) {
                    list.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < arr1.length) {
            if (arr1[i] != list.get(list.size() - 1)) {
                list.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (arr2[j] != list.get(list.size() - 1)) {
                list.add(arr2[j]);
            }
            j++;
        }

        int[] arr3 = new int[list.size()];

        int a = 0;
        for (int e : list) {
            arr3[a++] = e;
        }

        return arr3;
    }

}

/*
Union: set of all distinct elements that are in any of these sets.
Intersection: set of all distinct elements that are in all of these sets.
 */