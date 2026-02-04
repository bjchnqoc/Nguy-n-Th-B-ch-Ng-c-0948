package Lec11.Encapsulation.Static.WithoutStaticVariable;

public class Person {

    private String name;
    private int count = 0; // Biến instance: mỗi đối tượng có một bản sao riêng

    public Person(String n) {
        name = n;
        count++; // Tăng count của riêng đối tượng đó
        System.out.println(count);
    }

    public static void main(String[] args) {
        // Mỗi đối tượng tạo ra sẽ in ra "1" vì count không dùng chung
        Person p1 = new Person("Trang");
        Person p2 = new Person("Duong");
        Person p3 = new Person("Luong");
    }
}
