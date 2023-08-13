package lecture.string;

import java.util.ArrayList;

public class Operator {
    public static void main(String[] args) {
        // String Concatenation operator
        System.out.println('a' - 'a');
        System.out.println('a' - 'b');
        System.out.println('b' - 'a');
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + "b");
        System.out.println('a' + 3);
        System.out.println("a" + 3);

        System.out.println((char)('a' + 3) + " " + ('a' + 3));

        System.out.println("Kunal" + new ArrayList<>()); // call to toString method for this
        System.out.println("kunal" + new Integer(12));
        System.out.println("Donda" + new String("Warning"));

        System.out.printf("%c%c%n", 'a', 'b');

        char a = 1, y = 2;
        System.out.println(a + y);
        a += y;
        System.out.println(a);
//        a = a + y; // its give us error a variable can store only char data type
                     // a + y give us integer.
        // the result of adding chars, short, byte give us int.

    }
}

// https://stackoverflow.com/questions/8688668/in-java-is-the-result-of-the-addition-of-two-chars-an-int-or-a-char

