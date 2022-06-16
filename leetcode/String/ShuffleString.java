package leetcode.String;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();
        int[] arr = new int[name.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(shuffle(name,arr));

    }

    static String shuffle(String s,int[] indices) {
        char[] c = new char[indices.length];
        for(int i = 0; i < indices.length; i++) {
            c[indices[i]] = s.charAt(i);
        }
        return new String(c);
    }
}
