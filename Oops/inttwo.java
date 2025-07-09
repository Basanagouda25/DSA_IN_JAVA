// Using Two interfaces
interface flyable{
    void fly();
}

interface swimable{
    void swim();
}

class duck implements flyable,swimable{
    public void fly(){
        System.out.println("Duck Can Fly");
    }
    public void swim(){
        System.out.println("Duck can swim also");
    }
}
public class inttwo {
    public static void main(String[] args) {
        duck d = new duck();
        d.fly();
        d.swim();
    }
}
