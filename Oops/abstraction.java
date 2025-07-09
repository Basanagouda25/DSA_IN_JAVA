abstract class Car{
    abstract void drive();
    abstract void sleep();
    void music(){
        System.out.println("Play music");
    }
}

abstract class Wagon extends Car{
    void drive(){
        System.out.println("Drive mod form abstract class");
    }
}

class updatewagon extends Wagon{
    void sleep(){
        System.out.println("Sleep time");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Car c = new updatewagon();
        c.music();
        c.drive();
        c.sleep();
    }
}
