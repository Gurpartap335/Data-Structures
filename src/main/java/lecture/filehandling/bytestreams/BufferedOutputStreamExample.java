package lecture.filehandling.bytestreams;

import java.io.*;

public class BufferedOutputStreamExample {

    public static void main(String[] args) throws IOException {
        OutputStream os = new BufferedOutputStream(new FileOutputStream("D:\\Java\\Projects\\File\\String2.txt"));
        String s = "Pink Tape";
        byte[] b = s.getBytes();
        os.write(b);
        os.flush();
        os.close();
        System.out.println("Done..");

    }
}
