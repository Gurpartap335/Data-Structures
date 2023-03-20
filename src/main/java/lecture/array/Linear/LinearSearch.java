package lecture.array.Linear;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter element of array : ");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Enter key you want to find : ");
        int key = s.nextInt();

        int ans = linearSearch(arr,key);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr , int target) {

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
/*
Best Case O(1)
Worst Case O(N)
 */

