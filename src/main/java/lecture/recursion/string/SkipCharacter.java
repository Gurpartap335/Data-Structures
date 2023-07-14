package lecture.recursion.string;

public class SkipCharacter {
    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder(3);
//        skipSB("baccddaaad", 0, sb);
//        System.out.println(sb);

        System.out.println(skipSB("baccdda", 0, new StringBuilder()));
        skip("baccdda", ""); // passing empty string with it
        System.out.println(skip("baccdda"));
//        System.out.println(" " + 'a' + " " + 'b' + test.charAt(2) + "f");
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
    // Character internally stores as ASCII in java??


    // returning a string
    static String skip(String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            return skip(str.substring(1));
        } else {
            return ch + skip(str.substring(1));
        }

//        return ch == 'a' ? skip(str.substring(1)) : ch + skip(str.substring(1));
    }

    // tail recursion?? yes. there is no statement after return statements
    // same as void just we are using return statement.
    static String search(String str, String temp) {
        if (str.isEmpty()) {
            return temp;
        }

        char ch = str.charAt(0);
        if (ch == 'a') {
            return search(str.substring(1), temp);//only one return statement going to execute on every func call
        } else { // may be tail recursion?
            return search(str.substring(1), temp + ch);
        }

//        return ch == 'a' ? search(str.substring(1), temp) : search(str.substring(1), temp + ch);
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


    // using StringBuilder
    public static String skipSB(String str, int i, StringBuilder sb) {
        if (str.length() == i) {
            return sb.toString();
        }

        if (str.charAt(i) != 'a') {
            sb.append(str.charAt(i));
        }

        return skipSB(str, i + 1, sb);
    }

}
