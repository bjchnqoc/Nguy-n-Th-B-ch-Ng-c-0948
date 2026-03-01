package O_vehicle;

import java.util.*;

public class Truck extends Vehicle {

    private double loadCapacity;
    private double distance;

    public Truck() {
        super();
    }

    public Truck(int numberOfSeats, String fuelType, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
        this.distance = distance;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("load capacity: ");
        setLoadCapacity(scanner.nextDouble());
        System.out.print("distance: ");
        setDistance(sc.nextDouble());

    }
    

    public void updateVehicle(String id) {
        if (getId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateVehicle();
            System.out.print("load capacity: ");
            setLoadCapacity(scanner.nextDouble());
            System.out.print("fuel type: ");
            setDistance(sc.nextDouble());
            System.out.println("update successfully");

        } else {
            System.out.println("not found id:" + id);
        }

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", load capacity: " + getLoadCapacity());

    }
}
