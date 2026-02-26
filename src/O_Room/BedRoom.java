package O_Room;

import java.util.Scanner;

public class BedRoom extends Room {

    Scanner scanner = new Scanner(System.in);
    private int numberOfBeds;

    public BedRoom() {

    }

    public BedRoom(String id, String name, double baseCost) {
        super(id, name, baseCost);

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.print("number of beds: ");
        setNumberOfBeds(scanner.nextInt());
    }
    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.print("number of beds: ");
        setNumberOfBeds(scanner.nextInt());
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(", number of beds: " + getNumberOfBeds());
        
    }
    
}
