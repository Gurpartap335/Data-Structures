package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size  = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter key element : ");
        int key = s.nextInt();
        System.out.println(binarySearch(arr,key));



    }

    // Binary Search algorithm
    // Given a sorted array arr[] of n elements, write a function to search a given element x in arr[] .
    // return the index
    // return -1 if it does not exit .
    static int binarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if (target < arr[mid]) { // if target is less middle element change end .
                end = mid -1;
            }
            else if(target > arr[mid]) { // if target is greater than mid element change start .
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    /*
    Better way to find mid (element)
    m = (s + e) /2  (s + e) this may exceed the int range

    m = s + (e - s) / 2
     */

}

/*
Binary Search

Binary search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half .

The idea of binary search is to use the information the array is sorted and reduce
the time complexity to O(Log n) .

1. compare x with the middle element .
2. If x matches with the middle element , we return the mid index .
3. if x > mid x only lie in the right half sub-array after the mid element . So we recur for the right half .
4. if x < mid recur for the left half .

why Binary Search ?

Time Complexity of Binary Search

N/2^k = 1
N = 2^k
log(N) = log(2^K)
log(N) = klog2
k = logN / log2
k = log2N (log 2 base ) where N is the size of array .

Total comparisons in the worst case = logN

search in 1 millions elements
worst case for
LS : 1m comparisons
BS : 20 comparisons


Order-Agnostic Binary Search .

 */
