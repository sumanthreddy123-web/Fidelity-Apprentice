import java.util.Scanner;
public class ABCpayroll {

    public static double GetGrossPay(int hoursWorked) {
        double StandardRate = 80.0;
        double overtimeRate = hoursWorked * 1.5;
        double grossPay;

        if (hoursWorked <= 56) {
            grossPay = hoursWorked * StandardRate;
        } else {
            grossPay = (56 * StandardRate) + (hoursWorked - 56) * overtimeRate;
        }
        return grossPay;
    }

    public static double CalculateTax(double grossPay) {
        double taxRate = 0.02;
        return grossPay * taxRate;
    }

    public static double CalculateNetSalary(int hoursWorked) {
        double grossPay= GetGrossPay( hoursWorked);
        double tax = CalculateTax(grossPay);
        return grossPay - tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of hours worked: ");
        int hoursWorked = scanner.nextInt();
        double netPay = CalculateNetSalary( hoursWorked);
        System.out.println("The calculated Net Pay is $" + netPay);
    }
}
