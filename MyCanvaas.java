import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.plaf.DimensionUIResource;

public class MyCanvaas extends JPanel {
    public MyCanvaas() {
        setPreferredSize(new DimensionUIResource(400, 300));
        setBackground(Color.GRAY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Cielo
        super.paintComponent(g);
        g.setColor(new Color(127, 233, 245));
        g.fillRect(0, 0, 400, 100);
        // Sol
        g.setColor(Color.YELLOW);
        ;
        g.fillOval(50, 50, 25, 25);

    }
}