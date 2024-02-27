package lecture.array;

public class Reverse {
    public static void main(String[] args) {

    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            //swap
            swap(arr,start,end);
                start++;
                end--;
        }
    }

    static void swap(int[] a,int s , int e) {
        int t = a[s];
        a[s] = a[e];
        a[e] = t;
    }

    // reverse array using recursion
    static void reverseArray(int[] arr, int start, int end){
        if (start >= end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr,++start,--end);
    }
}
