package Lec10.Abstraction.Abstract.AbstractMethod;

public class Processor {

    public static void main(String[] args) {
        Square square = new Square(3);
        System.out.println("Area of the square: " + square.calculateArea());
    }
}
