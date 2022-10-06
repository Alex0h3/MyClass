import java.awt.Color;
import java.awt.Graphics;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class PaintBruush {
    private Graphics g;
    private static final Color COLOR_BROWN = new Color(24, 27, 21);
    private static final Color COLOR_TRUNK_TREE = new Color(75, 54, 33);
    private static final Color COLOR_TREE = new Color(75, 139, 59);

    public PaintBruush(Graphics g) {
        this.g = g;

    }

    // sky
    public void drawSky() {
        g.setColor(new ColorUIResource(127, 233, 245));
        g.fillRect(0, 0, 400, 100);
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 20, 20);
    }

    // sun
    public void drawSun(Point p) {

        g.setColor(Config.COLOR_SUN);
        g.fillOval(p.getX(), p.getY(), Config.SUN_SIZE, Config.SUN_SIZE);
    }

    // lake
    public void drawLake() {
        g.setColor(new ColorUIResource(66, 155, 184));
        g.fillRect(0, 210, 300, 100);
    }

    // mountains
    public void drawMountains() {
        int start = 40;
        int top = 25;
        for (int i = 0; i < 4; i++) {
            Polygon triangle = new Polygon();
            int width = 90;
            int spacing = 70;

            triangle.addPoint(start + (spacing * i), top);
            triangle.addPoint((start - (width / 2)) + (spacing * i), top + width);
            triangle.addPoint((start + (width / 2)) + (spacing * i), top + width);

            g.setColor(COLOR_BROWN);
            g.fillPolygon(triangle);
        }
    }

    // tree
    public void drawTree(int start, int top) {

        // draw trunk´s
        g.setColor(COLOR_TRUNK_TREE);
        g.fillRect(start - 10, top + 110, 26, 40);
        // draw tree's
        g.setColor(COLOR_TREE);
        for (int i = 0; i < 5; i++) {
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;
            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width / 2), top + height + (spacing * i));
            triangle.addPoint(start + (width / 2), top + height + (spacing * i));
            g.fillPolygon(triangle);
        }
    }

}