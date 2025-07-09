
class shape{
    public void area()
    {
        System.out.println("Calculating Area");
    }
}

class circle extends shape{
    @Override 
    public void area() {
        super.area();  // when u override a function u need to call super key becuase it should inherit the parent class.
        System.out.println("Area of circle");
    }
}
public class inheriover {
    public static void main(String[] args) {
        circle cl = new circle();
        cl.area();
    }
}
