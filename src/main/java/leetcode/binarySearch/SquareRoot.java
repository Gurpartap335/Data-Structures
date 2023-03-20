package leetcode.binarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt2(3));
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

    // brute force
    // critical point i * i <= x && (i + 1)(i + 1) > x
    static int mySqrt2(int x) {
        if (x == 0) return 0;
        for (int i = 1; i <= x; i++) {
            if (i <= x/ i && (i + 1) > x/(i + 1)) {
                return i;
            }
        }
        return -1;
    }
}
// x/mid as target.
// solve x/mid = mid --> x = mid^2 --> root(x) = mid
// for why mid == x/mid.
// mid * mid == x cause overflow

// dry run 16 17 12