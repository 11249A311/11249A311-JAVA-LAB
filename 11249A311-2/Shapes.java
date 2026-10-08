import javax.swing.*;
import java.awt.*;

public class Shapes extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Rectangle
        g.drawRect(50, 50, 100, 60);

        // Circle
        g.drawOval(200, 50, 70, 70);

        // Line
        g.drawLine(50, 150, 150, 150);

        // Triangle
        int x[] = { 200, 250, 150 };
        int y[] = { 150, 220, 220 };
        g.drawPolygon(x, y, 3);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Geometric Shapes");

        f.add(new Shapes());
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}