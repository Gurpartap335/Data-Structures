package leetcode.binarySearch;

public class FindInAMountainArray {
    public static void main(String[] args) {

    }


    public static int findInMountainArray(int target, int[] mA) {
        int s = 0;
        int e = mA.length - 1;

        while (s < e) {
            int m = s + e >>> 1;

            if (mA[m] > mA[m + 1]) {
                e = m;
            }
            else if (mA[m] < mA[m + 1]) {
                s = m + 1;
            }
        }

        int ans = binarySearch(mA,target,0,s);
        if (ans == -1) {
            return binarySearch2(mA,target,s,mA.length - 1);
        } else {
            return ans;
        }
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = end + (start - end)/2;
            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }

        }
        return -1;
    }

    // binary search if array is in des. order.
    public static int binarySearch2(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = end + (start - end)/2;
            if (arr[mid] == target) {
                return mid;
            }

            else if (arr[mid] < target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }
}

/*
Find peak element index.
Search in ascending array -> 0,peak element index
Search in descending array -> peak element index, arr.length - 1
 */
