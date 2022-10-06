import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.*;

public class Mycanvaass extends JPanel implements KeyListener, ActionListener {
    Point pSun = new Point(Config.WINDOW_W / 3, Config.WINDOW_H / 3);

    public Mycanvaass() {
        setPreferredSize(new DimensionUIResource(400, 300));
        setBackground(Color.GREEN);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintBruush paintBruush = new PaintBruush(g);
        paintBruush.drawSky();
        paintBruush.drawMountains();
        paintBruush.drawTree(190, 50);
        paintBruush.drawTree(110, 50);
        paintBruush.drawTree(270, 50);
        paintBruush.drawTree(30, 50);
        paintBruush.drawLake();
        paintBruush.drawSun(pSun);
        Vehiculo vehiculo = new Vehiculo(g);
        vehiculo.drawPlane();

    }

    @Override
    public void keyPressed(KeyEvent event) {

        int key = event.getKeyCode();
        if (key == KeyEvent.VK_UP) {
            pSun.setY(pSun.getY() - Config.SUN_STEP);
        }
        if (key == KeyEvent.VK_DOWN) {
            pSun.setY(pSun.getY() + Config.SUN_STEP);
        }
        if (key == KeyEvent.VK_RIGHT) {
            pSun.setX(pSun.getX() + Config.SUN_STEP);
        }
        if (key == KeyEvent.VK_LEFT) {
            pSun.setX(pSun.getX() - Config.SUN_STEP);
        }
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}