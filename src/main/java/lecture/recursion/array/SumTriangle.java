package lecture.recursion.array;

import java.util.Arrays;

// https://www.geeksforgeeks.org/sum-triangle-from-array/
public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1, 2};
//        sumTriangle(arr);
        printTriangle(arr);

    }
    public static void sumTriangle(int[] arr) {
        if (arr.length < 2) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] temp = new int[arr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i] + arr[i + 1];
        }
        sumTriangle(temp);

        System.out.println(Arrays.toString(arr));
    }


    // recursive approach (without using for loop)
    public static void printTriangle(int[] arr) {
        if (arr.length < 2) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        int[] temp = new int[arr.length - 1];

        helper(temp, arr, 0);

        printTriangle(temp);

        System.out.println(Arrays.toString(arr));
    }

    private static int[] helper(int[] temp, int[] arr, int index) {
        if (temp.length == index) {
            return temp;
        }

        temp[index] = arr[index] + arr[index + 1];
        return helper(temp, arr, index + 1);
    }
}

// why primitive data types can not store null values
// primitives data type have fixed memory size?
// object data types do not have fixed memory size.
// https://stackoverflow.com/questions/11047276/why-cant-primitive-data-types-be-null-in-java#:~:text=Because%20null%20is%20a%20reference,Only%20objects%20are%20reference%20types.
// https://stackoverflow.com/questions/27476845/what-is-the-difference-between-a-null-array-and-an-empty-array
// https://stackoverflow.com/questions/8790809/whats-the-difference-between-primitive-and-reference-types
// https://tarunjain07.medium.com/complexity-analysis-for-recursion-notes-cd4930e26683#:~:text=The%20time%20complexity%20of%20recursion,%5EN)%20and%20so%20on.
// https://www.enjoyalgorithms.com/blog/time-complexity-analysis-of-recursion-in-programming

// merge sort
// quick sort
// recursive tc blog
// directly flow kk backtracking
// subset permutations 2d array problems