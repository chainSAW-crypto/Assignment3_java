// Student.java
// Defines the Student class with attributes and constructors

public class Student {
    private String prn;
    private String name;
    private String dob; // Date of Birth in "dd/MM/yyyy" format
    private double marks;

    // Constructor to initialize the Student object
    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    // Getters and Setters for the instance variables
    public String getPrn() {
        return prn;
    }

    public void setPrn(String prn) {
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Method to display student details
    @Override
    public String toString() {
        return "Student{" +
                "PRN='" + prn + '\'' +
                ", Name='" + name + '\'' +
                ", Date of Birth='" + dob + '\'' +
                ", Marks=" + marks +
                '}';
    }
}

