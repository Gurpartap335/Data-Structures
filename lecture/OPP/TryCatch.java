package lecture.OPP;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int[] arr = {1,2,3};
//        try{
//            int n = s.nextInt();
//            System.out.println(arr[n]);
//        }catch (Exception e){
//            System.out.println("Invalid index");
//        }

//        System.out.println("What your fav number");
//        try {
//            int n = s.nextInt();
//            System.out.println(n);
//        }catch (Exception e) {
//            System.out.println("Sorry,please enter a number");
//        }


//        try {
//            int[] a = {1};
//            System.out.println(a[4]);
//        }catch (NullPointerException e){
//            System.out.println("Your array is null");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Your index is out of bounds!");
//        }catch (Exception e){
//            System.out.println("something else went wrong");
//        }

        try {
            main(null);
        }catch (StackOverflowError e){
            System.out.println("ouch");
        }



    }
}
