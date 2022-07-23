/*
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
package leetcode.bitwise;

public class NumberofStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(numberOfSteps2(n));

    }


    static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0){
            if((num & 1) == 0){
                num /= 2;
                count++;

            } else {
                num -= 1;
                count++;
            }
        }
        return count;
    }

    static int numberOfSteps2(int n){
        if (n == 0){
            return 0;
        }

//        return 1 + numberOfSteps2(n % 2 == 0 ? n/2 : n - 1);
        return 1 + numberOfSteps2((n & 1) == 0 ? n/2 : n - 1);

    }

}
