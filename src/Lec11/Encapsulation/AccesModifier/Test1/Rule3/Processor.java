package Lec11.Encapsulation.AccesModifier.Test1.Rule3;

public class Processor {

    public static void main(String[] args) {
        // Chạy thử class 1
        AccessModifier1 obj1 = new AccessModifier1();
        obj1.display();

        // Chạy thử class 2
        AccessModidier2 obj2 = new AccessModidier2();
        obj2.display();
    }
}
