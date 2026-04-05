// Parent class
class Vehicle {

    protected String vehicleNumber;
    protected String brand;
    protected double rentPerDay;

    // Constructor
    public Vehicle(String vehicleNumber, String brand, double rentPerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
    }

    // Method to calculate rent (will be overridden)
    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    // Common display method
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Rent per Day: ₹" + rentPerDay);
    }
}

// Child class - Car
class Car extends Vehicle {

    public Car(String vehicleNumber, String brand) {
        super(vehicleNumber, brand, 1500);
    }

    // Overriding method
    @Override
    public double calculateRent(int days) {
        double serviceCharge = 500;
        return (rentPerDay * days) + serviceCharge;
    }
}

// Child class - Bike
class Bike extends Vehicle {

    public Bike(String vehicleNumber, String brand) {
        super(vehicleNumber, brand, 500);
    }

    // Overriding method
    @Override
    public double calculateRent(int days) {
        return rentPerDay * days;
    }
}

// Main class
public class VehicleRentalSystem {

    public static void main(String[] args) {

        // Runtime Polymorphism
        Vehicle car = new Car("MH12AB1234", "Honda City");
        Vehicle bike = new Bike("MH14XY5678", "Yamaha R15");

        System.out.println("----- CAR DETAILS -----");
        car.displayDetails();
        System.out.println("Total Rent for 3 days: ₹" + car.calculateRent(3));

        System.out.println();

        System.out.println("----- BIKE DETAILS -----");
        bike.displayDetails();
        System.out.println("Total Rent for 3 days: ₹" + bike.calculateRent(3));
    }
}
