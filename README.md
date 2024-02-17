# Student Management System

## Overview

The Student Management System is a Java-based application designed to manage student records efficiently. It provides functionalities to add, display, search, update, and delete student details using a command-line interface. This system is ideal for educational institutions looking to maintain a dynamic database of student information.

## Features

- **Add a New Student**: Allows the addition of new student records to the system.
- **Display All Students**: Lists all the students currently stored in the system.
- **Search for Student by PRN**: Enables searching for a specific student using their PRN (Permanent Registration Number).
- **Search for Students by Name**: Facilitates searching for one or more students who share the same name.
- **Update Student Details by PRN**: Offers the functionality to update the details of a student identified by their PRN.
- **Delete a Student by PRN**: Provides the option to remove a student's record from the system using their PRN.

## Methodology

### Initialization

- The `StudentOperations` class initializes with an empty `ArrayList` of `Student` objects.

### Adding a New Student

- The `addStudent` method allows adding a new `Student` object to the list, indicating successful addition with a printed message.

### Displaying All Students

- The `displayStudents` method iterates through the list of students and prints each `Student` object's details.

### Searching for Students

- **searchByPrn**: Searches for a student by their PRN and returns the matching `Student` object.
- **searchByName**: Searches for students by name, potentially returning multiple `Student` objects with the same name.

### Updating Student Details

- The `updateStudentByPrn` method updates the details of a student identified by their PRN with new details provided by a `Student` object.

### Deleting a Student

- The `deleteStudentByPrn` method removes a student from the list based on their PRN.

## Classes

- **Student**: Contains student information variables like name, PRN, and includes a constructor to assign these variables to memory locations. It also contains all the getter and setter methods.
- **StudentOperations**: Manages the operations such as add, display, search, update, and delete on student records.

