package lecture.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble sort is work by swapping the adjacent elements if they are not in the wrong order.
    static void bubbleSort(int[] arr) {
        // 5 1 4 2 8
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // if maximum than swap
                    int temp = arr[j]; // if one swap also happen then swapped value is changed(true).
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break; // if no two elements were swapped by inner loop , then break;
        }
    }
}
