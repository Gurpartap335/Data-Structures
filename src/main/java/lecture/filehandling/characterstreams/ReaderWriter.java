package lecture.filehandling.characterstreams;

import java.io.*;

public class ReaderWriter {

    public static void main(String[] args) throws IOException {


//        FileWriter out = new FileWriter("D:\\Java\\Projects\\File\\character\\Uzi.txt");
//        BufferedWriter writer = new BufferedWriter(out);
//        writer.write("Pink Tape\n");
//        out.write("Homecoming\n");
//        out.write("Shoota\n");
//        out.write("wokeuplikethis\n");
//        out.write("20 Min\n");
//        writer.write("Fire alarm");
//
//        writer.flush();
//        writer.close();
//
//        Reader reader = new FileReader("D:\\Java\\Projects\\File\\character\\Uzi.txt");
//        int i;
//        while ((i = reader.read()) != -1) {
//            System.out.print((char)i);
//        }
//
//        Writer writer1 = new FileWriter("D:\\Java\\Projects\\File\\character\\carti.txt");
//        writer1.write("R.I.P\n");
//        System.out.println(writer1.append("rip fredo"));
//        writer1.flush();
//        File file = new File("D:\\Java\\Projects\\File\\character\\carti.txt");
//        System.out.println(file.delete());
//        System.out.println(file.getName());
//        System.out.println(file.toURI());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Java\\Projects\\File\\character\\uzi.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = bufferedReader.readLine();
            System.out.println(line);
            System.out.println(line);
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }

            System.out.println(sb.toString());
        }





    }
}
