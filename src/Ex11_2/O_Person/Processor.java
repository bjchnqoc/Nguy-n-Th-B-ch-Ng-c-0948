package Ex11_2.O_Person;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList list = new PersonList();
        while (true) {
            System.out.println("0.Thoat"
                    + "\n1. add a new student "
                    + "\n2. add a new teacher "
                    + "\n3. update person by id "
                    + "\n4. delete person by id "
                    + "\n5. find person by id "
                    + "\n6. display all persons ");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) { // vòng lặp vô hạn

                case 0:
                    System.out.println(" Exit Program");
                    sc.close();
                    return;
                case 1:
                    Student student = new Student();
                    list.addPerson(student);
                    break;
                case 2:
                    Teacher teacher = new Teacher();
                    list.addPerson(teacher);
                    break;
                case 3:
                    System.out.print(" enter id to update person: ");
                    String updateId = sc.nextLine();
                    list.updatePersonById(sc.nextLine());
                case 4:
                    sc.nextLine();
                    System.out.print("Enter id to delete person by id: ");
                    list.deletePersonById(sc.nextLine());
                    System.out.println("Success");
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Enter id to find person by id: ");
                    list.findPersonById(sc.nextLine());
                    System.out.println("Success");
                    break;

                case 6:
                    System.out.println("All persons: ");
                    list.displayAllPersons();
                    break;
                case 7:
                    Student topS = list.findStudentWithMaxGPA();
                    if (topS != null) {
                        System.out.println(" student with max gpa: ");
                        topS.displayDetails();
                    } else {
                        System.out.println("don't have any student in list.");
                    }
                    break;

                case 8:
                    Teacher topT = list.findTeacherWithMaxSalary();
                    if (topT != null) {
                        System.out.println("teacher with max salary: ");
                        topT.displayDetails();
                    } else {
                        System.out.println("don't have any teacher in list.");
                    }
                    break;
            }

        }

    }

}
