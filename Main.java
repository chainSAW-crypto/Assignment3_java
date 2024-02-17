// Tanay Kende
// 22070126092
// AIML-B

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Display program information
        System.out.println("Name: [Your Name Here]");
        System.out.println("PRN: [Your PRN Here]");
        System.out.println("Batch: [Your Batch Here]");

        StudentOperations operations = new StudentOperations();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("0. Exit");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by PRN");
            System.out.println("4. Search by Name");
            System.out.println("5. Update Student Details");
            System.out.println("6. Delete Student");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 0) {
                System.out.println("Exiting program.");
                break; // Exit the loop, thus ending the program
            }

            switch (choice) {
                case 1:
                    // Add student logic
                    System.out.println("Enter PRN, Name, Date of Birth (dd/MM/yyyy), Marks:");
                    String prn = scanner.nextLine();
                    String name = scanner.nextLine();
                    String dob = scanner.nextLine();
                    double marks = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    operations.addStudent(new Student(prn, name, dob, marks));
                    break;
                case 2:
                    // Display all students logic
                    operations.displayStudents();
                    break;
                case 3:
                    // Search by PRN logic
                    System.out.print("Enter PRN to search: ");
                    prn = scanner.nextLine();
                    Student student = operations.searchByPrn(prn);
                    if (student != null) {
                        System.out.println("Found: " + student);
                    } else {
                        System.out.println("No student found with PRN: " + prn);
                    }
                    break;
                case 4:
                    // Search by Name logic
                    System.out.print("Enter Name to search: ");
                    name = scanner.nextLine();
                    List<Student> students = operations.searchByName(name);
                    if (!students.isEmpty()) {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    } else {
                        System.out.println("No students found with name: " + name);
                    }
                    break;
                case 5:
                    // Update Student Details logic
                    System.out.print("Enter PRN of student to update: ");
                    prn = scanner.nextLine();
                    System.out.println("Enter new Name, Date of Birth (dd/MM/yyyy), Marks:");
                    name = scanner.nextLine();
                    dob = scanner.nextLine();
                    marks = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    if (operations.updateStudentByPrn(prn, new Student(prn, name, dob, marks))) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("No student found with PRN: " + prn);
                    }
                    break;
                case 6:
                    // Delete Student logic
                    System.out.print("Enter PRN of student to delete: ");
                    prn = scanner.nextLine();
                    if (operations.deleteStudentByPrn(prn)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("No student found with PRN: " + prn);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close(); // Close the scanner object
    }
}
