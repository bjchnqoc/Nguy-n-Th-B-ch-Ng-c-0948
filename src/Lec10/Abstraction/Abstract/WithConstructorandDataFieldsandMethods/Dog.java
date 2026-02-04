package Lec10.Abstraction.Abstract.WithConstructorandDataFieldsandMethods;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);

    }

    @Override
    public void makeSound() {
        System.out.println("Gau Gau");
    }

}
