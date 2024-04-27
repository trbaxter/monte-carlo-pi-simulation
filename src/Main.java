import PlotObjects.Frame.FrameConfig;
import PlotObjects.Frame.FramePainter;

public class Main {


    public static void main(String[] args) {
        SimSetup simSetup = new SimSetup();
        simSetup.simSetup();
        FrameConfig frame = new FrameConfig();
        FramePainter d = new FramePainter();
        frame.add(d);
        frame.setVisible(true);
    }
}
