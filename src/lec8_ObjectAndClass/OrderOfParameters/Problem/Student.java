package lec8_ObjectAndClass.OrderOfParameters.Problem;

public class Student {

    int id;
    String name;

    Student(int id, String name) {
        id = id;
        name = name;
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
