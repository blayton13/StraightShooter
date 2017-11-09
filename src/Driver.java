import java.util.*;

public class Driver {
    public static void main(String args[]){

        Scanner console = new Scanner(System.in);

        StraightShooter player = new StraightShooter(6);
        StraightShooter computer = new StraightShooter(6);
        String cont = "y";
        int wins=0;
        int losses=0;


        while(cont.charAt(0)=='y') {
            player = new StraightShooter(6);
            computer = new StraightShooter(6);
            System.out.println("Welcome to StraightShooter\nFirst to 100 wins!");
            while (player.getTotalScore() < 100 && computer.getTotalScore() < 100) {
                System.out.println("\nPress enter to roll");
                console.nextLine();
                player.roll();
                System.out.println("Your rolls were " + player + " earning you " + player.getScore() + " points" + "\nYour score is now " + player.getTotalScore());
                if (player.getTotalScore() >= 100) break;
                System.out.println("\nPress enter to continue");
                console.nextLine();
                computer.roll();
                System.out.println("CPU's turn\nCPU rolled " + computer + " earning CPU " + computer.getScore() + " points" + "\nCPU score is now " + computer.getTotalScore());
            }
            if(player.getTotalScore()>=100) {
                System.out.println("Congratulations, you won!");
                wins++;
            } else {
                System.out.println("Sorry, you,lost.");
                losses++;
            }
            do{
                System.out.println("\nWould you like to play again? (Y/N)");

                cont=console.nextLine().toLowerCase();
            }while(cont.length()<1 || cont.charAt(0)!='y' && cont.charAt(0) !='n');
        }
        System.out.println("Wins: "+wins+"\nLosses: "+losses);

    }
}
