package lecture.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(recursiveBinarySearch(new int[]{-1,0,3,5,9,12}, 5));
    }


    // TC : O(log n) , SC : O(1)
    public static int binarySearch(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }


    // recursive binary search
    // TC : O(log n) SC : O(log n)
    // space complexity is the size of recursion stack

    public static int recursiveBinarySearch(int[] arr, int target) {
        return recursiveBinarySearch(arr, target, 0, arr.length - 1);
    }

    private static int recursiveBinarySearch(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;

        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (target > arr[mid]) {
            return recursiveBinarySearch(arr, target, mid + 1, end);
        } else {
            return recursiveBinarySearch(arr, target, start, mid - 1);
        }
    }



}

/*
Why Binary Search?

Binary search is a searching algorithm used in a sorted array by repeatedly
dividing the search interval in half.

Better way to find mid (element)
m = (s + e) /2;  (s + e) this may exceed the int range
m = s + (e - s) / 2
mid = (s + e) >>> 1;


The idea of binary search is to use the information the array is sorted and
reduce the time complexity to O(log n).

Duplicate elements in array then how we calculate?

Time Complexity of Binary Search:

k : comparison

1 = n / 2^k
2^k = n
n = 2^k
log(n) = log(2^K)
log(n) = k log2
k = log n/log2
k = log 2 n (log 2 base)

Total comparisons in the worst case = log n

Search in 1 millions elements
worst case for
Linear Search : 1m comparisons
Binary Search : 20 comparisons

Order-Agnostic Binary Search.
This range of possible values is called Search Space.
 */
