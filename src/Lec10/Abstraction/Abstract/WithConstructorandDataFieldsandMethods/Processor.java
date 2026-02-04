package Lec10.Abstraction.Abstract.WithConstructorandDataFieldsandMethods;

public class Processor {

    public static void main(String[] args) {
        Dog dog = new Dog("Kiki");
        dog.displayName();
        dog.makeSound();
    }

}
