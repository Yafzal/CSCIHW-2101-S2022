import java.util.Random;
import java.util.Scanner;

public class SquidGame
{
    public static void printLadder(int[][] ladder, int curSize, boolean isFinish)
    {
        System.out.println("|||||| ---- Start");
        for(int j=0; j<curSize;j++)
        {
            System.out.println("|" + ladder[j][0] + "||" + ladder[j][1] + "|");
        }

        if(isFinish)
        {
            System.out.println("|||||| ---- Finish");
        }
        else
        {
            System.out.println("|?||?|");
        }
    }

    public static char getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your side: L/l | R/r : ");
        char choice = sc.nextLine().charAt(0);
        while (choice != 'r' && choice != 'R' && choice != 'l' && choice != 'L') {

            System.out.print("Please enter valid side: ");
            choice = sc.nextLine().charAt(0);
        }

        return choice;
    }
    public static void main(String[] args) {
        Random rand = new Random();

        int lives = 1;
        int[][] ladder = new int[10][2];

        for(int i=0;i<ladder.length;i++)
        {
            int num = rand.nextInt(2);
            if(num == 0)
            {
                ladder[i][0] = 0;
                ladder[i][1] = 1;
            }
            else
            {
                ladder[i][0] = 1;
                ladder[i][1] = 0;
            }
        }

        boolean win = true;
        for(int i=0;i<ladder.length && lives != 0;i++)
        {
            printLadder(ladder,i,false);
            char side = getInput();
            int ans = -1;
            if(side == 'r' || side == 'R')
                ans = 1;
            else
                ans = 0;

            if(ladder[i][ans] == 1)
            {
                lives --;
                System.out.println("You Lost 1 life\n" +
                        "Total Lives: 0\n" +
                        "YOU DIED");
                win = false;
            }

            System.out.println();
        }

        if(win)
        {
            System.out.println("Congrats You Won!!");
            printLadder(ladder, ladder.length, true);
        }
    }
}
