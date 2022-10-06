import java.awt.Graphics;

public class Vehiculo {
    private Graphics g;

    public Vehiculo(Graphics g) {
        this.g = g;

    }

    public void drawPlane() {
        g.setColor(Config.COLOR_PLANE);
        g.fillOval(150, 60, Config.SIZE_PLANE_CABINA_W, Config.SIZE_PLANE_CABINA_H);
        g.setColor(Config.COLOR_PLANE);
        g.fillOval(200, 25, Config.SIZE_PLANE_ALA_W, Config.SIZE_PLANE_ALA_H);
        g.setColor(Config.COLOR_PLANE);
        g.fillOval(170, 40, Config.SIZE_PLANE_BASE_W, Config.SIZE_PLANE_BASE_H);
        g.setColor(Config.COLOR_PLANE);
        g.fillOval(165, 40, Config.SIZE_PLANE_HELICE_W, Config.SIZE_PLANE_HELICE_H);

    }

}