import java.util.Scanner;

public class RockPaperScissorsGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String player1, player2;
        boolean playAgain = true;

        System.out.println("Let's play Rock Paper Scissors!");

        do {
            System.out.print("Player 1, enter your choice (R for rock, P for paper, or S for scissors): ");
            player1 = getPlayerChoice(in);
            System.out.print("Player 2, enter your choice (R for rock, P for paper, or S for scissors): ");
            player2 = getPlayerChoice(in);

            if (player1.equals(player2)) {
                System.out.println("It's a tie!");
            } else if (player1.equals("R") && player2.equals("S") ||
                    player1.equals("P") && player2.equals("R") ||
                    player1.equals("S") && player2.equals("P")) {
                System.out.println("Player 1 wins! " + getMoveName(player1) + " beats " + getMoveName(player2) + ".");
            } else if (player2.equals("R") && player1.equals("S") ||
                    player2.equals("P") && player1.equals("R") ||
                    player2.equals("S") && player1.equals("P")) {
                System.out.println("Player 2 wins! " + getMoveName(player2) + " beats " + getMoveName(player1) + ".");
            } else {
                System.out.println("Invalid input. Please enter R for rock, P for paper, or S for scissors only.");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = getPlayAgainChoice(in);
        } while (playAgain);

        System.out.println("Thank you for playing!");
    }

    private static String getPlayerChoice(Scanner scanner) {
        String choice = scanner.nextLine().toUpperCase();
        while (!choice.equals("R") && !choice.equals("P") && !choice.equals("S")) {
            System.out.print("Invalid input. Please enter R for rock, P for paper, or S for scissors only: ");
            choice = scanner.nextLine().toUpperCase();
        }
        return choice;
    }

    private static boolean getPlayAgainChoice(Scanner scanner) {
        String choice = scanner.nextLine().toUpperCase();
        while (!choice.equals("Y") && !choice.equals("YES") && !choice.equals("N") && !choice.equals("NO")) {
            System.out.print("Invalid input. Please enter Y for Yes or N for No: ");
            choice = scanner.nextLine().toUpperCase();
        }
        return choice.equals("Y") || choice.equals("YES");
    }

    private static String getMoveName(String move) {
        switch (move) {
            case "R":
                return "rock";
            case "P":
                return "paper";
            case "S":
                return "scissors";
            default:
                return "";
        }
    }
}
