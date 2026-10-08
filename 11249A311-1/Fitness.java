import java.io.*;

public class Fitness {
    public static void main(String[] args) throws Exception {

        String data = "Name: Harika\nAge: 20\nFitness Goal: Weight Loss";

        FileOutputStream out = new FileOutputStream("profile.txt");
        out.write(data.getBytes());
        out.close();

        FileInputStream in = new FileInputStream("profile.txt");

        int ch;
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }

        in.close();
    }
}