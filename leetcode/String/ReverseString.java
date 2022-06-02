package leetcode.String;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        char[] ch = new char[size];

        for (int i = 0; i < ch.length; i++) {
            ch[i] = s.next().charAt(0);
        }

        System.out.println(Arrays.toString(ch));

        reverseString(ch);

        System.out.println(Arrays.toString(ch));
    }

    static void reverseString(char[] c) {
        int start = 0;
        int end = c.length - 1;
        while (start < end) {
            swap(c,start,end);
                start++;
                end--;

        }
    }

    static void swap(char[] a,int s, int e) {
        char t = a[s];
        a[s] = a[e];
        a[e] = t;
    }
}
