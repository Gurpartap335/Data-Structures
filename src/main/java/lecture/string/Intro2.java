package lecture.string;

public class Intro2 {
    public static void main(String[] args) {
        // In java string is basically an object that represents sequence of char values.
//       char[] ch = {'j','a','v','a'};
//       String n = new String(ch);
//       System.out.println(ch);
//       System.out.println(Arrays.toString(ch) + " " +  n);


        // there are two ways to create string object
        // literal
//        String s = "hello";
//        String s2 = "hello"; // it does not create a new instance.
        /*
        JVM checks string constant pool first.
        Strings object are stored in a special memory area -> string constant pool
         */

//        String s3 = new String("hello"); // create two objects and one reference variable.
//
//        String name = "Gurpartap Singh";
////        System.out.println(name.charAt(3) + " " + name.length() + " " );
//
//        name.concat(" 22");
//        System.out.println(name); // strings are immutable
//        // new object is created
//
//        // explicitly assign it to the reference variable
//        name = name.concat("22");
//        System.out.println(name);
//
//        name = "gurpartap singh manoor";
//        System.out.println(name);


//        System.out.println("fdskf" == "fdskf");
//        String s1 = "Guri";
//        String s22 = "Gurii";
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s2.compareTo(s1));
//        System.out.println(name.compareTo("gurpartap singh manoor"));

//        System.out.println("guri".equalsIgnoreCase("guRI") + " " +"guri".equals("Guri"));

        // String Concatenation in Java
//        By + , by concat()

        // A part of String is called substring.

        String s = "computer";
        System.out.println(s.substring(3));
        System.out.println(s.substring(5));
        System.out.println(s.substring(2,5));
        System.out.println(s.substring(4,5));






    }
}
/*
Object is an instance(copy) of a class.

class is a blueprint or template from which objects are created.

Java String class provides a lot methods
compare concat equals split length replace compareTo intern substring
 */