package lecture.array;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter element of array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

        for (int i:arr) {    // for-each loop or enhanced loop . it provides an alternative approach to traverse the array or collection in java .
            System.out.print(i + " ");
        }
        System.out.println();
        /*
        the advantage of the for each-loop is that it eliminates the possibility of bugs + more readable .
        each element one by one

        drawback : it cannot traverse array in reverse order .

        syntax
        for(data_type variable : array | collection) {
        //body of for-each loop
        }

        index of i is started from 1 . its different in for-each loop.
         */

        // For-each loop Example : Traversing the collection elements .
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Eren");
//        list.add("ken");
//        list.add("reze");
//
//        for (String name :
//                list) {
//            System.out.println(name);
//        }


        // Linear search





    }
}
