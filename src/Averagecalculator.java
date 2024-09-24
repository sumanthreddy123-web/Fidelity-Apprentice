import java.util.Scanner;

public class Averagecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array: ");
        for ( int i = 0; i < size; i++ ) {
            arr[i] = sc.nextInt();
        }
        int Sum=0,avg=0;
        for ( int i = 0; i < size; i++ ) {
            Sum+=arr[i];
        }
        avg=Sum/size;
        System.out.println("The Average is:"+avg);
    }
}
