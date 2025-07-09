import java.util.*;
class person{
    String name;
    int age;

    public  void info()
    {
    System.out.println("The name:"+this.name);
    System.out.println("the age:"+age);
    }
}

public class Ocls {
    public static void main(String[] args) {
        person p1= new person();
        p1.name="Manu";
        p1.age = 20;
        p1.info();
    }
    
}
