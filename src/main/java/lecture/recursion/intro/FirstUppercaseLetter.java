package lecture.recursion.intro;

// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUppercaseLetter {
    public static void main(String[] args) {
        System.out.println(firstUpperCaseLetterR("geeksforgeeKs", 0));
        System.out.println(firstUpperCaseLetterR("geekSs", 0));
        System.out.println(firstUpperCaseLetterR("AgeekSs", 0));
    }

    // How characters store internally or how we compare two characters
    public static Character firstUpperCaseLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                return s.charAt(i);
            } // use can inbuilt function also Character.isUpperCase();
        }
        return null;
    }

    // using recursion
    public static Character firstUpperCaseLetterR(String s, int i) {
        if (s.length() < i) {
            return null;
        }
        if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
            return s.charAt(i);
        }
        return firstUpperCaseLetterR(s, i + 1);
    }
}
