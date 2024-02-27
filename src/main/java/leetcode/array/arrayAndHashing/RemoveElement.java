package leetcode.array.arrayAndHashing;

public class RemoveElement {

    public static void main(String[] args) {
        System.out.println(remove2(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

     public static int remove(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                j++;
            }
        }
        return nums.length - j;
    }

    public static int remove2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                // nums[i] = nums[j]
            }
        }
        return i;
    }
}
