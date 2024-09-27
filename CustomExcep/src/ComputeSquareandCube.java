import java.util.Scanner;

class ComputeSquareAndCube {

    // Method to find the square of a number
    static double FindSquare(double number) {
        return number * number;
    }

    // Method to find the cube of a number
    static double FindCube(double number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double square = FindSquare(number);
        double cube = FindCube(number);

        // o/p
        System.out.println("The square of " + number + " is: " + square);
        System.out.println("The cube of " + number + " is: " + cube);

    }
}

