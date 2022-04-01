package graphic;

import javax.swing.*;
import java.awt.*;

public class JapanFlag extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ajaja");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Canvas canvas = new JapanFlag();
        canvas.setBackground(Color.GRAY);
        canvas.setSize(1000, 500);

        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Rectangle rec = contures();
        whiteBack(g, rec);
        redCircle(g, rec);
    }

    private void redCircle(Graphics g, Rectangle rec) {
        Rectangle cir = new Rectangle();
        cir.width = (int) (rec.width * 0.4);
        cir.height = (int) (rec.height * 0.35);
        cir.x = (int) (rec.width * ((1 - 0.4) / 2)) + rec.x;
        cir.y = (int) (rec.height * ((1 - 0.35) / 2)) + rec.y;

        g.setColor(Color.RED);
        g.fillOval(cir.x, cir.y, cir.width, cir.height);
    }

    public void whiteBack(Graphics g, Rectangle rec) {
        g.setColor(Color.WHITE);
        g.fillRect(rec.x, rec.y, rec.width, rec.height);
        g.setColor(Color.BLACK);
        g.drawRect(rec.x, rec.y, rec.width, rec.height);
    }

    public Rectangle contures() {
        Rectangle rec = new Rectangle();
        int higher = getWidth();
        if (getHeight() < getWidth()) {
            higher = getHeight();
        }
        rec.x = (int) (higher * 0.1);
        rec.y = (int) (higher * 0.1);
        rec.width = higher - 2 * rec.x;
        rec.height = higher - 2 * rec.y;
        return rec;
    }
}
