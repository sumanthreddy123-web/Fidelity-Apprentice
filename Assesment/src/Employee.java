abstract class Employee {
    private int id;
    private String name;
    protected float basicSalary;
    protected float bonus;
    protected float netSalary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void calculateSalary();
    abstract void calculateBonus();

    public void displayDetails() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
}