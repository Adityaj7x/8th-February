package jaxb.VehicleDekho;

public class DisplayVehicleDetails {
    public static void displayVehicleDetails(Vehicle vehicle) {
        System.out.println("Name " + vehicle.getBrand() + " " + vehicle.getName());
        // System.out.println("Salary "+vehicle.getSalary());
    }
}