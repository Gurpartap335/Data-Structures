package lecture.filehandling.bytestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;

public class SequenceInputStreamExample {

    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("D:\\Java\\Projects\\File\\String.txt");
        FileInputStream in2 = new FileInputStream("D:\\Java\\Projects\\File\\String2.txt");
        FileOutputStream out = new FileOutputStream("D:\\Java\\Projects\\File\\New.txt");

        SequenceInputStream sequenceInputStream = new SequenceInputStream(in, in2);
        int j;
        while ((j = sequenceInputStream.read()) != -1) {
            out.write(j);
        }
        out.write('f');
        out.write(3);
        out.write('f');
        sequenceInputStream.close();
        in.close();
        in2.close();


    }
}
