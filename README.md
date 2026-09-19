# Student Grade Tracker

Student Grade Tracker is a Java console-based application used to manage student marks and generate grade reports.

The application allows users to add students, store their marks for different subjects, calculate averages, find highest and lowest scores, and generate a complete class summary report.

## Features

* Add new student
* Store marks for Java, DBMS, and DSA
* View all students
* Search student by name
* Update student marks
* Delete student
* Calculate individual student average
* Calculate student grade
* Display Pass/Fail status
* Calculate subject-wise class average
* Find highest and lowest marks for each subject
* Generate complete class summary report
* Input validation for student marks

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* ArrayList
* Scanner
* Console Interface

## Project Structure

```text
StudentGradeTracker
│
├── Student.java
├── StudentManager.java
├── Main.java
└── README.md
```

### Student.java

Contains the Student class and stores student information such as:

* Student ID
* Student Name
* Java Marks
* DBMS Marks
* DSA Marks

It also contains methods for calculating average, grade, and pass/fail status.

### StudentManager.java

Handles student data using `ArrayList<Student>`.

It manages:

* Adding students
* Searching students
* Updating marks
* Deleting students
* Calculating class statistics
* Generating summary reports

### Main.java

Contains the main method and provides the menu-driven console interface for interacting with the application.

## Grade Calculation

| Average Marks | Grade |
| ------------- | ----- |
| 90 - 100      | A+    |
| 80 - 89       | A     |
| 70 - 79       | B     |
| 60 - 69       | C     |
| 50 - 59       | D     |
| Below 50      | F     |

A student is considered **PASS** when they score at least 40 marks in all three subjects.

## How to Run

1. Clone or download the project.
2. Open the project in IntelliJ IDEA, Eclipse, VS Code, or any Java-supported IDE.
3. Make sure all three `.java` files are in the same package/folder.
4. Run `Main.java`.
5. Use the menu displayed in the console.

## Sample Operations

```text
1. Add Student
2. View All Students
3. Search Student
4. Update Marks
5. Delete Student
6. Generate Summary Report
7. Exit
```

## Sample Summary Report

```text
========================================
        STUDENT GRADE REPORT
========================================

Student ID      : 101
Name            : Rahul
Java            : 85.0
DBMS            : 78.0
DSA             : 92.0
Average         : 85.00
Grade           : A
Status          : PASS

========================================
          CLASS STATISTICS
========================================

Total Students : 3
Class Average   : 80.42

Java
Average : 82.50
Highest : 95.00
Lowest  : 65.00

DBMS
Average : 76.40
Highest : 91.00
Lowest  : 52.00

DSA
Average : 84.70
Highest : 97.00
Lowest  : 61.00
```

## Concepts Demonstrated

This project demonstrates the following Java concepts:

* Classes and Objects
* Encapsulation
* Constructors
* Getters and Setters
* ArrayList
* Loops
* Conditional Statements
* Methods
* User Input using Scanner
* Searching and Updating data
* Basic statistical calculations

## Future Improvements

Possible future improvements include:

* File-based data storage
* Database integration using MySQL
* GUI using JavaFX or Swing
* Login and user authentication
* Exporting reports to PDF or Excel

## Author

Student Grade Tracker developed as a Java programming project.
