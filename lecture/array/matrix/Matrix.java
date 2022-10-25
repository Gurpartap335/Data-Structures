package lecture.array.matrix;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        // matrix is sorted in a row wise and column wise manner.
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        }; // 4 x 3

        System.out.println(Arrays.toString(searchIn2D(arr,21)));

//        int[] arr2 = {3, 9, 5 , 12, 15, 19};
//
//        System.out.println(Arrays.toString(arr)); // calling toString method in Object class
//        System.out.println(Arrays.toString(arr2)); // calling toString method in Arrays class
//        System.out.println(Arrays.deepToString(arr));
//        System.out.println(Arrays.deepToString(new int[][]{arr2}));
        // arr[i] gives number of columns in ith row

    }

    static int[] searchIn2D(int[][] nums, int target) {
            int r = 0;
            int c = nums[0].length - 1;

            while (r < nums.length && c >= 0) {
                if (nums[r][c] == target) {
                    return new int[]{r, c};
                }
                else if (nums[r][c] < target) {
                    r++;
                } else {
                    c--;
                }
            }

        return new int[]{-1, -1};
    }
    /*
    if target element is greater than last element in the row then so we no need to search in that row so increase the row (r++)

    else c-- bcz last element is greater than target element so next element of that column is also greater than target element so we no need to search in that space.

    why condition r < num.length && c >= 0 bcz r++(start pointing 0) and c-- (starting point length of column in ith row - 1).
     */
}
/*
When you given to search something in big data try to minimize the search space.
 */

