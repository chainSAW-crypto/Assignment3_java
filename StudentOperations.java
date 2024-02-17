import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentOperations {
    private List<Student> students;

    public StudentOperations() {
        students = new ArrayList<>();
    }

    // Method to add a new student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // Method to display all students
    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Method to search a student by PRN
    public Student searchByPrn(String prn) {
        for (Student student : students) {
            if (student.getPrn().equals(prn)) {
                return student;
            }
        }
        return null;
    }

    // Method to search students by name (can be multiple students with the same name)
    public List<Student> searchByName(String name) {
        List<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                foundStudents.add(student);
            }
        }
        return foundStudents;
    }

    // Method to update a student's details by PRN
    public boolean updateStudentByPrn(String prn, Student newStudentDetails) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPrn().equals(prn)) {
                students.set(i, newStudentDetails);
                return true;
            }
        }
        return false;
    }

    // Method to delete a student by PRN
    public boolean deleteStudentByPrn(String prn) {
        return students.removeIf(student -> student.getPrn().equals(prn));
    }
}

