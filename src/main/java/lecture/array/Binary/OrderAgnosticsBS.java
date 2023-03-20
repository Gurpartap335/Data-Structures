package lecture.array.Binary;

import java.util.Arrays;
import java.util.Scanner;

public class OrderAgnosticsBS {
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
        System.out.println(orderAgnosticsBS(arr,key));
    }
    
    static int orderAgnosticsBS(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end]; // if last element is greater than first element than array is sorted in ascending order.
//        if (arr[start] < arr[end])
//            isAsc = true;
//        else
//            isAsc = false;

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if (arr[mid] == x) {
                return mid;
            }

            // if in ascending order than execute this.
            if (isAsc) {
                if (x < arr[mid]) {
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }

            } else {
                if (x > arr[mid]) {
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }

            }
        }


        return -1;
    
    }


     
}

/*
checking array sorted in ascending order or descending order
 */
