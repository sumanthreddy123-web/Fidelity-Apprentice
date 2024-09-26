import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the car");
        String Cname=sc.next();
        System.out.println("Enter the model of the car");
        String Cmodel=sc.next();
        System.out.println("Enter the cost of the car");
        int Ccost= sc.nextInt();
        car.initialize(Cname,Cmodel,Ccost);
        car.Display();
        car.show();
        }
    }
