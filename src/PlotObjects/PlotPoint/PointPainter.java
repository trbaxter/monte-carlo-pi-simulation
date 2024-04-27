package PlotObjects.PlotPoint;

import java.awt.*;
import java.util.ArrayList;

public class PointPainter {


    private final ArrayList<int[]> coords = new ArrayList<>();
    private int x;
    private int y;

    public void storePointCoordinates(CreatePoint newPoint) {
        this.x = newPoint.getXPoint();
        this.y = newPoint.getYPoint();

        coords.add(new int[]{this.x, this.y});
    }

    public ArrayList<int[]> getPointCoordinates() {
        return coords;
    }

    public void paintPoint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        double distanceFromCenter = (Math.sqrt(Math.pow((x - 75), 2) + Math.pow((y - 525), 2)));

        int[] lastPair = coords.getLast();
        int x = lastPair[0];
        int y = lastPair[1];

        g2d.setStroke(new BasicStroke(3));
        if (distanceFromCenter <= 450) {
            g2d.setColor(Color.GREEN);

        } else {
            g2d.setColor(Color.RED);
        }
        g2d.drawOval(x, y, 2, 2);
        g2d.drawOval(x, y, 2, 2);
    }
}
