package lecture.array.Linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchINRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

//        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr,44,4,7));


    }

    static boolean search(int[] arr , int target , int i1 , int i2) {
        for (int i = i1; i <= i2; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }
}
