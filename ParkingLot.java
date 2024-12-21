import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<ParkingSlot> slots;

    // Constructor
    public ParkingLot() {
        slots = new ArrayList<>();
    }

    // Add a parking slot to the parking lot
    public void addSlot(ParkingSlot slot) {
        slots.add(slot);
    }

    // Assign a parking slot to a vehicle
    public void assignSlotToVehicle(ParkingSlot slot, Vehicle vehicle) {
        if (!slot.isOccupied()) {  // Use getter method for checking occupancy
            slot.assignVehicle();  // Assign vehicle to the slot
            System.out.println(vehicle.getVehicleDetails() + " assigned to " + slot.getSlotStatus());
        } else {
            System.out.println("Slot " + slot.getSlotNumber() + " is already occupied.");
        }
    }

    // Release a parking slot
    public void releaseSlot(ParkingSlot slot) {
        slot.releaseVehicle();  // Release the vehicle from the slot
        System.out.println("Slot " + slot.getSlotNumber() + " is now available.");
    }
}
