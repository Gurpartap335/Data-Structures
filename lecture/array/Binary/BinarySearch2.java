package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("Enter key element : ");
        int target = s.nextInt();
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] nums , int x) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) { // end should always smaller than start or equal .
            int mid = start + (end - start)/2;

            if (nums[mid] == x) {
                return mid;
            }
            else if (x > nums[mid]) { // if target value is greater than mid value then shift start
                start = mid + 1;
            }
            else { // if target value is less than mid value then shift end
                end = mid - 1;
            }

        }
        return -1;

    }

}
