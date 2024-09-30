import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + "}";
    }
}

class EmployeeFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter ID of employee " + (i + 1) + ": ");
            int id = scanner.nextInt();
            scanner.nextLine();
            employees.add(new Employee(name, id));
        }

        List<Employee> filteredEmployees = employees.stream()
                .filter(e -> e.getName().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Employees whose names start with 'A':");
        for (Employee e :filteredEmployees) {
            System.out.println(e);
        }
    }
}

