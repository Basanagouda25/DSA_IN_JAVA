interface Animal{
    void sound();
}

class dog implements Animal{
    public void sound(){
        System.out.println("Dog Bark's");
    }
}

class cat implements Animal{
    public void sound(){
        System.out.println("Cat Meow");
    }
}
public class easyint {
    public static void main(String[] args) {
        Animal d = new dog();
        Animal c = new cat();
        d.sound();
        c.sound();
    }
}
