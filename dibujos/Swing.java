import javax.swing.*;

class Swing {
    public static void main(String args[]) {
        JFrame window = new JFrame("Swing Alex");
        Mycanvaass Mycanvaass = new Mycanvaass();

        window.add(Mycanvaass);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(300, 400);
        window.setVisible(true);
        window.addKeyListener(Mycanvaass);

    }
}