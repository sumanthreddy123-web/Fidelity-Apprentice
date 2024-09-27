import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAdult() {
        return getAge(dob) >= 18 ? "Adult" : "Child"; //ternary operator
    }

    public int getAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        return currentDate.getYear() - dob.getYear() - (currentDate.getDayOfYear() < dob.getDayOfYear() ? 1 : 0);
    }

    public void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + getAge(dob));
        System.out.println(getAdult());
    }
}

class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Enter first name: ");
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter last name: ");
        person.setLastName(scanner.nextLine());

        LocalDate dob = null;
        boolean validDate = false;

        while (!validDate) {
            System.out.print("Enter date of birth in yyyy/MM/dd format: ");
            String dobInput = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

            try {
                dob = LocalDate.parse(dobInput, formatter);
                validDate = true;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please use yyyy/MM/dd.");
            }
        }

        person.setDob(dob);

        person.displayDetails();

    }
}
