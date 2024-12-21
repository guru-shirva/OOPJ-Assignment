public class TestClass {
    public static void main(String[] args) {
        ParkingManagementSystem system = new ParkingManagementSystem();

        // Create vehicles
        Vehicle vehicle1 = new Vehicle("Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Bike", "XYZ789");

        // Add vehicles to the system
        system.addVehicle(vehicle1);
        system.addVehicle(vehicle2);

        // Create parking slots
        ParkingSlot slot1 = new ParkingSlot(1);
        ParkingSlot slot2 = new ParkingSlot(2);

        // Add slots to the parking lot
        system.getParkingLot().addSlot(slot1);  // Use getter to access parkingLot
        system.getParkingLot().addSlot(slot2);

        // Assign parking slots to vehicles
        system.assignParkingSlot(slot1, vehicle1);
        system.assignParkingSlot(slot2, vehicle2);

        // Process payment
        Payment payment = new Payment(20.0,"Cash");
        system.processPayment(payment);
    }
}
