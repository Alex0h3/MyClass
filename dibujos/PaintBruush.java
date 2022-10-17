import java.awt.Graphics;
import java.awt.Polygon;

public class PaintBruush {
    private Graphics g;

    public PaintBruush(Graphics g) {
        this.g = g;

    }

    // sky
    public void drawSky() {
        g.setColor(Config.COLOR_SKY);
        g.fillRect(Config.SKY_X, Config.SKY_Y, Config.SKY_W, Config.SKY_H);
    }

    // lake
    public void drawLake() {
        g.setColor(Config.COLOR_LAKE);
        g.fillRect(Config.LAKE_X, Config.LAKE_Y, Config.LAKE_W, Config.LAKE_H);
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

            g.setColor(Config.COLOR_BROWN);
            g.fillPolygon(triangle);
        }
    }

    // tree
    public void drawTree(int start, int top) {

        // draw trunk´s
        g.setColor(Config.COLOR_TRUNK_TREE);
        g.fillRect(start - 10, top + 110, 26, 40);
        // draw tree's

        g.setColor(Config.COLOR_TREE);
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