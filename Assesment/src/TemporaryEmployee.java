class TemporaryEmployee extends Employee {
    private int dailyWages;
    private int noOfDays;

    public TemporaryEmployee(int id, String name, int dailyWages, int noOfDays) {
        super(id, name);
        this.dailyWages = dailyWages;
        this.noOfDays = noOfDays;
    }

    @Override
    void calculateSalary() {
        netSalary = dailyWages * noOfDays;
    }

    @Override
    void calculateBonus() {
        if (dailyWages < 1000) {
            bonus = 0.15f * netSalary;
        } else if (dailyWages < 1500) {
            bonus = 0.12f * netSalary;
        } else if (dailyWages < 1750) {
            bonus = 0.11f * netSalary;
        } else {
            bonus = 0.08f * netSalary;
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Daily Wages: " + dailyWages);
        System.out.println("No. of Days Worked: " + noOfDays);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}
