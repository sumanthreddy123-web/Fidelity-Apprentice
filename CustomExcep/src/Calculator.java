import java.util.Scanner;
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b != 0){
            return  a/b;
        }else{
            throw new ArithmeticException("Divide by zero is not possible");
        }
    }
}

class CalcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("Enter the Operator: ");
        String operator = sc.nextLine();
        System.out.println("Enter the operands: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double[] rem = new double[1];
        double result;
        switch (operator) {
            case "+":
                result = c.add(num1, num2);
                System.out.println("Result of "+ num1 + " + " + num2 + " = " + result);
                break;
            case "-":
                result = c.subtract(num1, num2);
                System.out.println("Result of "+ num1 + " - " + num2 + " = " + result);
                break;
            case "*":
                result = c.multiply(num1, num2);
                System.out.println("Result of "+ num1 + " * " + num2 + " = " + result);
                break;
            case "/":
                try {
                    result = c.divide(num1, num2);
                    System.out.println("Result of " + num1 + " / " + num2 + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}