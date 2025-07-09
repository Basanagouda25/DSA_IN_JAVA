import java.util.*;

class person{
    String name;

    person(String name)
    {
        this.name = name;
    }
}

class student extends person{
    int rollno;
    student(String name,int rollno)
    {
        super(name);
        this.rollno = rollno;
    }

    void display()
    {
        System.out.printf("Name:%s\n",name);
        System.out.println("roll no:"+rollno);
    }
}
public class inherisuper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //you need to take which class you are inheriting
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Roll No:");
        int rollno = sc.nextInt();
        student st = new student(name,rollno);

        st.display();
    sc.close();
    }
}
