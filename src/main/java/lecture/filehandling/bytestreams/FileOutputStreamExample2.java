package lecture.filehandling.bytestreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("D:\\Java\\Projects\\File\\String.txt");
        String s = "Wholla lotta red\n";
        byte[] b = s.getBytes();
        out.write(b);
        out.write(b);
        out.write("Hello\n".getBytes());
        out.write(b);
        out.write(65666768);
        out.close();
        System.out.println("Done");
    }
}
