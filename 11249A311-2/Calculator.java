import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");

        f.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", "=", "C", "/"
        };

        for (String b : buttons) {
            f.add(new JButton(b));
        }

        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}