import javax.swing.*;
import java.awt.Color;

class Swing01 {
    public static void main(String args[]) {
        JFrame window = new JFrame("Swing Alex");
        Mycamvaass camvaass = new Mycamvaass();

        window.add(camvaass);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300, 400);
        window.setVisible(true);
    }
}