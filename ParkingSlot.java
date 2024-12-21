public class ParkingSlot {
    private final int slotNumber;
    private boolean isOccupied;

    // Constructor
    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;  // Initially, the slot is not occupied
    }

    // Assign a vehicle to the parking slot
    public void assignVehicle() {
        isOccupied = true;  // Mark the slot as occupied
    }

    // Release a vehicle from the parking slot
    public void releaseVehicle() {
        isOccupied = false;  // Mark the slot as available
    }

    // Get the status of the parking slot
    public String getSlotStatus() {
        return "Slot " + slotNumber + " is " + (isOccupied ? "Occupied" : "Available");
    }

    // Get the slot number
    public int getSlotNumber() {
        return slotNumber;
    }

    // Getter method to check if the slot is occupied
    public boolean isOccupied() {
        return isOccupied;
    }
}
