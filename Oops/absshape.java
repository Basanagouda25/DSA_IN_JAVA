import java.util.*;

abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    double r;
    Circle(double r){
        this.r = r;
    }
    void area(){
        double res = 3.14 * r*r;
        System.out.println("Area of Circle:"+res);
    }
}

class Rectangle extends Shape{
    double l,b;
    Rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }
    void area(){
        double res = l * b;
        System.out.println("Area of Rectangle:"+res);
    }
}

class Triangle extends Shape{
    double ba,h;
    Triangle(double ba, double h){
        this.ba = ba;
        this.h= h;
    }
    void area(){
        double res = 0.5 * ba * h;
        System.out.println("Area of Triangle:"+res);
    }
}
public class absshape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        double r = sc.nextDouble();
        Shape c = new Circle(r);

        System.out.println("Enter Length and Breadth:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Shape re = new Rectangle(l, b);

        System.out.println("Enter Breadth and Height:");
        double ba= sc.nextDouble();
        double h = sc.nextDouble();
        Shape tr = new Triangle(ba, h);

        System.out.println("After Calculation of area");
        c.area();
        re.area();
        tr.area();
        
        sc.close();
    }
}
