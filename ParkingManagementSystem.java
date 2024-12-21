import java.util.ArrayList;
import java.util.List;

public class ParkingManagementSystem {
    private final ParkingLot parkingLot;  // Make it private for encapsulation
    private final List<Vehicle> vehicles;

    // Constructor
    public ParkingManagementSystem() {
        parkingLot = new ParkingLot();
        vehicles = new ArrayList<>();
    }

    // Getter for parkingLot (instead of direct access)
    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    // Add a vehicle to the system
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle.getVehicleDetails() + " added.");
    }

    // Assign a parking slot to a vehicle
    public void assignParkingSlot(ParkingSlot slot, Vehicle vehicle) {
        parkingLot.assignSlotToVehicle(slot, vehicle);
    }

    // Process payment for parking
    public void processPayment(Payment payment) {
        payment.processPayment();
        payment.generateReceipt();
    }
}
