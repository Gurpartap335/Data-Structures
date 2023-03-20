package lecture.array.hashing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Word {
    public static void main(String[] args) throws IOException {
        try {
            File book = new File("D:\\filename.txt");
            if (book.createNewFile()) {
                System.out.println("File created: " + book.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }


        try {
            FileWriter myWriter = new FileWriter("D:\\filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("an error occurred");
            e.printStackTrace();
        }
    }
}
