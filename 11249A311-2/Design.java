import javax.swing.*;
import java.awt.*;

public class Design extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Red rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 150, 80);

        // Blue oval
        g.setColor(Color.BLUE);
        g.fillOval(250, 50, 150, 80);

        // Message
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Java Applets are fun!", 100, 180);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Design");

        f.add(new Design());
        f.setSize(500, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}