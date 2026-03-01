package O_vehicle;

import java.util.Scanner;

public abstract class Vehicle implements IVehicle {

    private String id;
    private String brand;
    private String model;
    private int rentalDays; //ngay thue
    private double rentalPricePerDay;

    public Vehicle() {

    }

    public Vehicle(String id, String brand, String model, int rentalDays, double rentalPricePerDay) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rentalDays = rentalDays;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getRentalPricePerDay() { //gia thue moi ngay
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void addVehicle() {
        System.out.print("id: ");
        setId(sc.nextLine());
        System.out.print("brand: ");
        setBrand(sc.nextLine());
        System.out.print("model: ");
        setModel(sc.nextLine());
        System.out.print("Ngay cho thue: ");
        setRentalDays(sc.nextInt());
        System.out.print("Gia cho thue moi ngay: ");
        setRentalPricePerDay(sc.nextDouble());
    }

    @Override
    public void updateVehicle() {
        System.out.print("brand: ");
        setBrand(sc.nextLine());
        System.out.print("model: ");
        setModel(sc.nextLine());
        System.out.print("Ngay cho thue: ");
        setRentalDays(sc.nextInt());
        System.out.print("Gia cho thue moi ngay: ");
        setRentalPricePerDay(sc.nextDouble());

    }

    @Override
    public void displayDetails() {
        System.out.print("id: " + getId() + ", brand: " + getBrand() + ", model: " + getModel() + ", rentalDays: " + getRentalDays() + ", rentalPricePerDay: " + getRentalPricePerDay());

    }

}
