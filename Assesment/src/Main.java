//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Permanent Employee
        PermanentEmployee pe = new PermanentEmployee(101, "Esther", 25000, 1500);
        pe.calculateSalary();
        pe.calculateBonus();
        System.out.println("The details are:");
        pe.displayDetails();

        System.out.println();

        // Temporary Employee
        TemporaryEmployee te = new TemporaryEmployee(102, "Ganesh", 1500, 20);
        te.calculateSalary();
        te.calculateBonus();
        te.displayDetails();
    }
}