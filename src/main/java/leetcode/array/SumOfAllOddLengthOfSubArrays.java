/*
https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
package leetcode.array;

public class SumOfAllOddLengthOfSubArrays {
    public static void main(String[] args) {
        // lets print odd number
        for (int i = 1; i < 100; i += 2){
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;
        while (i < 100){
            System.out.print(i + " ");
            i += 2;
        }
    }
}
