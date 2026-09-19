import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static StudentManager manager = new StudentManager();

    public static void main(String[] args) {

        while (true) {

            displayMenu();

            int choice = readInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateStudent();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    manager.displaySummaryReport();
                    break;

                case 7:
                    System.out.println("\nThank you for using Student Grade Tracker!");
                    sc.close();
                    return;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    // Display menu
    public static void displayMenu() {

        System.out.println("\n========================================");
        System.out.println("         STUDENT GRADE TRACKER");
        System.out.println("========================================");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Marks");
        System.out.println("5. Delete Student");
        System.out.println("6. Generate Summary Report");
        System.out.println("7. Exit");
        System.out.println("========================================");
    }

    // Add student
    public static void addStudent() {

        System.out.println("\n---------- ADD STUDENT ----------");

        int id;

        while (true) {

            id = readInt("Enter Student ID: ");

            if (manager.idExists(id)) {
                System.out.println("This ID already exists. Enter another ID.");
            } else {
                break;
            }
        }

        String name = readString("Enter Student Name: ");

        double javaMarks = readMarks("Enter Java Marks: ");
        double dbmsMarks = readMarks("Enter DBMS Marks: ");
        double dsaMarks = readMarks("Enter DSA Marks: ");

        Student student = new Student(
                id,
                name,
                javaMarks,
                dbmsMarks,
                dsaMarks
        );

        manager.addStudent(student);
    }

    // Search student
    public static void searchStudent() {

        System.out.println("\n---------- SEARCH STUDENT ----------");

        String name = readString("Enter student name: ");

        manager.searchStudent(name);
    }

    // Update marks
    public static void updateStudent() {

        System.out.println("\n---------- UPDATE MARKS ----------");

        int id = readInt("Enter Student ID: ");

        Student student = manager.findStudentById(id);

        if (student == null) {

            System.out.println("\nStudent not found.");
            return;
        }

        System.out.println("\nCurrent Details:");
        student.displayStudent();

        double javaMarks = readMarks("Enter new Java Marks: ");
        double dbmsMarks = readMarks("Enter new DBMS Marks: ");
        double dsaMarks = readMarks("Enter new DSA Marks: ");

        boolean updated = manager.updateMarks(
                id,
                javaMarks,
                dbmsMarks,
                dsaMarks
        );

        if (updated) {
            System.out.println("\nMarks updated successfully!");
        }
    }

    // Delete student
    public static void deleteStudent() {

        System.out.println("\n---------- DELETE STUDENT ----------");

        int id = readInt("Enter Student ID: ");

        Student student = manager.findStudentById(id);

        if (student == null) {

            System.out.println("\nStudent not found.");
            return;
        }

        System.out.println("\nStudent to be deleted:");
        student.displayStudent();

        String confirmation =
                readString("Are you sure you want to delete? (yes/no): ");

        if (confirmation.equalsIgnoreCase("yes")) {

            boolean deleted = manager.deleteStudent(id);

            if (deleted) {
                System.out.println("\nStudent deleted successfully!");
            }

        } else {

            System.out.println("\nDelete operation cancelled.");
        }
    }

    // Read integer safely
    public static int readInt(String message) {

        while (true) {

            System.out.print(message);

            if (sc.hasNextInt()) {

                int value = sc.nextInt();
                sc.nextLine();

                return value;

            } else {

                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }
        }
    }

    // Read string
    public static String readString(String message) {

        while (true) {

            System.out.print(message);

            String value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("Input cannot be empty.");
        }
    }

    // Read marks between 0 and 100
    public static double readMarks(String message) {

        while (true) {

            System.out.print(message);

            if (sc.hasNextDouble()) {

                double marks = sc.nextDouble();
                sc.nextLine();

                if (marks >= 0 && marks <= 100) {
                    return marks;
                }

                System.out.println(
                        "Marks must be between 0 and 100."
                );

            } else {

                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }
        }
    }
}
