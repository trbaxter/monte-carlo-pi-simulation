package PlotObjects.Frame;

import PlotObjects.Border.FrameBorder;
import PlotObjects.PlotPoint.CreatePoint;
import PlotObjects.PlotPoint.PointHelper;
import PlotObjects.PlotPoint.PointPainter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FramePainter extends JPanel implements ActionListener {


    private static int points;
    int count = 0;
    Timer t = new Timer(1, this);
    FrameBorder frameBorder = new FrameBorder();
    PointPainter pointPainter = new PointPainter();
    PointHelper pointHelper = new PointHelper();


    public FramePainter() {
        t.start();
    }

    public static void setPoints(int numPoints) {
        points = numPoints;
    }

    public void actionPerformed(ActionEvent e) {

        if (count == points) {
            repaint();
            t.stop();
            int inner = pointHelper.pointChecker(pointPainter.getPointCoordinates());
            int outer = (points - 1) - (inner);
            int total = inner + outer;

            double estimate = 4 * ((double) inner / (double) (total));
            DecimalFormat df = new DecimalFormat("#.#######");
            String formattedEstimate = df.format(estimate);

            System.out.println(STR."\nPoints inside the circle: \{inner}");
            System.out.println(STR."Points outside the circle: \{outer}");
            System.out.println(STR."\nApproximation for pi: \{formattedEstimate}");
        }

        if (count < points) {
            CreatePoint newPoint = new CreatePoint();
            pointPainter.storePointCoordinates(newPoint);


            repaint();
            count++;
        }
    }


    public void paintComponent(Graphics g) {

        if (t.isRunning()) {
            frameBorder.paintBorder(g);
            pointPainter.paintPoint(g);
        }
    }
}
