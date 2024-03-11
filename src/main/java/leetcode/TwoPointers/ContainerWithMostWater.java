package leetcode.TwoPointers;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(mostWater(new int[]{1, 8, 12, 6, 2, 5, 4, 17, 8, 3, 7}));
    }

    /**
     * TC : O(n)
     * SC : O(1)
     */
    public static int mostWater(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int max = 0;
        while (i < j) {
            int dis = j - i;
            int ans;
            if (arr[i] < arr[j]) {
                ans = arr[i] * dis;
                i++;
            } else if (arr[i] > arr[j]) {
                ans = arr[j] * dis;
                j--;
            }else {
                ans = arr[i] * dis;
                i++;
                j--;
            }
            max = Math.max(max, ans);
        }
        return max;
    }

    /**
     * bottleneck
     */
}
