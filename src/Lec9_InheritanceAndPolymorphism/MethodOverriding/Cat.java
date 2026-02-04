package Lec9_InheritanceAndPolymorphism.MethodOverriding;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meows Meows");
    }

}
