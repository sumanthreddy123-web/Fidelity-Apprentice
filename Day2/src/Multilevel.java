

    class University
    {
        String University="DSU";
        public void Display()
        {
            System.out.println("University name"+University);
        }

    }
    class Nhcollege extends University
    {
        String studentname = "Sumanth";
        int rollno=123;
        public void Display()
        {
            System.out.println("Student name"+studentname+"\nrollno"+rollno+"\nuniversity"+University);
        }
    }
    class Jain extends Nhcollege
    {
        public void Display(){
            System.out.println("Student name"+studentname+"\nrollno"+rollno+"\nuniversity"+University);
        }
    }
    public class Multilevel {
        public static void main(String[] args) {
            Jain jn= new Jain();
            jn.Display();
        }
    }