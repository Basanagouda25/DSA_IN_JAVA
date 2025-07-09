import java.util.*;
class student
{
    String name;
    int age;
public void info()
    {
    System.out.println("The name of the Student is"+this.name);
    System.out.print("The age of the Student is"+age);
    }
}

public class OOPS 
{
    public static void main(String[] args) 
    {
        //create a object and assign it to class
        student s1 = new student();
        s1.name = "Basu";
        s1.age = 20;
        s1.info();
    }
}