import java.util.*;

class student{
    int m;
    int[] marks;
    int sum = 0;

    public student(int m)
    {
        this.m = m;
        marks = new int[m];
    }

    public void marks(Scanner sc)
    {
        for(int i=0; i<m; i++)
        {
            marks[i] = sc.nextInt();
            sum +=marks[i];
        }
    }

    public double avg()
    {
        double result = (double) sum/m;
        return result;
    }

    public char grade()
    {
        double Avg = avg();
        if(Avg >=90)
            return 'A';
        else if (Avg<90 || Avg >=75) 
            return 'B';
        else
            return 'C';
    }

    public void display()
    {
        System.out.println("Average:"+avg());
        System.out.println("Grade:"+grade());
    }
}

public class Ostu {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int m = sc.nextInt();

        student[] stu = new student[n];
        for(int i=0; i<n; i++)    
        {
           stu[i] = new student(m);
           stu[i].marks(sc);
           
        }
        for(int i=0; i<n; i++)
        {
            stu[i].display();
        }
    }
}
