package Lec11.Encapsulation.Static.StaticMethod;

public class Processor {
// cần static vì biến này được dùng trong hàm main (static)

    static int number = 40;//non static

    public static void main(String[] args) {
        System.out.println(number);
    }
}
