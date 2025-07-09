import java.util.*;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    
}

class SavingsAccount implements BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited to Savings: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient Balance in Savings");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class CurrentAccount implements BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited to Current: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Current: " + amount);
        } else {
            System.out.println("Insufficient Balance in Current");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class hardint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount savings = new SavingsAccount();
        BankAccount current = new CurrentAccount();
        BankAccount acc = null;

        while (true) {
            System.out.print("\nSelect Account Type (savings/current/exit): ");
            String type = sc.nextLine().toLowerCase();

            if (type.equals("savings")) {
                acc = savings; // no need to create same object multiple times
            } else if (type.equals("current")) {
                acc = current; // reuse same object
            } else if (type.equals("exit")) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid Account Type");
                continue;
            }

            System.out.println("Choose Operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3.Check Balance");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the amount: ");
            double amount = sc.nextDouble();
            sc.nextLine();

            switch (choice) {
                case 1:
                    acc.deposit(amount);
                    break;
                case 2:
                    acc.withdraw(amount);
                    break;
                case 3:
                    if (acc instanceof SavingsAccount) {
                        System.out.println("Savings Balance:" +((SavingsAccount) acc).getBalance()); // Casting obj to actual class and calling the method.
                    }else if(acc instanceof CurrentAccount){
                        System.out.println("Current Balance" +((CurrentAccount) acc).getBalance());
                    }
                default:
                    System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }
}
