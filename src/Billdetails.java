import java.util.Scanner;

public class Billdetails {
    public static void main(String[] args)
    {
        int pizza=200,puff=40,pepsi=120;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of pizzas");
        int No_of_pizzas=sc.nextInt();
        System.out.println("Enter the number of puffs");
        int No_of_puffs=sc.nextInt();
        System.out.println("Enter the number of pepsi");
        int No_of_pepsi=sc.nextInt();
        int sum_pizza=pizza*No_of_pizzas;
        int sum_puff=puff*No_of_puffs;
        int sum_pepsi=pepsi*No_of_pepsi;
        System.out.println(" The Bill Details"+"The cost of pizza:"+sum_pizza+" "+
                "The cost of puffs:"+sum_puff
                +" "+"The cost of pepsi:"+sum_pepsi);
        int total_price=sum_pizza+sum_puff+sum_pepsi;
        System.out.println("The total price of prize:"+total_price);


    }
}
