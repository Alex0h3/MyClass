import javax.swing.*;

class Swing {
    public static void main(String args[]) {
        JFrame window = new JFrame("Swing Alex");
        MyCanvas canvas = new MyCanvas();

        window.add(canvas);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(Config.WINDOW_W, Config.WINDOW_H);
        window.setVisible(true);
        // window.addKeyListener(canvaas);
    }
}
