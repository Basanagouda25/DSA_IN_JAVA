import java.util.*;

class vehicle{
    void move()
    {
        System.out.println("Cars move");
    }
}

class car extends vehicle{
    void fueltype()
    {
        System.out.println("with Deisel");
    }
}
public class inheri {
    public static void main(String[] args) {
        car c = new car();
        c.move();
        c.fueltype();
    }
}
