import java.util.*;
class calculator{
    int a;
    int b;
    public int add(){
        return a+b;
    }
    public int substract(){
        return a-b;
    }
    public int multiply(){
        return a*b;
    }
    public int divide(){
        return a/b;
    }
}


public class Ocalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        calculator c = new calculator();
        c.a = a;
        c.b = b;
        System.out.println("The Result:\n");
        System.out.println(c.add());
        System.out.println(c.substract());
        System.out.println(c.multiply());
        System.out.println(c.divide());
    }
}
