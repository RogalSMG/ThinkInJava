package graphic;

import javax.swing.*;
import java.awt.*;

public class Drawing extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("For absent Grzechu: ");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Canvas canvas = new Drawing();
        canvas.setBackground(Color.GRAY);
        canvas.setSize(1000, 1000);

        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Rectangle rec = new Rectangle(400, 400, 200, 200);
        mickey(g, rec);
    }

    public void paintPipe(Graphics g) {
        int i = 90;
        while (i < getWidth()) {
            g.drawOval(0, 0, i, i);
            i += 3;
        }
    }

    public void boxOval(Graphics g, Rectangle rec) {
        g.fillOval(rec.x, rec.y, rec.width, rec.height);
    }

    public void mickey(Graphics g, Rectangle rec) {
        boxOval(g, rec);
        int hw = rec.width / 2;
        int hh = rec.height / 2;


        while (rec.width >= 3) {

            Rectangle half = new Rectangle(rec.x, rec.y, hw, hh);

            half.translate(-hw / 2, -hh / 2);
            boxOval(g, half);

            half.translate(hw * 2, 0);
            boxOval(g, half);

            mickey(g, half);
        }

    }
}
