package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;

//Finding the next-smallest or next-largest element in the array relative(considered in relation) to the target even if it is absent from the array.
public class BinaryNext {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        System.out.println("Enter size of array : ");
//        int size = s.nextInt();

//        int[] nums = new int[size];
//
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = s.nextInt();
//        }

        // this algorithm is also working for array if it have duplicate elements.
        int[] nums = {-1, -1, 0, 3, 3, 5, 5, 5, 9, 9, 12, 12};

        System.out.println(Arrays.toString(nums));



        System.out.println("Enter target element : ");
        int t = s.nextInt();
        System.out.println("Smallest: " + nextSmallest(nums,t));
        System.out.println("Largest: " + nextLargest(nums,t));


    }

    // finding the next smallest element in the array relative to the target even if target is absent from the array.

    // this method return next smallest element in the array relative to the target even if target is absent.
    // why i choose end?
    // end is smaller than start. always points towards smaller element
    static int nextSmallest(int[] arr, int t) {

        if (t == arr[0] || t < arr[0]) {
            System.out.println("No more next-smallest element to target bcz target is at index 0");
            return -11111;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start)/2);

            if (arr[mid] >= t) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }

    // this method return next-largest element in the array relative to the target even if target is absent.
    static int nextLargest(int[] arr, int t) {

        if (t == arr[arr.length - 1] || t > arr[arr.length - 1]) {
            System.out.println("Array out of bound");
            return -1111;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + ((end - start)/2);

            if (arr[mid] <= t) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start]; // start always point towards larger index.
    }
}