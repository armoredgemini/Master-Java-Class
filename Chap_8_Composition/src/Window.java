/**
 * Created by Antonio on 5/21/2017.
 */
public class Window {
    public boolean isInside;
    private boolean sensor;
    private boolean isActiveSensor;
    private int screens;
    private Dimensions dimensions;

    public Window(boolean isInside, boolean sensor, boolean isActiveSensor, int screens, Dimensions dimensions) {
        this.isInside = isInside;
        this.sensor = sensor;
        this.isActiveSensor = isActiveSensor;
        this.screens = screens;
        this.dimensions = dimensions;
    }

    public void openWindow() {
        if (isInside) {
            isActiveSensor = false;
            System.out.println("Window has been opened, sensor disabled");
        }
    }
}
