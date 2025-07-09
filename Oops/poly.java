// overrifing=

class Animal{
    void makesound(){
        System.out.println("Animal make sound");
    }
}

class dog extends Animal{
    @Override
    void makesound()
    {
        System.out.println("Dogs Bark");
    }
}
public class poly {
    public static void main(String[] args) {
        Animal a = new dog(); // referencing child to parent class
        a.makesound();
    }
}
