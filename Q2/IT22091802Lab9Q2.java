 import java.util.Scanner;

public class IT22091802Lab9Q2 {

    // METHOD: takes radius as parameter, calculates and RETURNS area
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        // Math.PI = 3.141592653589793 (built-in constant)
        return area; // send result back to where method was called
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // CALL the circleArea method, passing radius as argument
        double area = circleArea(radius);

        System.out.println("The area of the circle with radius "
                + radius + " is : " + area);
    }
}