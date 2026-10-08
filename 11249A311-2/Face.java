import javax.swing.*;
import java.awt.*;

public class Face extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Face
        g.drawOval(80, 40, 200, 200);

        // Eyes
        g.fillOval(130, 100, 20, 20);
        g.fillOval(210, 100, 20, 20);

        // Nose
        g.drawLine(180, 120, 165, 160);
        g.drawLine(165, 160, 185, 160);

        // Mouth
        g.drawArc(140, 150, 80, 50, 180, 180);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Human Face");

        f.add(new Face());
        f.setSize(400, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}