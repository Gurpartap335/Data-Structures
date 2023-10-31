package lecture.filehandling.characterstreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class InputStreamReaderExample {
    public static void main(String[] args) {
          try {
              Writer writer = new FileWriter("D:\\Java\\Projects\\File\\Homixide.txt");
              writer.write("Homixide Homixide");
              writer.close();
              System.out.println("Done");

          } catch (IOException e) {
              System.out.println(e);

          }


          try(InputStreamReader in = new InputStreamReader(System.in)) {
              System.out.println("Enter some letters");
              int letters = in.read();
              while (in.ready()) {
                  System.out.println((char) letters);
                  letters = in.read();
              }
              System.out.println();
          } catch (IOException e) {
              System.out.println(e);
          }
    }
}
