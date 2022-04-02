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
        int i = 90;
        while (i < getWidth()) {
            g.drawOval(0, 0, i, i);
            i += 5;
        }
    }


}
