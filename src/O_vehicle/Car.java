package O_vehicle;

import java.util.Scanner;

public class Car extends Vehicle {

//    Scanner scanner = new Scanner(System.in);
    private int numberOfSeats;
    private String fuelType;

    public Car() {
        super();

    }

    public Car(int numberOfSeats, String fuelType, String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        super(id, brand, model, rentalDays, rentalPricePerDay);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void addVehicle() {
        super.addVehicle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of Seats: ");
        setNumberOfSeats(scanner.nextInt());
        System.out.print("fuel type: ");
        setFuelType(sc.nextLine());

    }

    public void updateVehicle(String id) {
        if (getId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            super.updateVehicle();
            System.out.print("number of Seats: ");
            setNumberOfSeats(scanner.nextInt());
            System.out.print("fuel type: ");
            setFuelType(sc.nextLine());
            System.out.println("update successfully");

        } else {
            System.out.println("not found id:" + id);
        }

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", number of Seats: " + getNumberOfSeats());

    }
}
