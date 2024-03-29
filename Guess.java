import java.util.Scanner;
public class Guess 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 to start the game");
            System.out.println("   [or]");
            System.out.println("Enter any number to Exit the Game");
            int i= sc.nextInt();
            if(i==1)
            {
                startGame();
                continue;
            }
            break;
        }
    }
    private static void startGame()
    {
        int minRange=0,maxRange=100;
        int att_num=5;
        int random_num=(int)(Math.random()*(maxRange-minRange+1)+minRange);

        Scanner sc=new Scanner(System.in);

        
        System.out.println("No.of Attempts left:"+att_num);

        while(att_num>0)
        {
            System.out.println();
            int user_num= sc.nextInt();
            if(user_num==random_num) 
            {
                System.out.println("\tCongratulations! Your guess is correct!");
                break;
            }
            else if(user_num>random_num) 
            {
                System.out.println("No.of Attempts left:"+ --att_num+"\n[HINT:your value is higher than my number,Try again!]");
            }
            else if(user_num<random_num) 
            {
                System.out.println("No.of Attempts left:"+ --att_num+"\n[HINT:your value is lower than my number,Try again!]");
            }
        }
        if(att_num<=0)
        {
            System.out.println("Sorry!No attempts left\nPlease try again");
        }
        System.out.println("\n The generated number was "+random_num);
        System.out.println("YOUR SCORE: "+att_num*10);
        System.out.println("\n\n Enter any key and press enter to continue");
        sc.next();
    }
}