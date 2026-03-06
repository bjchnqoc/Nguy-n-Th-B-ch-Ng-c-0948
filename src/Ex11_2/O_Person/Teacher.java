package Ex11_2.O_Person;

import java.util.*;

public class Teacher extends Person {

     int numberOfClasses;
    double baseSalary;

    public Teacher() {

    }

    public Teacher(String id, String name, int yearOfBirth) {
        super(id, name, yearOfBirth);
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void displayDetails() {
        System.out.print("number of classes: " + getNumberOfClasses() + ", base salary: " + getBaseSalary());

    }

    @Override
    public void addPerson() {
        super.addPerson();
        System.out.print("number of classes: ");
        setNumberOfClasses(scanner.nextInt());
        scanner.nextLine();
        System.out.print("base salary: ");
        setBaseSalary(scanner.nextDouble());

    }

    @Override
    public void updatePerson() {
        System.out.print("number of classes: ");
        setNumberOfClasses(scanner.nextInt());
        System.out.print("base salary: ");
        setBaseSalary(scanner.nextDouble());
    }

}
