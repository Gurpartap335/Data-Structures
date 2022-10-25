package lecture.sorting.cyclic;

// https://www.geeksforgeeks.org/sort-array-contain-1-n-values/

import java.util.ArrayList;
import java.util.List;

import static lecture.sorting.cyclic.CycleSort.swap;

public class SortArray1toNValues {
    public static void main(String[] args) {
        // array contain 1 to n element
//        int[] arr = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};
//
//        System.out.println(Arrays.toString(arr));
//        sort(arr);
//        System.out.println(Arrays.toString(arr));


        int a = 2;

        List<Integer> ans = new ArrayList<>();

        int x = 1 + (a *= 2);
        System.out.println(a + " " + x);
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (i != correct) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
