import java.util.*;

class employee{
    int id;
    String name;
    int  salary;

    public void displayDetails()
    {
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}

public class Oemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of emp:");
        int n = sc.nextInt();
        sc.nextLine();
        employee[] emp = new employee[n];
        for(int i=0; i<n; i++)
        {
            emp[i] = new employee();
            emp[i].id = sc.nextInt();
                        sc.nextLine();
            emp[i].name = sc.nextLine();
            emp[i].salary = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            emp[i].displayDetails();
        }
    }
}
