/*
https://leetcode.com/problems/find-the-highest-altitude/
 */
package leetcode.array;

public class FindTheHighestAltitude {
    public static void main(String[] args) {

    }

    static int largestAltitude(int[] gain) {
        int sum = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(sum,max); // max never be negative . (highest altitude always = 0)
        }

        return max;
    }

}
