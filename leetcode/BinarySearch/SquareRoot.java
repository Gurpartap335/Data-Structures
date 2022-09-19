package leetcode.BinarySearch;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    static int mySqrt(int x) {
        int s = 1;
        int e = x;

        while (s <= e) {
            int mid = (s + (e - s)/2);

            if (mid == x/mid) {
                return mid;
            } else if (x/mid > mid) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return e;
    }
}
// x/mid as target.
// solve x/mid = mid --> x = mid^2 --> root(x) = mid
// for why mid == x/mid.

// dry run 16 17 12