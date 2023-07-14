package lecture.recursion.intro;

// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/
public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(stringLength("abcd"));
        System.out.println(stringLength("GEEKSFORGEEKS"));
        System.out.println(find(""));
        System.out.println(find("f"));
        System.out.println(find(" "));
        System.out.println();
    }

    // without using inbuilt function
    public static int find(String s) {
        return solve(s, s.length(), 0);
    }

    private static int solve(String s, int length, int i) {
        if (length == 0) {
            return i;
        }
        return solve(s, --length, ++i);
    }

    public static int stringLength(String s) {
        if (s.equals("")) {
            return 0;
        }
        return 1 + stringLength(s.substring(1));
    }
}
