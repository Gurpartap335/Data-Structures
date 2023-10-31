package lecture.filehandling.bytestreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("D:\\Java\\Projects\\File\\Hello.txt");
            out.write(65);
            out.close();
            System.out.println("Done...");
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            FileOutputStream out = new FileOutputStream("D:\\Java\\Projects\\File\\Random.txt");
            out.write(65);
            out.close();
            System.out.println("Done...");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileOutputStream out = new FileOutputStream("D:\\Java\\Projects\\File\\Random2.txt");
            out.write(65);
            out.close();
            System.out.println("Done...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
