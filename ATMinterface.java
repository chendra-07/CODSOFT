import java.util.*;
class BankAccount 
{
    private double bal;

    public BankAccount(double ini_bal)
    {
        this.bal = ini_bal;
    }

    public double balance()
    {
        return bal;
    }

    public void deposit(double amt)
    {
        bal += amt;
    }

    public boolean withdraw(double amount)
    {
        if (amount <= bal)
        {
            bal -= amount;
            return true;
        }
        return false;
    }
}


class ATM 
{
    private BankAccount userAccount;
    Scanner sc;

    public ATM(BankAccount account) 
    {
        this.userAccount = account;
        this.sc = new Scanner(System.in);
    }

    void displayMenu()
    {
        System.out.println("ATM INTERFACE\n 1. Deposite\n 2. withdraw\n 3. Check Balance ");
        System.out.println(" 4. Exit");
        System.out.print("\nEnter your choice: ");
    }

    void withdraw() 
    {
        System.out.print("Enter the withdrawal amount: ");
        double amount = sc.nextDouble();

        if (userAccount.withdraw(amount))
        {
            System.out.println("Withdrawal successful!\nRemaining balance: " + ( userAccount).balance());
        } 
        else
        {
            System.out.println("Insufficient funds!!\nWithdrawal failed.");
        }
    }

    void deposit()
    {
        System.out.print("Enter the amount to be Deposited: ");
        double amount = sc.nextDouble();
        userAccount.deposit(amount);
        System.out.println("Deposit successful.\nUpdated balance: " + userAccount.balance());
    }

    void checkBalance() 
    {
        System.out.println("Current balance: " + userAccount.balance());
    }

}

    public class ATMinterface 
    {
    public static void main(String[] args)
    {
        BankAccount userAccount = new BankAccount(0.0); 
        ATM atm = new ATM(userAccount);
        int ch;
        do {

            atm.displayMenu();
            ch = atm.sc.nextInt();

            switch (ch)
            {
                case 1:
                    atm.deposit();
                    break;
                case 2:
                    atm.withdraw();
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            if(ch!=4)
            {
                System.out.println("\nEnter any Number to continue");
                atm.sc.nextInt();
            }
        } while (ch != 4);
        atm.sc.close();
    }
}