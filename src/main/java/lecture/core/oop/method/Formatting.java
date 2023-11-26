package lecture.core.oop.method;

// https://www.java67.com/2020/04/4-examples-to-round-floating-point-numbers-in-java.html

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Formatter;

public class Formatting {
    public static void main(String[] args) {
//        System.out.println(System.out);
        // PrintStream InputStream
        // DecimalFormat BigDecimal Formatter for numbers
//
//        String strDouble = String.format("%.2f", 1.99999);
//        System.out.println(strDouble);
//        System.out.println(String.format("%.2f", 1.5000111));
//        System.out.println(String.format("0.111f", 1.123456));
//
//        // arbitrarily
//        System.out.println(String.format("%.2f", 1.999));
//
//        DecimalFormat df = new DecimalFormat("#.##");
//        System.out.println(df.format(2.43234));
//        System.out.println(df.format(2.99999));

        String strDouble = String.format("%.2f", 2.0000123);
        System.out.println(strDouble);

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(2.0000232));



        }
}

class FormatFloatInJava {
    public static void main(String[] args) {

//        float pi = 3.1428733f;
//
//        String str = String.format("%.2f", pi);
//        System.out.println("Formatted float up to 2 decimals " + str);
//
//        System.out.printf("%.2f", pi);
//        System.out.println();
//        System.out.printf("floating point number up to 3 decimals : %.03f",  pi);
//
//        DecimalFormat df = new DecimalFormat("#.###");
//        System.out.println();
//        System.out.println(df.format(1.1234432));

        // %<flags><width><.precision>specifier

        System.out.printf("precision formatting upto 4 decimals places %.4f\n", 2.28);


    }
}

