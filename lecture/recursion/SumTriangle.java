/*
https://www.geeksforgeeks.org/sum-triangle-from-array/
 */
package lecture.recursion;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        print(a);


    }

    static void print(int[] a){
        // Base case
        if (a.length < 1){
            return;
        }

        // creating new array which contains the sum of consecutive elements in the array passes as parameter.
        int[] temp = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++) {
            int x = a[i] + a[i + 1];
            temp[i] = x;
        }

        System.out.println(Arrays.toString(a));
        print(temp);

//        System.out.println(Arrays.toString(a));
    }
}
