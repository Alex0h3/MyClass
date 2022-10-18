import java.awt.Color;
import java.awt.Graphics;

public class Food {
    private Color color;
    private int size;
    private Point p;

    public Food(int size, Color color, Point p) {
        this.size = size;
        this.color = color;
        this.p = p;

    }

    public void setPoint(Point p) {
        this.p = p;
    }

    public Point getPoint() {
        return p;
    }

    public void randomNewFood() {

        double x = Math.random() * Confiig.SIZE_X_SEG;
        double y = Math.random() * Confiig.SIZE_Y_SEG;

        p.setX((int) x);
        p.setY((int) y);

    }

public void draw(Graphics g){

    randomNewFood();
    g.setColor(color);
    g.fillOval(p.getX()*Confiig.SIZE_SEG,p.getY()*Confiig.SIZE_SEG, size,size);
}
