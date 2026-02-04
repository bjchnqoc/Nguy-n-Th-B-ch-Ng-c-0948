package Lec11.Encapsulation.Static.StaticMethod;

class Student {

    int rollno;
    String name;
    static String college = "DTU"; // Biến static mặc định

    // Phương thức static để thay đổi giá trị biến static
    static void change() {
        college = "BBDIT";
    }

    // Constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    // Phương thức hiển thị dữ liệu
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        // Gọi phương thức static bằng tên lớp (className.methodName)
        Student.change();

        // Tạo các đối tượng Student
        Student s1 = new Student(111, "Trang");
        Student s2 = new Student(222, "Duong");

        s1.display(); // Output: 111 Trang BBDIT
        s2.display(); // Output: 222 Duong BBDIT
    }
}
