package lecture.filehandling.bytestreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("D:\\Java\\Projects\\File\\String.txt");
            int i = in.read();
            System.out.println((char)i);
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("=====");
        try {
            FileInputStream in = new FileInputStream("D:\\Java\\Projects\\File\\String.txt");
            for (int i = 0; i < 33; i++) {
                System.out.print((char)in.read());
            }
//            int i = 0;
//            while ((i = in.read()) != -1) {
//                System.out.print((char)i);
//            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
