/**
 * Created by ac003588 on 7/7/2017.
 */
public class Room {
     private Door theDoor;
     private Window theWindow;

    public Room(Door theDoor, Window theWindow) {
        this.theDoor = theDoor;
        this.theWindow = theWindow;
    }

    public void enterRoom() {
        getTheDoor().openDoor();
    }

    public void openWindow() {
        getTheWindow().openWindow();
    }

    private Door getTheDoor() {
        return theDoor;
    }

    private Window getTheWindow() {
        return theWindow;
    }
}
