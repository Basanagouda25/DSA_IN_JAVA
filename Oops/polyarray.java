import java.util.*;

class Shape{
    void area(){
        System.out.println("Calculating Area..");
    }
}

class Rectangle extends Shape{
    @Override
    void area()
    {
        System.out.println("Area: length * breadth");
    }
}

class Circle extends Shape{
    @Override
    void area(){
        System.out.println("Area of circle : 3.14 * (r*r)");
    }
}
public class polyarray {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle();
        s[2] = new Circle();

        for(Shape sh : s){
            sh.area();
        }
    }
}
