import java.awt.Color;
import java.awt.Graphics;

public class Boat extends Vehicles {

    public Boat(int x, int y, int speedX, int speedY, Color color) {
        super(x, y, speedX, speedY, color);
    }

    public void drawCar(Graphics g) {
        g.setColor(this.getColor());
        g.fillArc(getDot().getX(), getDot().getY(), 80, 80, 0, -180);

    }
}