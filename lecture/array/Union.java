package lecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of first array : ");
        int size = in.nextInt();
        int[] arr1 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println("Enter size of second array : ");
        int size2 = in.nextInt();
        int[] arr2  = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr1) + Arrays.toString(arr2));

        System.out.println(union(arr1,arr2,size,size2));

    }

    static int union(int[] arr1, int[] arr2, int m, int n){
        int i = 0, j = 0;
        while (i < m && j < n){
            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++]+" ");
            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++]+" ");
            else
            {
                System.out.print(arr2[j++]+" ");
                i++;
            }
        }

        while(i < m)
            System.out.print(arr1[i++]+" ");
        while(j < n)
            System.out.print(arr2[j++]+" ");

        return 0;



    }
}
