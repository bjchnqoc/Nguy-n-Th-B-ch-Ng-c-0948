package Lec9_InheritanceAndPolymorphism.Inheritance.Example;

public class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        System.out.println("cat's ID:" + cat.catID);
        cat.catchMouse();
    }

}
