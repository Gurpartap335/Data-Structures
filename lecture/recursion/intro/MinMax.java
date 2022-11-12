package lecture.recursion.intro;

public class MinMax {
    public static void main(String[] args) {
//        int[] arr = {1,4,35,-5,-4,-8,6};
        int[] arr = {4,-55,99,1};
        int n = arr.length;

        System.out.println(findMax(arr,n));
//        System.out.println(findMin(arr,n));
    }

    // recursive program to find minimum and maximum elements of array.

    static int findMax(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }

        return Math.max(arr[n-1], findMax(arr,n - 1));
    }

    static int findMin(int[] arr, int n){
        if (n == 1){
            return arr[0];
        }

        return Math.min(arr[n-1], findMin(arr,n - 1));
    }




}
