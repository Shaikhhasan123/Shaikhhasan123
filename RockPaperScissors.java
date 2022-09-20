import java.util.Scanner;

public class RockPaperScissors

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: (Choose rock, paper or scissors):");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: (Choose rock, paper or scissors):");
        String player2 = scan.next().toLowerCase();

        if (player1.equals(player2))
        {
            System.out.println("It's a draw! Play again!");
        } else if (player1.equals("rock"))
        {
            if (player2.equals("scissors"))
                System.out.println("player 1 wins!");
            else if (player2.equals("paper"))
                System.out.println("player 2 wins!");
        } else if (player1.equals("paper"))
        {
            if (player2.equals("scissors"))
                System.out.println("player 2 wins!");
            else if (player2.equals("rock"))
                System.out.println("player 1 wins!");
        } else if (player1.equals("scissors"))
        {
            if (player2.equals("paper"))
                System.out.println("player 1 wins!");
            else if (player2.equals("rock"))
                System.out.println("player 2 wins!");
        } else
            System.out.println("Wrong input. (You can only put rock, paper or scissors.25)");
        scan.close();
    }

}


