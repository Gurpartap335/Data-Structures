package lecture.basic.tutorials;

public class DataTypes {
    public static void main(String[] args) {

        int gear = 1; // doing so tells your program that a field named "gear" exits , holds numerical data and has an initial value of "1" .

        //short
//        System.out.println(Short.TYPE + " " + Short.SIZE + " " + Short.MIN_VALUE + " " + Short.MAX_VALUE);
//        // char
//        System.out.println(Character.TYPE + " " + Character.SIZE + " " + (int)Character.MIN_VALUE + " " + (int)Character.MAX_VALUE);


        String name = "Gurpartap Singh";
        System.out.println(name.length());


    }


}
/*
There are majorly two types of languages :
1. Statically typed language C , C++ , Java
2. Dynamically typed language Ruby , Python

Java is a statically-typed language i.e all variables must be declared before its use .

A primitive type is predefined by the language and is named by a reserved keyboard .
Primitive data types : boolean , char , byte , short , int , long , float , double ;
Non-primitive data types : classes , Interfaces , arrays , string

float and double data type should not used for precise values such as currency .

Data Type               Default Value
byte                    0
long                    0L
float                   0.0f
double                  0.0d
char                    '\u0000'
String (or any object)  null
boolean                 false

why is the size of the char is 2 bytes in Java ?
In other languages like c and c++ uses ASCII characters and to represent all ASCII characters 8-bits is enough

But JAVA uses the unicode system not ASCII code system
and to represent unicode system 8 bit is not enough to represent all characters .

encode :: convert (information or an instruction ) into a particular form .

Unicode and ASCII are the most popular character ENCODING standards that are currently
being used all over the world.
Unicode is the universal character encoding used to process, store and facilitate the interchange of text data in any language while
ASCII is used for the representation of text such as symbols, letters, digits, etc. in computers.
 */
