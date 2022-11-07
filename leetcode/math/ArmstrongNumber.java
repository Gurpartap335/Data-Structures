package leetcode.math;

// https://leetcode.com/problems/armstrong-number/
// https://leetcode.ca/all/1134.html
// https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1?category%5B%5D=Mathematical&category%5B%5D=Mathematical&page=2&query=category%5B%5DMathematicalpage2category%5B%5DMathematical

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(checkArmstrong(153));
    }

    static boolean checkArmstrong(int n) {
        int ans = 0, count = 0, check = n;
        while (n > 0) {
            count = n % 10;
            ans = ans + (count * count * count);
            n /= 10;
        }

        return ans == check;
    }
}
