/**
 * Created by Antonio on 5/20/2017.
 */
public class Main {
// room challenge
    //pseudo <code></code>
    // A room has Windows, Doors, Furniture
    // Furniture can be a class, but it is pretty broad, maybe Chairs, Tables as Separate classses
    // Doors can be a class
    // Getters can be open for doors and windows, chairs can be 'recline' if reclinable

    public static void main(String[] args) {
        Dimensions windowDimensions = new Dimensions(32, 24, 3);
        Window window = new Window(true, true, true, 1, windowDimensions);
        window.openWindow();

        Dimensions doorDimensions = new Dimensions(32,80,2);
        Door door = new Door("standard",true,true,true,false,doorDimensions);
        door.openDoor();
        door.closeDoor();
        door.lockDoor();
        door.openDoor();
        door.unlockDoor();
        door.openDoor();
        System.out.println("Door type is " + door.getType());
    }
}