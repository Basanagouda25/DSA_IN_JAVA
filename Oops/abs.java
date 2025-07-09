import java.util.*;

interface Animal{
    public void makesound();
}

class Dog implements Animal{
    public void makesound(){
        System.out.println("Dog Barks");
    }
}

public class abs {
    public static void main(String[] args) {
        Animal an = new Dog();
        an.makesound();
    }
}
