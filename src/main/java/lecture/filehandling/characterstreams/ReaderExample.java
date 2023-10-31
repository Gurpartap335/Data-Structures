package lecture.filehandling.characterstreams;

import java.io.*;

public class ReaderExample {

    public static void main(String[] args) throws IOException {
        try {
            Reader reader = new FileReader("D:\\Java\\Projects\\File\\Homixide.txt");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char)i + " ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        FileReader reader = new FileReader("D:\\Java\\Projects\\File\\Homixide.txt");
        System.out.println(reader.read());

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(br.readLine());
        }
    }
}
