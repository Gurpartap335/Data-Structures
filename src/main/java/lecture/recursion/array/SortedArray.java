package lecture.recursion.array;

// Find if array is sorted or not

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1};
        System.out.println(arraySortedR(arr, 0));
    }

    static boolean arraySorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // pass by reference and pass by value
    static boolean arraySortedR(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && arraySortedR(arr, index + 1);
    }
}
