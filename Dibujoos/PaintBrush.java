import java.awt.Graphics;
import java.awt.Polygon;

public class PaintBrush {
    private Graphics g;

    public PaintBrush(Graphics g) {
        this.g = g;

    }

    // sky
    public void drawSky() {
        g.setColor(Config.COLOR_SKY);
        g.fillRect(Config.SKY_X, Config.SKY_Y, Config.SKY_W, Config.SKY_H);
        g.setColor(Config.COLOR_SUN);
        g.fillOval(10, 10, 30, 30);
    }

    // sun

    // lake
    public void drawLake() {
        g.setColor(Config.COLOR_LAKE);
        g.fillRect(Config.LAKE_X, Config.LAKE_Y, Config.LAKE_W, Config.LAKE_H);
    }

    // highway
    public void drawCarretera() {
        g.setColor(Config.COLOR_HIGHWAY);
        g.fillRect(Config.HIGHWAY_X, Config.HIGHWAY_Y, Config.HIGHWAY_W, Config.HIGHWAY_H);
        g.setColor(Config.COLOR_HIGHWAY_LINE);
        g.fillRect(Config.HIGHWAY_LINE_X, Config.HIGHWAY_LINE_Y, Config.HIGHWAY_LINE_W, Config.HIGHWAY_LINE_H);
    }

    // mountains
    public void drawMountains() {
        int start = 40;
        int top = 25;
        for (int i = 0; i < 12; i++) {
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