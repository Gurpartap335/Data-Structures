package lecture.sorting;


public class SelectionSort<E> {
    public static void main(String[] args) {

    }


    // TC : O(n^2) SC : O(1)
    // TC same best, average and worst
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(arr, i, min);
            }
        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    // descending order
    public void selection3(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int iMax = i;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[iMax] < arr[j])
                    iMax = j;
            }

            int temp = arr[i];
            arr[i] = arr[iMax];
            arr[iMax] = temp;
        }
    }

    // recursive
    public void selectionR(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (r > c) {
            if (arr[c] > arr[c + 1]) {
                selectionR(arr, r, c + 1, c);
            } else {
                selectionR(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r -1] = temp;
            selectionR(arr, r - 1, 0, 0);
        }
    }

    // putting minimum element at the first position
    public void selectionRR(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            if (arr[c] > arr[c +1]) {
                int temp = arr[c + 1];
                arr[c + 1] = arr[c];
                arr[c] = temp;
            }
            selectionRR(arr, r, c + 1);
        } else {
            selectionRR(arr, r - 1, 0);
        }
    }
}
/**
 * Select minimum and swap
 * arr -> 3, 1, 2, 4, 5, 0
 * arr -> 13, 46, 24, 52, 20, 9
 */
