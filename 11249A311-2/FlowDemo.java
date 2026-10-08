import javax.swing.*;
import java.awt.*;

public class FlowDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Flow Layout");

        f.setLayout(new FlowLayout());

        f.add(new JButton("One"));
        f.add(new JButton("Two"));
        f.add(new JButton("Three"));

        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}