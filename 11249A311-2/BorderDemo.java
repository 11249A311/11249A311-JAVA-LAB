import javax.swing.*;
import java.awt.*;

public class BorderDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Border Layout");

        f.setLayout(new BorderLayout());

        f.add(new JButton("Header"), BorderLayout.NORTH);
        f.add(new JButton("Footer"), BorderLayout.SOUTH);
        f.add(new JButton("Menu"), BorderLayout.WEST);
        f.add(new JButton("Right"), BorderLayout.EAST);
        f.add(new JButton("Content"), BorderLayout.CENTER);

        f.setSize(400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}