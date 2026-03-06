package Ex11_2.O_Person;

import java.util.*;

public abstract class Person implements IPerson {

    Scanner scanner = new Scanner(System.in);

//    
    String id;
    String name;
    int yearOfBirth;

    public Person() {

    }

    public Person(String id, String name, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public void displayDetails() {
        System.out.print("id: " + getId() + ", name: " + getName() + ",yearOfBirth: " + getYearOfBirth());

    }

    @Override
    public void addPerson() {

        System.out.print("id: ");
        setId(scanner.nextLine());
        System.out.print("name: ");
        setName(scanner.nextLine());
        System.out.print("year of birth: ");
        setYearOfBirth(scanner.nextInt());
    }

    @Override
    public void updatePerson() {
        System.out.print("name: ");
        setName(scanner.nextLine());
        System.out.print("year of birth: ");
        setYearOfBirth(scanner.nextInt());
    }

}
