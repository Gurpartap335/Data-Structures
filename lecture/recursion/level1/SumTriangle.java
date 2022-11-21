package lecture.recursion.level1;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        sumTrianglePrint(arr);
    }

    // recursive W problem
    static void sumTrianglePrint(int[] arr) {
        if (arr.length < 1) {
            return;
        }

        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }

        sumTrianglePrint(temp);

        System.out.println(Arrays.toString(arr)); // why we are printing arr not temp
        // curr. temp = [3, 5, 7, 9] arr = [1, 2, 3, 4, 5]
        // then function sumTrianglePrint called again by passing [3, 5, 7, 9]
    }

    // recursion tail
}
