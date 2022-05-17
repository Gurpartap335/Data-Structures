package lecture.array.Linear;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int ans = minNumber(arr);
        System.out.println(ans);

//        System.out.println(Integer.MIN_VALUE + "    " + Integer.MAX_VALUE);
    }

    static int minNumber(int[] arr) {
//        int min = Integer.MAX_VALUE;

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min =  arr[i];
            }
        }
        return min;
    }
}
