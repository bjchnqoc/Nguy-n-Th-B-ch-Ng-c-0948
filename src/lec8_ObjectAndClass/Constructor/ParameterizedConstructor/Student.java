package lec8_ObjectAndClass.Constructor.ParameterizedConstructor;

public class Student {

    int id;
    String name;

    Student(int i, String n) {
        id = i;
        name = n;

    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(12345, "Anna");
        Student s2 = new Student(67890, "Andrew");
        s1.display();
        s2.display();
    }
}
