import java.util.*;

class Login {
    private String username;
    private String password;

    public void setInit(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPass(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Incorrect old password. Try again.");
        }
    }

    public String getUser() {
        return username;
    }

    public void displayDetails() {
        System.out.printf("Username: %s\n", getUser());
        System.out.printf("Password: %s\n", password);  
    }
}

public class loginpage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login lg = new Login();

        System.out.println("Register Your Account");
        System.out.print("Enter the username: ");
        String username = sc.nextLine();
        System.out.print("Enter the password: ");
        String password = sc.nextLine();

        lg.setInit(username, password);
        System.out.println("Account Created Successfully!");

        int choice;
        do {
            System.out.println("\n1. Account Details");
            System.out.println("2. Change Password");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    System.out.println("Your Account Info:");
                    lg.displayDetails();
                    break;
                case 2:
                    System.out.print("Enter old password: ");
                    String oldp = sc.nextLine();
                    System.out.print("Enter new password: ");
                    String newp = sc.nextLine();
                    lg.setPass(oldp, newp);
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println(" Invalid Choice. Try again.");
            }
        } while (choice != 3);
        sc.close();
    }
}
