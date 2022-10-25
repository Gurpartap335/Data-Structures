package leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Kids2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};

//        kidsWithCandies(arr,3);
        System.out.println(kidsWithCandies(arr,3));
    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        boolean value = false;

        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {
                if (candies[i] + extraCandies >= candies[j]) {
                    value = true;
                } else {
                    value = false;
                }
            }

            result.add(value);
        }

        return result;
    }
}
