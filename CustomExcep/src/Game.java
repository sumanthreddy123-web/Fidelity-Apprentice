import java.util.Scanner;
public class Game {
    private String name;
    private int maxNoPlayers;

    public String getName() {
        return name;
    }

    public int getMaxNoPlayers() {
        return maxNoPlayers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxNoPlayers(int maxNoPlayers) {
        this.maxNoPlayers = maxNoPlayers;
    }
    @Override
    public String toString() {
        return "Maximum number of Players for "+ name + " is " + maxNoPlayers;
    }
}
class GameWithTL extends Game {
    private int timelimit;

    public int getTimelimit() {
        return timelimit;
    }
    public void setTimelimit(int timelimit) {
        this.timelimit = timelimit;
    }
    @Override
    public String toString() {
        return super.toString() + "\nTime Limit for  "+ getName() + " is " + timelimit + " minutes";

    }
}
class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game g1 = new Game();

        System.out.println("Enter the game: ");
        g1.setName(sc.next());
        System.out.println("Enter Maximum number of players: ");
        g1.setMaxNoPlayers(sc.nextInt());

        GameWithTL g2 = new GameWithTL();
        System.out.println("Enter the game: ");
        g2.setName(sc.next());
        System.out.println("Enter Maximum number of players: ");
        g2.setMaxNoPlayers(sc.nextInt());
        System.out.println("Enter the timelimit of the game: ");
        g2.setTimelimit(sc.nextInt());

        System.out.println(g1.toString());
        System.out.println(g2.toString());




    }
}
