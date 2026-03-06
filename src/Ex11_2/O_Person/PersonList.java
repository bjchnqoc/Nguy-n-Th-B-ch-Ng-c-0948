package Ex11_2.O_Person;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        person.addPerson();// Gọi phương thức nhập liệu của đối tượng
        personList.add(person);
        System.out.print("added");
    }

    public void updatePersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                person.updatePerson();
                return;
            }
        }
        System.out.println("Không tìm thấy nguoi có ID: " + id);
    }

    // 3. Delete Person by ID: boolean
    public boolean deletePersonById(String id) {
        Person person = findPersonById(id);
        if (person != null) {
            personList.remove(person);
            return true;
        }
        return false;
    }

    // 4. Find Person by ID: Person
    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.id.equals(id)) {
                return person;
            }
        }
        return null;
    }

    // 5. Display All Persons: void
    public void displayAllPersons() {
        if (personList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            for (Person person : personList) {
                person.displayDetails();
            }
        }
    }

    public Student findStudentWithMaxGPA() {
        Student maxStudent = null;
        for (Person p : personList) {
            if (p instanceof Student) {
                Student s = (Student) p; // Ép kiểu về Student
                if (maxStudent == null || s.getGpa() > maxStudent.getGpa()) {
                    maxStudent = s;
                }
            }
        }
        return maxStudent;
    }

    public Teacher findTeacherWithMaxSalary() {
        Teacher maxTeacher = null;
        for (Person p : personList) {
            if (p instanceof Teacher) {
                Teacher t = (Teacher) p; // Ép kiểu về Teacher
                // Giả sử Teacher có hàm calculateSalary()
                if (maxTeacher == null || t.getBaseSalary() > maxTeacher.getBaseSalary()) {
                    maxTeacher = t;
                }
            }

        }
        return maxTeacher;
    }

}
