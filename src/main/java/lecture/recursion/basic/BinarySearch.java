package lecture.recursion.basic;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 7));
    }

    public static int binarySearch(int[] arr, int t) {
        return binarySearch(arr, t, 0, arr.length - 1);
    }

    public static int binarySearch(int[] arr, int t, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s)/ 2;

        if (arr[m] == t) {
            return m;
        } else if (arr[m] > t) {
           return binarySearch(arr, t, s, m - 1);
        } else {
            return binarySearch(arr, t, m + 1, e);
        }
    }
}
/*
 * F(n) = O(1) + F(n/2)
 * Types of recurrence relation
 * Linear -> Fibo
 * Divide and conquer -> BS
 */
