package Lec11.Encapsulation.Final.FinalVariable;

public class Bike {

    // Biến final không cho phép thay đổi giá trị
    final int speedlimit = 90;

    void run() {

        // speedlimit = 400, gây lỗi
        System.out.println("Tốc độ hiện tại: " + speedlimit);
    }

    public static void main(String args[]) {
        Bike obj = new Bike();
        obj.run();
    }
}
