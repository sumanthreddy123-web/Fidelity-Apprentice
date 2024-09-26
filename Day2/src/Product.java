class Display {
    int ProId;
    String ProName;
    double ProPrice;
    public Display(int ProId, String ProName, double ProPrice) {
        this.ProId = ProId;
        this.ProName = ProName;
        this.ProPrice = ProPrice;
    }
    public void display() {
        System.out.println("ProductID:" + ProId);
        System.out.println("ProductName:" + ProName);
        System.out.println("ProductPrice:" + ProPrice);
    }
}
class Display5Product {
    public static void main(String[] args) {
        Display dp = new Display(1, "Laptop", 50000);
        Display dp1 = new Display(2, "Charger", 500);
        Display dp2 = new Display(3, "Headset", 5000);
        Display dp3 = new Display(4, "Mobile", 25000);
        Display dp4 = new Display(5, "Mouse", 200);
        dp.display();
        dp1.display();
        dp2.display();
        dp3.display();
        dp4.display();
    }
}
