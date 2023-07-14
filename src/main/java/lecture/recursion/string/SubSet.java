package lecture.recursion.string;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        System.out.println(subset(new int[]{1, 2, 3}));

//        int[] arr = {1, 2, 3};
//        List<List<Integer>> ans = subset(arr);
//        for (List<Integer> list : ans) {
//            System.out.println(list);
//        }

    }

    /**
     * reject and accept.
     */
    // iteration
    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>(); // main list

        outer.add(new ArrayList<>()); // add empty list

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}