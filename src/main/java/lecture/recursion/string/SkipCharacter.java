package lecture.recursion.string;

public class SkipCharacter {
    public static void main(String[] args) {
        skip("abcaa", "");
//        System.out.println(skip("aaaasdfasdfaaa"));

//        System.out.println(search("asdfasdf", ""));


//        System.out.println(skipApple("aaapplehjk", ""));
//        System.out.println(skipAppNotApple("abdfapprgrfapplejj"));
    }


    static void skip(String str, String temp) {
        if (str.isEmpty()) {
            System.out.println(temp);
            return;
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            skip(str.substring(1), temp);
        } else {
            skip(str.substring(1), temp + ch);
        }
    }

    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
//        if (ch == 'a') {
//            return skip(str.substring(1));
//        } else {
//            return ch + skip(str.substring(1));
//        }

        return ch == 'a' ? skip(str.substring(1)) : ch + skip(str.substring(1));
    }

    // tail recursion
    static String search(String str, String temp) {
        if (str.isEmpty()) {
            return temp;
        }

        char ch = str.charAt(0);
//        if (ch == 'a') {
//            return search(str.substring(1), temp);//only one return statement going to execute on every func call
//        } else { // may be tail recursion?
//            return search(str.substring(1), temp + ch);
//        }

        return ch == 'a' ? search(str.substring(1), temp) : search(str.substring(1), temp + ch);
    }


    static String skipApple(String str) {
        if (str.isEmpty()) {
            return "";
        }


        if (str.startsWith("apple")) {
            return skipApple(str.substring(5));
        } else {
            return str.charAt(0) + skipApple(str.substring(1));
        }
    }

    // tail recursion
    static String skipApple(String str, String temp) {
        if (str.isEmpty()) {
            return temp;
        }


        if (str.startsWith("apple")) {
            return skipApple(str.substring(5), temp); // a0 p1 p2 l3 e4 5 is the inclusive index.
        } else {
            return str.charAt(0) + skipApple(str.substring(1), temp + str.charAt(0));
        }

//        return str.startsWith("apple") ? skipApple(str.substring(5), temp) : skipApple(str.substring(1), temp + str.charAt(0));
    }

    static String skipAppNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }


        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppNotApple(str.substring(1));
        }
    }

}
/**
 * Permutations and Combinations
 * subsets -> Non-adjacent collection
 *
 * This pattern of taking some elements and removing some is known as this subset
 * pattern.
 *
 */
