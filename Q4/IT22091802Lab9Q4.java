 import java.util.Scanner;

public class IT22091802Lab9Q4 {

    // METHOD a: calculate final mark (30% assignment + 70% exam)
    public static double calcFinalMark(double assignMark, double examMark) {
        return (assignMark * 0.30) + (examMark * 0.70);
    }

    // METHOD b: find grade based on final mark
    public static String findGrades(double finalMark) {
        if (finalMark >= 75) {
            return "A";
        } else if (finalMark >= 60) {
            return "B";
        } else if (finalMark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // METHOD c: print student details in formatted table row
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-15s %-15.2f %s%n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store data for 5 students
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

        // Input loop for 5 students
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for "
                    + names[i] + ": ");
            double assignMark = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for "
                    + names[i] + ": ");
            double examMark = scanner.nextDouble();

            // Calculate and store final mark and grade
            finalMarks[i] = calcFinalMark(assignMark, examMark);
            grades[i] = findGrades(finalMarks[i]);

            System.out.println();
        }

        // Print table header
        System.out.printf("%-15s %-15s %s%n", "Name", "Final Mark", "Grade");

        // Print each student's details
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
    }
}