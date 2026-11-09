
import java.util.Scanner;

public class ReportProgress {

    // Display welcome message
    static void displayWelcome() {
        System.out.println("Welcome to Student Report");
    }

    // Display student details
    void displayDetails(String name, int java, int python, int dbms) {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Java Marks: " + java);
        System.out.println("Python Marks: " + python);
        System.out.println("DBMS Marks: " + dbms);
    }

    // Calculate total marks
    static int calculateTotal(int java, int python, int dbms) {
        int total = java + python + dbms;
        return total;
    }

    // Calculate average marks
    static double calculateAverage(int total) {
        double average = total / 3.0;
        return average;
    }

    // Check pass or fail
    static boolean checkResult(int java, int python, int dbms) {
        if (java >= 35 && python >= 35 && dbms >= 35) {
            System.out.println("Result: PASS");
            return true;
        } else {
            System.out.println("Result: FAIL");
            return false;
        }
    }

    // Calculate grade
    static char grade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }

    // Display final report
    static void displayReport() {
        System.out.println("\n========= END REPORT =========");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcome
        displayWelcome();

        ReportProgress obj = new ReportProgress();

        // Get student name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Get subject marks
        System.out.print("Enter Java marks: ");
        int java = input.nextInt();

        System.out.print("Enter Python marks: ");
        int python = input.nextInt();

        System.out.print("Enter DBMS marks: ");
        int dbms = input.nextInt();

        // Display details
        obj.displayDetails(name, java, python, dbms);

        // Calculate total
        int total = calculateTotal(java, python, dbms);
        System.out.println("Total Marks: " + total);

        // Calculate average
        double average = calculateAverage(total);
        System.out.println("Average Marks: " + average);

        // Check result
        checkResult(java, python, dbms);

        // Display grade
        char studentGrade = grade(average);
        System.out.println("Grade: " + studentGrade);

        // Final report
        displayReport();

        input.close();
    }
}
