package lecture.filehandling.bytestreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("D:\\Java\\Projects\\File\\String2.txt");
        BufferedInputStream bin = new BufferedInputStream(in);
        int a = bin.read();
        System.out.println((char)a);
        int b = bin.read();
        System.out.println((char)b);
        System.out.println((char)bin.read());
        System.out.println((char)bin.read());
        bin.read();
        System.out.println((char)bin.read());
        System.out.println((char)bin.read());
        System.out.println((char)bin.read());
        System.out.println((char)bin.read());
        System.out.println(bin.read());
        System.out.println(bin.read());
        System.out.println((char)bin.read());
        bin.read();

    }
}
