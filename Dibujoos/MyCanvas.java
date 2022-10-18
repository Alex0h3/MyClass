import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.Timer;

public class MyCanvas extends JPanel implements KeyListener, ActionListener {
    ArrayList<Car> car = new ArrayList<Car>();
    ArrayList<Ufo> ufo = new ArrayList<Ufo>();
    ArrayList<Plane> plane = new ArrayList<Plane>();
    ArrayList<Boat> boat = new ArrayList<Boat>();

    public MyCanvas() {
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
        setBackground(Config.COLOR_BG);
        Timer timer = new Timer(80, this);
        timer.start();
        // ovni
        ufo.add(new Ufo(10, 100, 2, 0, Config.COLOR_UFOB, 60, 30));
        // Plane
        plane.add(new Plane(10, 0, 2, -3, Config.COLOR_PLANE));
        // Boat
        boat.add(new Boat(10, 190, 2, 0, Color.GREEN));
        // Car
        car.add(new Car(10, 420, 2, 0, Color.BLUE, 60, 30));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        PaintBrush paintBrush = new PaintBrush(g);
        // Vehicles vehicles = new Vehicles(g);
        paintBrush.drawSky();
        paintBrush.drawMountains();
        paintBrush.drawLake();
        paintBrush.drawCarretera();
        paintBrush.drawTree(850, 50);
        paintBrush.drawTree(770, 50);
        paintBrush.drawTree(690, 50);
        paintBrush.drawTree(590, 50);
        paintBrush.drawTree(490, 50);
        paintBrush.drawTree(400, 50);
        paintBrush.drawTree(330, 50);
        paintBrush.drawTree(190, 50);
        paintBrush.drawTree(110, 50);
        paintBrush.drawTree(270, 50);
        paintBrush.drawTree(30, 50);
        for (Ufo o : ufo) {
            o.move();
            o.drawUfo(g);
        }
        for (Boat b : boat) {
            b.move();
            b.drawCar(g);
        }
        for (Plane p : plane) {
            p.move();
            p.drawPlane(g);
        }
        for (Car c : car) {
            c.move();
            c.drawCar(g);
        }

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