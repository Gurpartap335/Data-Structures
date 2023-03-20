package lecture.array.Binary;

public class ReverseBinarySearch {
    public static void main(String[] args) {
        // binary search in array which is in descending order.
        int[] arr = {9, 8, 6, 4, 2, 1};
        System.out.println(binarySearch(arr,91));

    }

    static int binarySearch(int[] a, int t) {
        int s = 0;
        int e = a.length - 1;
        while (s <= e) {
            int m = s + (e - s)/2;

            if (a[m] == t) {
                return m;
            } else if (t > a[m]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }

}
