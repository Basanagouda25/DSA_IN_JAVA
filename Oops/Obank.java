import java.util.*;

class BankAccount {
    private String Account_number;
    private String holder_name;
    private double Balance;
    
    int withdraw = 0;
    int deposite = 0;

    public BankAccount(String Account_number,String holder_name,double Balance)
    {
        this.Account_number = Account_number;
        this.holder_name = holder_name;
        if(Balance >=0)
        {
            this.Balance = Balance;
        }
        else
        {
            this.Balance = 0;
            System.out.println("Invalid Balance so it is set to 0.");
        }

    }

    public String getAccountnumber()
    {
        return Account_number;
    }

    public String getholdername()
    {
        return holder_name;
    }

    public void deposite(double amount)
    {
        if(amount > 0)
        {
            Balance +=amount;
            System.out.println("Deposite Money: "+Balance);
        }
        else
        {
            System.out.println("Invalid Deposite Amount"); 
        }
    }

    public void withdraw(double amount)
    {
        if(Balance < amount)
        {
            System.out.println("Insufiicient Balance."+Balance);
        }
        else
        {
            Balance -=amount;
            System.out.println("Your withdraw amount:"+amount+"and Balance is:"+Balance);
        }
    }

    public double getBalance()
    {
        return Balance;
    }

    public void display()
    {
        System.out.println("The Account Number:"+Account_number);
        System.out.println("The Holder Name:"+holder_name);
        System.out.println("Balance Amount:"+Balance);
    }
}
public class Obank {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Account Number:");
        String Account_number = sc.nextLine();
        System.out.println("Enter the Bank Account Holders Name:");
        String holder_name = sc.nextLine();

        BankAccount bnk = new BankAccount(Account_number, holder_name, 0);

        int choice;
        do
        {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Want to Check Balance?");
            System.out.println("4. Display Account Info");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the Deposite Amount:");
                    double dep = sc.nextDouble();
                    bnk.deposite(dep);
                    break;
                case 2:
                    System.out.println("Enter the Withdraw Amount:");
                    double wit = sc.nextDouble();
                    bnk.withdraw(wit);
                    break;
                case 3:
                    System.out.println("The Balance Amount is:"+bnk.getBalance());
                    break;
                case 4:
                    System.out.println("Your Account Details:");
                    bnk.display();
                    break;
                case 5:
                    System.out.println("Your are Exiting..!");
                    break;
                default:
                    System.out.println("Invalid Option.!");
                    break;
            }
        }
        while (choice!=5); 
        sc.close();   
    }
}
