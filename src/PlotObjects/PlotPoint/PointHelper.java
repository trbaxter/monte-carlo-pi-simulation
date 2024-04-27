package PlotObjects.PlotPoint;

import java.util.ArrayList;

public class PointHelper {

    public int pointChecker(ArrayList<int[]> coords) {

        int insideCircle = 0;


        for (int i = 1; i < coords.size(); i++) {
            int[] indexPair = coords.get(i);

            int x = indexPair[0];
            int y = indexPair[1];

            double distanceFromCenter = (Math.sqrt(Math.pow((x - 75), 2) + Math.pow((y - 525), 2)));

            int circleRadius = 450;
            if (distanceFromCenter <= circleRadius) {
                insideCircle++;
            }
        }


        return insideCircle;
    }
}
