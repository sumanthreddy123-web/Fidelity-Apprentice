class PermanentEmployee extends Employee {
    private int pf;

    public PermanentEmployee(int id, String name, float basicSalary, int pf) {
        super(id, name);
        this.basicSalary = basicSalary;
        this.pf = pf;
    }

    @Override
    void calculateSalary() {
        netSalary = basicSalary - pf;
    }

    @Override
    void calculateBonus() {
        if (pf < 1000) {
            bonus = 0.10f * basicSalary;
        } else if (pf < 1500) {
            bonus = 0.115f * basicSalary;
        } else if (pf < 1800) {
            bonus = 0.12f * basicSalary;
        } else {
            bonus = 0.15f * basicSalary;
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("PF: " + pf);
        System.out.println("Bonus: " + bonus);
        System.out.println("Net Salary: " + netSalary);
    }
}
