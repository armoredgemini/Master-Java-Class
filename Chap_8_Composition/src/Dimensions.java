/**
 * Created by Antonio on 5/21/2017.
 */
public class Dimensions {
    int x;
    int y;
    int z;

    public Dimensions(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setDimensions(int width, int height, int depth) {
        x=width;
        y=height;
        z=depth;
        System.out.println("Window sixe is" + x + " X " + y + " X " + z);
    }

}
