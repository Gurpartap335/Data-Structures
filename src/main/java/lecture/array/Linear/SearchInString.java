package lecture.array.Linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = s.nextLine();
        System.out.println(Arrays.toString(name.toCharArray())); // printing string element like array.
        /*
        toCharArray() :: method converts the given string into a sequence of characters .
         */



//         using for loop
        for (int i = 0; i < name.length(); i++) {
            System.out.println(i + " " + name.charAt(i) + " ");
        }
        System.out.println();

        System.out.println("Enter a character you want to find : ");
        char target = s.next().charAt(0);

        boolean ans = search(name,target);
        System.out.println(ans);
//

    }

    static boolean search(String str , char t) {
        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (t == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

//    static boolean search2(String str , char t) {
//        if(str.length() == 0){
//            return false;
//        }
//
//        //for-each loop
//        for (char ch : str.toCharArray()) {
//            if (ch == t) {
//                return true;
//            }
//        }
//
//        return false;
//    }


}

class SearchInString2 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter String : ");
        String input = s.nextLine();

        System.out.println("You want to search for character or string");

        while (true) {
            System.out.println("Enter c for character \ns for string : ");

            char c = s.next().charAt(0);
            switch (c) {
                case 'c':
                    searchACharacter();
                    return;
//                case 's':
//                    searchAString();
//                    return;
                default:
                    System.out.println("Wrong input \n Please enter correct input again : ");
            }
        }

    }


    static int searchACharacter() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String name = s.nextLine();
//
        System.out.println("Enter a character you want to search in string : ");
        char c = s.next().charAt(0);

        for (int i = 0; i < name.length(); i++) {
            if (c == name.charAt(i)) {
                return i;
            }
        }
        return 0;

    }
}

