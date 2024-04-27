package PlotObjects.PlotPoint;

public class CreatePoint {

    private final int x = setRandomCoord();
    private final int y = setRandomCoord();

    private int setRandomCoord() {
        return 75 + (int) (Math.random() * (451));
    }

    public int getXPoint() {
        return x;
    }

    public int getYPoint() {
        return y;
    }


    // 75 is minimum x & y value in plot window
    // 525 is maximum
    // 451 is the range => max - min + 1


}
