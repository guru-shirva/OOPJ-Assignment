# Parking Management System

## Step 1: Software Requirements
This project is developed using Java and requires the following software and tools:
1. **Java Development Kit (JDK)** - Version 8 or above
2. **Integrated Development Environment (IDE)** - IntelliJ IDEA, Eclipse, or NetBeans
3. **Build Tool** - Maven or Gradle (optional)
4. **Operating System** - Windows, macOS, or Linux
5. **Version Control System** - Git (optional)

---

## Step 2: List of Classes and Interfaces

### 1. **Vehicle**
- **Attributes**:
  - `vehicleType` (String): Type of the vehicle (e.g., Car, Bike).
  - `licensePlate` (String): License plate of the vehicle.
- **Methods**:
  - `Vehicle(String vehicleType, String licensePlate)`: Constructor to initialize vehicle attributes.
  - `getVehicleDetails()`: Returns vehicle details as a string.
  - `getParkingFee()`: Returns the parking fee (default is 20.0).

---

### 2. **Payment**
- **Attributes**:
  - `fee` (double): Fee for the parking.
  - `paymentStatus` (String): Status of the payment (e.g., Pending, Completed).
- **Methods**:
  - `Payment(double fee, String paymentStatus)`: Constructor to initialize payment attributes.
  - `processPayment()`: Processes the payment and updates the status.
  - `generateReceipt()`: Generates and displays a receipt for the payment.
  - `printPaymentStatus()`: Prints the current payment status.

---

### 3. **ParkingSlot**
- **Attributes**:
  - `slotNumber` (int): Unique identifier for the parking slot.
  - `isOccupied` (boolean): Indicates whether the slot is occupied.
- **Methods**:
  - `ParkingSlot(int slotNumber)`: Constructor to initialize the parking slot.
  - `assignVehicle()`: Marks the slot as occupied.
  - `releaseVehicle()`: Marks the slot as available.
  - `getSlotStatus()`: Returns the status of the parking slot as a string.
  - `getSlotNumber()`: Returns the slot number.
  - `isOccupied()`: Checks if the slot is occupied.

---

### 4. **ParkingLot**
- **Attributes**:
  - `slots` (List<ParkingSlot>): List of parking slots in the parking lot.
- **Methods**:
  - `ParkingLot()`: Constructor to initialize the parking lot.
  - `addSlot(ParkingSlot slot)`: Adds a new slot to the parking lot.
  - `assignSlotToVehicle(ParkingSlot slot, Vehicle vehicle)`: Assigns a slot to a vehicle if available.
  - `releaseSlot(ParkingSlot slot)`: Releases the vehicle from the slot.

---

### 5. **ParkingManagementSystem**
- **Attributes**:
  - `parkingLot` (ParkingLot): Instance of the parking lot.
  - `vehicles` (List<Vehicle>): List of vehicles in the system.
- **Methods**:
  - `ParkingManagementSystem()`: Constructor to initialize the parking management system.
  - `getParkingLot()`: Returns the parking lot instance.
  - `addVehicle(Vehicle vehicle)`: Adds a new vehicle to the system.
  - `assignParkingSlot(ParkingSlot slot, Vehicle vehicle)`: Assigns a parking slot to a vehicle.
  - `processPayment(Payment payment)`: Processes the payment for parking.

---

### 6. **TestClass**
- **Purpose**: Demonstrates the functionality of the Parking Management System.
- **Methods**:
  - `main(String[] args)`: Main method to create objects, assign parking slots, and process payments.

---

