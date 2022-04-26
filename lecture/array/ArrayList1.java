package lecture.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // arraylist is part of collection framework and is present in java.util.package .
        // it provides us with dynamic array in java .
        // it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed .

//        ArrayList<Integer> list = new ArrayList<>(5);
//
//        for (int i = 0; i < 5; i++) {
//            list.add(s.nextInt());
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();
//
//        System.out.println(list);

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0,33);
        arr.add(1,56);
        arr.add(2,456);
        arr.add(3,45);

        arr.clone();
        System.out.println(arr);
        for (int i = 0; i < 4; i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
