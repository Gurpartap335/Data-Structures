/*
https://medium.com/@shashankmohabia/bitwise-operators-facts-and-hacks-903ca516f28c
 */
package lecture.practise;

public class Bitwise {
    public static void main(String[] args){
        /*
        Bitwise operators are operators that operate on ints and uints at the binary level.
        This means they look directly at the binary digits or bits of integer.

        and & 
        or |
        xor ^
        compliment ~
        shift left <<
        shift right >>
         */

        // and
//        int a = 12, b = 25;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);

        // given a set of numbers where all elements occur even number of times except one numbers, find the odd occurring number.
//        int[] arr = {12, 12, 14, 90, 14, 14, 14};
//        System.out.println(findOdd(arr));

//        int c = 35;
//        System.out.println(~35);
//        System.out.println(~c);
//        System.out.println(~-35);
//        System.out.println(~0 + " " + ~1 + " " + ~256);
//        System.out.println(~35 + " " + ~12);

        // for any integer n, bitwise complement of n will be -(n + 1)
        // why ?
        // This is because in integers the first bit is used for determining the sign of the number


        // right shift operator >>
        // left shift operator <<
        // unsigned right shift >>>

//        int num = 212;
//        for (int i = 1; i < 3; i++) {
//            System.out.println("Right shift by " + i +  " " +(num>>i));
//
//        }
//
//        for (int i = 1; i < 3; i++) {
//            System.out.println("Left shit by " + i + " " + (num<<i));
//        }


        // the bitwise operators should not be used in place of logical operators

        // the left-shift(<<) and right shift(>>) operators are equivalent to multiplication and division by 2 respectively.
        System.out.println(19 << 1);
        System.out.println(19 >> 1);

        //



    }

    static int findOdd(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }
}
