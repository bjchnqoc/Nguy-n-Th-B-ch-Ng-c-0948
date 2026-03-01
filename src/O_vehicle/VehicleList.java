package O_vehicle;

import java.util.ArrayList;

public class VehicleList {

    private ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicle.addVehicle();
        vehicleList.add(vehicle);
        System.out.println("da them");
    }

    public void updateVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                vehicle.updateVehicle();
                return;
            }
        }
        System.out.println("Không tìm thấy xe có ID: " + id);
    }

    public void deleteVehicleById(String id) {
        //boolean removed=bookList.removeIf(book -> book.getBookId().equals(id));
        for (Vehicle object : vehicleList) {
            if (id.equals(object.getId())) {
                vehicleList.remove(object);
                System.out.println("da xoa ID: " + id);
            } else {
                System.out.println("khong tim thay ID: " + id);
            }
        }
    }

    public Vehicle findVehicleById(String id) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getId().equals(id)) {
                return vehicle;
            }
        }
        System.out.println("khong tim thay ID: " + id);

        return null;
    }

    public void displayAllVehicles() {
        if (vehicleList.isEmpty()) {
            System.out.println("Empty");
        } else {

            for (Vehicle vehicle : vehicleList) {
                vehicle.displayDetails();
            }
        }
    }
}
