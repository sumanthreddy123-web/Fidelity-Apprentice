import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;

        System.out.print("Enter the value for x: ");
        x = scanner.nextInt();

        System.out.print("Enter the value for y: ");
        y = scanner.nextInt();

        boolean result = x < y;

        // o/p
        if (result) {
            System.out.println("x (" + x + ") is less than y (" + y + ") is true.");
        } else {
            System.out.println("x (" + x + ") is not less than y (" + y + ")is false.");
        }

    }
}

