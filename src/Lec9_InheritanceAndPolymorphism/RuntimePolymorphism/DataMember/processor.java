package Lec9_InheritanceAndPolymorphism.RuntimePolymorphism.DataMember;

public class processor {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        System.out.println("Source: " + animal.source);
    }
}
