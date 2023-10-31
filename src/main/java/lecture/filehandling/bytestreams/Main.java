package lecture.filehandling.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
//        System.out.println("simple message");
//        System.err.println("error message");
//
//        int a = System.in.read();
//        System.out.println(a);
//        System.out.println((char)a);
//
//        byte[] b = System.in.readAllBytes();
//        System.out.println(Arrays.toString(b));

        FileInputStream in = new FileInputStream("D:\\Java\\Projects\\File\\String.txt");

        FileOutputStream out = new FileOutputStream("D:\\Java\\Projects\\File\\Carti.txt");
        out.write(in.read());
        out.close();

        FileOutputStream out2 = new FileOutputStream("D:\\Java\\Projects\\File\\Carti2.txt");
        out2.write(in.readAllBytes());
        out2.close();
        in.close();




    }
}


