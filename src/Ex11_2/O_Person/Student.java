package Ex11_2.O_Person;

import java.util.*;

public class Student extends Person {

    Scanner sc = new Scanner(System.in);
    private double gpa;
    private double tuitionFee;

    public Student() {
    }

    public Student(String id, String name, int yearOfBirth) {
        super(id, name, yearOfBirth);

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails() {
        System.out.print("gpa: " + getGpa() + ", tuitionFee: " + getTuitionFee());
    }

    @Override
    public void addPerson() {
        System.out.print("gpa: ");
        setGpa(scanner.nextDouble());
        System.out.print("tuitionFee: ");
        setTuitionFee(scanner.nextDouble());
    }

    @Override
    public void updatePerson() {
        System.out.print("gpa: ");
        setGpa(scanner.nextDouble());
        System.out.print("tuitionFee: ");
        setTuitionFee(scanner.nextDouble());
    }

}
