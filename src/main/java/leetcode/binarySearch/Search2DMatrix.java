package leetcode.binarySearch;

import java.util.Arrays;

// https://leetcode.com/problems/search-a-2d-matrix/
public class Search2DMatrix {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
            {1, 3, 5, 7},
            {10, 11, 16, 20},
             {23, 30, 34, 60}
        };

        System.out.println(searchMatrix(matrix, 3));


    }

    // TC : O(log n + m)
    public static boolean searchMatrix(int[][] matrix, int target) {
        int searchRow = inWhichRowTarget(matrix, target);

        if (searchRow == -1) {
            return false;
        }
        return binarySearch(matrix, target, searchRow);
    }


    // O(m)
    public static int inWhichRowTarget(int[][] matrix, int target) {
        int column = matrix[0].length - 1;

        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][column]) {
                return i;
            }
        }
        return -1;
    }


    // we can also use BS to find in which row target element exits



    // O(logn)
    public static boolean binarySearch(int[][] matrix , int target, int row) {
        int start = 0;
        int end = matrix[row].length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (matrix[row][mid] == target) {
                return true;
            }
            else if (target > matrix[row][mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }


    // O(logn*m)
    // Treat matrix as long sorted list
    public static boolean searchMatrix2(int[][] matrix, int target) {
        int column = matrix[0].length;
        int start = 0;
        int end = matrix.length * column - 1;

        while (start <= end) {
            int mid = end + (start - end) / 2;
            if (matrix[mid/column][mid % column] == target) {
                return true;
            } else if (matrix[mid/column][mid%column] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}

// https://leetcode.com/tag/matrix/
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/