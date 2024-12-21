public class Vehicle {
    private final String vehicleType;
    private final String licensePlate;

    public Vehicle(String vehicleType, String licensePlate) {
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
    }

    public String getVehicleDetails() {
        return "Vehicle Type: " + vehicleType + ", License Plate: " + licensePlate;
    }

    public double getParkingFee() {
        // Basic fee calculation can be extended
        return 20.0;
    }
}
