import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insurance Number: ");
        String insuranceNo = scanner.nextLine();

        System.out.print("Insurance Name: ");
        String insuranceName = scanner.nextLine();

        System.out.print("Amount Covered: ");
        double amountCovered = scanner.nextDouble();

        System.out.println("Select\n1. Life Insurance\n2. Motor Insurance");
        int option = scanner.nextInt();

        double premium = 0;

        if (option == 1) {
            System.out.print("Policy Term: ");
            int policyTerm = scanner.nextInt();

            System.out.print("Benefit Percent: ");
            float benefitPercent = scanner.nextFloat();

            LifeInsurance lifeInsurance = new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benefitPercent);
            premium = addPolicy(lifeInsurance, option);
        } else if (option == 2) {
            System.out.print("Depreciation Percent: ");
            float depPercent = scanner.nextFloat();

            MotorInsurance motorInsurance = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depPercent);
            premium = addPolicy(motorInsurance, option);
        }

        System.out.println("Calculated Premium: " + premium);
        scanner.close();
    }

    public static double addPolicy(Insurance ins, int opt) {
        if (opt == 1) {
            LifeInsurance lifeInsurance = (LifeInsurance) ins;
            return lifeInsurance.calculatePremium();
        } else if (opt == 2) {
            MotorInsurance motorInsurance = (MotorInsurance) ins;
            return motorInsurance.calculatePremium();
        }
        return 0;
    }
}
