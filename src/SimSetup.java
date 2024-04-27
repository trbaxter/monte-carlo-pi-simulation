import PlotObjects.Frame.FramePainter;
import PlotObjects.Title.Title;

public class SimSetup {

    private final Title title = new Title();
    private final UserInput userInput = new UserInput();

    public void simSetup() {
        title.displayTitle();
        userInput.setPoints();
        FramePainter.setPoints(userInput.getPoints());
    }
}
