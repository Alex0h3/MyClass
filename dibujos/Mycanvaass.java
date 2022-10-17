import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Timer;
import java.awt.Color;

public class Mycanvaass extends JPanel implements KeyListener, ActionListener {
    // Point pSun = new Point(Confiig.WINDOW_W / 3, Confiig.WINDOW_H / 3);
    // Point pOvni = new Point(Confiig.WINDOW_W / 6, Confiig.WINDOW_H / 6);
    ArrayList<Car> cars = new ArrayList<Car>();

    public Mycanvaass() {
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
        Timer timer = new Timer(80, this);
        timer.start();
        cars.add(new Car(10, 250, 2, -2, Color.RED, 60, 30));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintBruush paintBruush = new PaintBruush(g);
        // Vehicles vehicles = new Vehicles(g);
        paintBruush.drawSky();
        paintBruush.drawMountains();
        paintBruush.drawLake();
        paintBruush.drawTree(190, 50);
        paintBruush.drawTree(110, 50);
        paintBruush.drawTree(270, 50);
        paintBruush.drawTree(30, 50);
        for (Car c : cars) {
            c.move();
            c.draw(g);
        }
        // paintBruush.drawSun(pSun);
        // vehicles.drawPlane();
        // vehicles.drawOvni(pOvni);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }

}