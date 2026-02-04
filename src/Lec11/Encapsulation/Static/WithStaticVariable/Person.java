package Lec11.Encapsulation.Static.WithStaticVariable;

public class Person {

    private String name;
    private static int count = 0; // Biến static dùng chung

    public Person(String n) {
        name = n;
        count++; 
        System.out.println(count);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Trang");
        Person p2 = new Person("Duong");
        Person p3 = new Person("Luong");
    }
}
