package lecture.recursion.basic;

// https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUppercaseLetter {
    public static void main(String[] args) {
        System.out.println(firstUpperCaseLetterR("geeksforgeeKs"));
        System.out.println(firstUpperCaseLetterR("geeks"));
        System.out.println(firstUpperCaseLetterR("AgeekSs"));
    }


    // How characters store internally or how we compare two characters
    public static Character firstUpperCaseLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                return s.charAt(i);
            }
        }
        return null;
    }

    public static Character firstUpperCaseLetter1(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                return s.charAt(i);
            }
        }
        return null;
    }

    // using recursion
    // tail recursive method
    public static Character firstUpperCaseLetterR(String s) {
        return firstUpperCaseLetterR(s, 0);
    }
    public static Character firstUpperCaseLetterR(String s, int i) {
        if (s.length() <= i) {
            return null;
        }
        if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
            return s.charAt(i);
        }
        return firstUpperCaseLetterR(s, i + 1);
    }
}

// why we have wrapper classes for primitive data types?
// why primitive and wrapper can store each other.
// why we can not print null
// what is null in java
// https://medium.com/@bpnorlander/java-understanding-primitive-types-and-wrapper-objects-a6798fb2afe9