public class Student {

    private int id;
    private String name;
    private double javaMarks;
    private double dbmsMarks;
    private double dsaMarks;

    public Student(int id, String name, double javaMarks,
                   double dbmsMarks, double dsaMarks) {

        this.id = id;
        this.name = name;
        this.javaMarks = javaMarks;
        this.dbmsMarks = dbmsMarks;
        this.dsaMarks = dsaMarks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getJavaMarks() {
        return javaMarks;
    }

    public double getDbmsMarks() {
        return dbmsMarks;
    }

    public double getDsaMarks() {
        return dsaMarks;
    }

    // Setters
    public void setJavaMarks(double javaMarks) {
        this.javaMarks = javaMarks;
    }

    public void setDbmsMarks(double dbmsMarks) {
        this.dbmsMarks = dbmsMarks;
    }

    public void setDsaMarks(double dsaMarks) {
        this.dsaMarks = dsaMarks;
    }

    // Calculate average
    public double calculateAverage() {
        return (javaMarks + dbmsMarks + dsaMarks) / 3;
    }

    // Calculate grade
    public String calculateGrade() {

        double average = calculateAverage();

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Pass / Fail
    public String getStatus() {

        if (javaMarks >= 40 &&
            dbmsMarks >= 40 &&
            dsaMarks >= 40) {

            return "PASS";
        }

        return "FAIL";
    }

    // Display student information
    public void displayStudent() {

        System.out.println("----------------------------------------");
        System.out.println("Student ID      : " + id);
        System.out.println("Name            : " + name);
        System.out.println("Java            : " + javaMarks);
        System.out.println("DBMS            : " + dbmsMarks);
        System.out.println("DSA             : " + dsaMarks);
        System.out.printf("Average         : %.2f%n", calculateAverage());
        System.out.println("Grade           : " + calculateGrade());
        System.out.println("Status          : " + getStatus());
        System.out.println("----------------------------------------");
    }
}
