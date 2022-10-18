package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter target element : ");
        while (true) {
            int t = s.nextInt();
            System.out.println(search(arr,t));
        }
    }

    static int search(int[] arr, int t) {
        int pivot = findPivot(arr);

        if (pivot == -1) { // means array is not rotated at unknown pivot.
            binarySearch(arr, t, 0, arr.length -1);
        }

        if (arr[pivot] == t) {
            return pivot;
        }

        // in which part we should apply binary search.
        if (t >= arr[0]) { // if element is not greater than the first element than we have to search in other array.
            return binarySearch(arr, t, 0, pivot - 1);
        }

        return binarySearch(arr,t,pivot+1,arr.length - 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr [mid] <= arr[start]) { // if start element is greater than mid element means greater element exits on
                end = mid - 1; // lower half.
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }


        static int binarySearch(int[] arr,int target, int start, int end){

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }

/*
We have array which is possibly rotated at unknown pivot. We have to find target element in that array using binary
search( O(log n) ).

subProblems
First find the maximum element's index in the array so you can apply binary search.

 */