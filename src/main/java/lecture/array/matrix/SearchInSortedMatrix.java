package lecture.array.matrix;

import java.util.Scanner;

// https://leetcode.com/problems/search-a-2d-matrix/
/*
Integers in each row are sorted from left to right.

The first integer of each row is greater than the last integer of the previous row.
 */
public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

    }
}
/*
take middle column to reduce number of rows and then perform binary search.

if element == t.
if t < element ignore rows after it.
if element < t ignore above rows.
 */
