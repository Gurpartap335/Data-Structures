/*
https://www.geeksforgeeks.org/find-second-largest-element-array/
 */
package lecture.array;

public class FindSecondLargestElementInAnArray {
    public static void main(String[] args) {

        int[] arr = {11, 3, -5, 9, 7, 12, 12, 9, 9 , 1, 11, -3, 1};
        System.out.println(secondLargest2(arr));
    }

    public static int largestElement(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int secondLargest(int[] arr) {
        int max1  = arr[0] , max2 = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            max1 = Math.max(arr[i],max1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max1){
                continue;
            }
            max2 = Math.max(arr[i],max2);
        }

        return max2;
    }

    public static int secondLargest2(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }


        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (secondLargest < arr[i] && largest != arr[i]) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}

