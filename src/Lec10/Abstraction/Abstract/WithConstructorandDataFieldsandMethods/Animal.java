package Lec10.Abstraction.Abstract.WithConstructorandDataFieldsandMethods;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("name: " + name);
    }

    public abstract void makeSound();

}
