public class Car {

    private String Cname;
    private String Cmodel;
    private int Ccost;
    static String company ="Hyundai";

    public void initialize(String Cname, String Cmodel, int Ccost) {
        this.Cname = Cname;
        this.Cmodel = Cmodel;
        this.Ccost = Ccost;
    }
    public void Display() {
        System.out.println("Car Name: " + Cname+"\ncar model: " + Cmodel+"\ncar cost: " + Ccost);
    }
    public static void show(){
        System.out.println("Car company: "+ company);
    }


}
