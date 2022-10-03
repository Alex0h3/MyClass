import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.plaf.DimensionUIResource;

public class Mycamvaass extends JPanel {
    public Mycamvaass() {
        setPreferredSize(new DimensionUIResource(400, 300));
        setBackground(Color.GREEN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintBruush paintBruush = new PaintBruush(g);
        paintBruush.drawSky();
        paintBruush.drawMountains();
        paintBruush.drawTree();
        paintBruush.drawLake();

    }
}