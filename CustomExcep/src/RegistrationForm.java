import java.util.Scanner;

public class RegistrationForm
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scanner.nextLine();

    System.out.println("Enter your Age: ");
    int age = scanner.nextInt();

    System.out.println("Enter your country: ");
    String country = scanner.nextLine();

        System.out.println("Welcome "+name+".Your age is "+age+" and your country is "+country+".");
    }
}
