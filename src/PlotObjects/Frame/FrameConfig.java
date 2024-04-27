package PlotObjects.Frame;

import javax.swing.*;
import java.awt.*;

public class FrameConfig extends JFrame {
    public FrameConfig() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setTitle("Monte Carlo Method of Approximating π");
        setSize(616, 639);
        setResizable(false);
        setLayout(new GridLayout());
        setLocationRelativeTo(null);
    }
}
