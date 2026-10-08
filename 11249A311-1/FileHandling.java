import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws Exception {

        String text = "Welcome to Java File Handling.";

        FileWriter writer = new FileWriter("data.txt");
        writer.write(text);
        writer.close();

        FileReader reader = new FileReader("data.txt");

        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
    }
}