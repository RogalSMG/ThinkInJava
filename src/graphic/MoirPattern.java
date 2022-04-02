package graphic;

import javax.swing.*;
import java.awt.*;

public class MoirPattern extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Canvas canvas = new MoirPattern();
        canvas.setBackground(Color.lightGray);
        canvas.setSize(1000,1000);

        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Rectangle rec = new Rectangle();
        moirC5(g, rec);
    }

    public void moirC5(Graphics g, Rectangle rec) {
        int[] xses = {5,10,200};
        int[] yses = {50,100,200};
       g.drawPolygon(xses,yses,xses.length);
    }


    /**
     * This method is drawing concentric circles, is limited by resolution of window.
     * <p>
     * Distance between circles is determined by param gap.
     *
     * @param g graphic obj
     * @param rec rectangle obj
     * @param gap size between each circle
     */
    public void concentricCircles(Graphics g, Rectangle rec, int gap, int size) {
        int i = gap;
        int frameMiddle = findHigherDimension();
        while (i < size) {
            rec.setBounds(frameMiddle / 2 - i / 2, frameMiddle / 2 - i / 2, i, i);
            drawOval(g, rec);
            i += gap;
        }

        /*
        to test

         concentricCircles(g,rec,10,500);
        g.setColor(Color.GREEN);
        concentricCircles(g,rec,25,800);
         */
    }

    public void drawOval(Graphics g, Rectangle rec) {
        g.drawOval(rec.x, rec.y, rec.width, rec.height);
    }

    /**
     *
     * @return int
     */
    public int findHigherDimension() {
        int higher = getWidth();
        if (getHeight() < getWidth()) {
            higher = getHeight();
        }
        return higher;
    }

    public void moirBase(Graphics g) {
        int i = 90;
        while (i < getWidth()) {
            g.drawOval(0, 0, i, i);
            i += 4;
        }
    }
}
