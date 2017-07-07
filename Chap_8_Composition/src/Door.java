/**
 * Created by Antonio on 5/21/2017.
 */
public class Door {
    public String type;
    public boolean sensor;
    public boolean isActiveSensor;
    public boolean isOpen;
    public boolean isLocked;
    private Dimensions dimensions;

    public Door(String type, boolean sensor, boolean isActiveSensor, boolean isOpen, boolean isLocked, Dimensions dimensions) {
        this.type = type;
        this.sensor = sensor;
        this.isActiveSensor = isActiveSensor;
        this.isOpen = isOpen;
        this.isLocked = isLocked;
        this.dimensions = dimensions;
    }

    public void openDoor() {
        if (isLocked) {
            System.out.println("Door is Locked, you must unlock the door");
        } else if (isOpen) {
            System.out.println("Door is already open");
        } else {
            isActiveSensor = false;
            System.out.println("Door is Opened, sensor disabled");
        }
    }

    public void closeDoor() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Door Closed");
        }
    }

    public void lockDoor() {
        if (!isLocked) {
            if (isOpen) {
                System.out.println("Cannot lock, door is open");
            } else {
                isLocked = true;

                System.out.println("Door has been locked");
            }
        }
    }

    public void unlockDoor() {
        if (isLocked){
            isLocked=false;
            System.out.println("Door has been unlocked");
        }
    }

    public String getType() {
        return type;
    }

    public boolean isSensor() {
        return sensor;
    }

    public boolean isActiveSensor() {
        return isActiveSensor;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
