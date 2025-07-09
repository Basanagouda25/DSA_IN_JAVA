import java.util.*;

class person{
    String name;
    int age;
    public void basicinfo(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
}

class employee extends person{
    String role;
    public void jobinfo(String name,int age,String role)
    {
        basicinfo(name, age);
        this.role = role;
    }
}

class manager extends employee{
    String dept;
    public void departmentinfo(String name,int age,String role,String dept){
        jobinfo(name,age,role);
        this.dept = dept;
    }

    public void display()
    {
        System.out.println("----Details----");
        System.out.printf("Name: %s\n",name);
        System.out.printf("Age: %d\n",age);
        System.out.printf("Role: %s\n",role);
        System.out.printf("Department: %s\n",dept);
    }
}

public class inherhard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter role:");
        String role = sc.nextLine();
        System.out.println("Department:");
        String dept = sc.nextLine();

        manager m = new manager();
        m.departmentinfo(name, age, role, dept);
        m.display();

        sc.close();
    }
}
