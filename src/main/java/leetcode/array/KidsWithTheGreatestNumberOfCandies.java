/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */
package leetcode.array;

import java.util.*;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

    }

    static List<Boolean> kidsWithGreaterCandies(int[] candies, int extraCandies) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0;i < candies.length;i++) {
            maxi = Math.max(candies[i],maxi);
        }

//        boolean[] res = new boolean[candies.length];
//        for (int i = 0;i < candies.length;i++) {
//            if (candies[i] + extraCandies >= maxi)
//                res[i] = true;
//            else
//                res[i] = false;
//        }

        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= maxi);
        }
        return res;
    }

//    static List<Boolean> kidsWithGreaterCandies(int[] candies , int extraCandies) {
//        List<Boolean> ans = new ArrayList<>();
//        int maxi = 0;
//
//        for (int i : candies) {
//            maxi = Math.max(i,maxi);
//        }
//
//        for (int i = 0; i < candies.length; i++) {
//            maxi = Math.max(candies[i],maxi);
//        }
//
//        for (int i : candies) {
//            ans.add(i + extraCandies >= maxi);
//        }
//
//        for (int i = 0; i < candies.length; i++) {
//            ans.add(candies[i] + extraCandies >= maxi);
//        }
//
//        return ans;
//    }
}
