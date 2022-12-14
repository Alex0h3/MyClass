import java.awt.Color;
import java.awt.Graphics;

public class Ufo extends Vehicles {
    private int w, h;

    public Ufo(int speeddX, int speeddY, int speedX, int speedY, Color color, int w, int h) {
        super(speeddX, speeddY, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }

    public void drawUfo(Graphics g) {
        g.setColor(this.getColor());
        g.fillOval(getDot().getX(), getDot().getY(), w, h);
        g.setColor(Config.COLOR_UFO);
        double x1 = w;
        double y = h;
        x1 *= 0.1;
        y *= 0.8;
        g.fillOval(getDot().getX() + (int) x1 + 10, getDot().getY() + (int) y - 30, (h / 2) + 10, h / 2);

    }
}
