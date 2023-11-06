package lecture.array.Binary;


public class OrderAgnosticsBS {
    public static void main(String[] args) {
        System.out.println(orderAgnosticsBS(new int[]{12, 9, 5, 3, 0, -1}, -1) );
        System.out.println(1/2);
    }
    
    public static int orderAgnosticsBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2 ;

            if (arr[mid] == target) {
                return mid;
            }

            // if in ascending order than execute this.
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

     
}

/*
checking array sorted in ascending order or descending order
 */
