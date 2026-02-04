
package Lec9_InheritanceAndPolymorphism.SuperVarible;


public class HuskyIV extends DogIV {
    int price = 1500;
    void displayPrice(){
        System.out.println("Dog's price: "+super.price);
        System.out.println("Husky's price: "+price);
    }
}
