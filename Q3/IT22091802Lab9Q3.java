public class IT22091802Lab9Q3 {

    // METHOD: adds two integers and returns result
    public static int add(int x, int y) {
        return x + y;
    }

    // METHOD: multiplies two integers and returns result
    public static int multiply(int x, int y) {
        return x * y;
    }

    // METHOD: squares an integer (multiplies by itself) and returns result
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {

        // i. (3*4 + 5*7)²
        // Step 1: multiply(3,4) = 12
        // Step 2: multiply(5,7) = 35
        // Step 3: add(12, 35)   = 47
        // Step 4: square(47)    = 2209
        int result1 = square(add(multiply(3, 4), multiply(5, 7)));
        System.out.println("Result of (3 * 4 + 5 * 7)²   : " + result1);

        // ii. (4+7)² + (8+3)²
        // Step 1: add(4,7)    = 11, square(11) = 121
        // Step 2: add(8,3)    = 11, square(11) = 121
        // Step 3: add(121,121) = 242
        int result2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("Result of (4 + 7)² + (8 + 3)² : " + result2);
    }
}