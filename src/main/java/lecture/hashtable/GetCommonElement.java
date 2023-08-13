package lecture.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.RandomAccess;

public class GetCommonElement {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {1, 1, 1, 2, 2, 3, 5, 5, 7, 7};
        getCommon(arr1, arr2);

    }

    public static void getCommon(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int n : arr1) {
            map1.put(n, 0);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int n : arr2) {
            map2.put(n, 0);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for (int key : map2.keySet()) {
            if (map1.containsKey(key)) {
                System.out.print(key + " ");
            }
        }
    }
}
