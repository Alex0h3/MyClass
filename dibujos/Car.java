import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehiculo {
    private int w, h;

    public Car(int speeddX, int speeddY, int speedX, int speedY, Color color, int w, int h) {
        super(speeddX, speeddY, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }

    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(getDot().getX(), getDot().getY(), w + 50, h);
        g.setColor(Color.WHITE);
        double x1 = w;

        double y1 = h;
        x1 *= 0.2;
        y1 *= 0.8;
        // c
        g.fillOval(getDot().getX() + (int) x1, getDot().getY() - (int) y1 - 10, 20, 50);
        // A
        g.fillOval(getDot().getX() + (int) x1 * 5, getDot().getY() - (int) y1 - 8, 18, 100);
        // d
        g.fillOval(getDot().getX() - (int) x1 + 15, getDot().getY() - (int) y1 - 25, 40, 25);

    }
}