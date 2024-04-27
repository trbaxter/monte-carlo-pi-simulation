package PlotObjects.Border;

import java.awt.*;

public class FrameBorder {

    public void paintBorder(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));


        g2d.drawLine(74, 74, 526, 74); // top border
        g2d.drawLine(74, 74, 74, 526);  // left border
        g2d.drawLine(74, 526, 526, 526);  // bottom border
        g2d.drawLine(526, 74, 526, 526);  // right border
    }

}
