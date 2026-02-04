package lec8_ObjectAndClass.ThisKeyword.ClassConstructor;

public class Student {

    int id;
    String name;

    Student() {
        System.out.println("default constructor is invoked");
    }

    Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(12345, "Anna");
        Student s2 = new Student(67890, "Elsa");
        s1.display();
        s2.display();

    }
}
