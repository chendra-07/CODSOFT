import java.util.*;

public class Grade_Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No.of Subjects: ");
        int sub=sc.nextInt();
        int i=1,average=0,total = 0;
        while(i<=sub)
        {
            System.out.print("Enter the subject "+i++ +" Marks[out of 100]: ");
            total+=sc.nextInt();
        }
        average=total/i;
        System.out.println("\nResults:");
        System.out.println("Total Marks:"+total);
        System.out.println("Percentage= "+average+"%");
        if(average>=90)
        {
        	System.out.println("Your Grade: A+");
        }
        else if (average>=80)
        {
          System.out.println("Your Grade is: A");
        }
        else if (average>=60)
        {
          System.out.println("Your Grade is: B+");
        }
        else if (average>=40)
        {
          System.out.println("Your Grade is: B");
        }
        else if (average>=30) 
        {
          System.out.println("Your Grade is: C");
        }
        else 
        {
          System.out.println("Your Grade is: F");
        }
    }
}