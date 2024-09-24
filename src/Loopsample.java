import java.util.Scanner;

public class Loopsample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        float marks = sc.nextFloat();
        String grade;
        String feedback;

        if (marks >= 90){
            grade = "A";
            feedback = "Excellent performance";
        } else if (marks>=80){
            grade = "B";
            feedback = "very good performance";
        } else if (marks >= 70) {
            grade = "C";
            feedback = "good performance";
        }else if (marks >= 60) {
            grade = "D";
            feedback = "Better";
        }else if (marks >= 50) {
            grade = "E";
            feedback = "Needs to work hard";
        }else {
            grade = "F";
            feedback = "Fail";
        }
        System.out.println(feedback);
    }
}
