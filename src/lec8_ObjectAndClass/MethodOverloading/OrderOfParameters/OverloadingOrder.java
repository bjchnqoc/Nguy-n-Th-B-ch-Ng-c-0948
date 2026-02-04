package lec8_ObjectAndClass.MethodOverloading.OrderOfParameters;

public class OverloadingOrder {
// Đây là phương thức bạn đang gọi trong hàm main
    public static void printlnfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
// Nạp chồng (Overloading): Cùng tên nhưng đổi thứ tự hoặc kiểu dữ liệu5
    public static void printlnfo(int age, String name) {
        System.out.println("Age: " + age + ",Name: " + name);
    }

}
