package Task2;
import java.util.ArrayList;

public class Building {

    ArrayList<String> Room = new ArrayList<String>();

    private int numberOfBathrooms;

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    private int numberOfFloors;

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    private boolean isOfficeBuilding;

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    public void setOfficeBuilding(boolean officeBuilding) {
        isOfficeBuilding = officeBuilding;
    }

    private final int rooms;

    public int getRooms() {
        return rooms;
    }

    public Building(int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding, int rooms) {

        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
        this.rooms = rooms;

    }
}
