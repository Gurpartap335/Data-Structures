package lecture.binarySearch;

import java.util.Arrays;

// Finding the next-smallest or next-largest element in the array relative(considered in relation)
// to the target even if it is absent from the array.
public class BinaryNext {
    public static void main(String[] args) {
        int[] nums = {-1, -1, 0, 3, 3, 5, 5, 5, 9, 9, 12, 12};

        System.out.println(Arrays.toString(nums));

        System.out.println("Smallest: " + nextSmallest(nums, 2));
        System.out.println("Largest: " + nextLargest(nums, 11));

    }

    // see where are the start and end index at when the loop break.
    // start points to larger element and end point to smaller element.
    public static int nextSmallest(int[] arr, int target) {
        if (target <= arr[0]) {
            throw new ArrayIndexOutOfBoundsException("Next smallest element can't exist because target element is at index 0");
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

    public static int nextLargest(int[] arr, int target) {
        if (target >= arr[arr.length - 1]) {
            throw new ArrayIndexOutOfBoundsException("Next largest element can't exist because target element is last element");
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start)/2);

            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }
}