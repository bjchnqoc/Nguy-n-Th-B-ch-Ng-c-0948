package Lec11.Encapsulation.AccesModifier.Test1.Rule2;

public class Processor {

    public static void main(String[] args) {
        // Chạy class cha
        AccessModifier1 obj1 = new AccessModifier1();
        obj1.display();

        System.out.println();

        // Chạy  class con
        AccessModifier2 obj2 = new AccessModifier2();
        obj2.display();
    }
}
