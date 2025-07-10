import java.io.File;
import java.util.*;
public class check {
    public static void main(String[] args) {
        File file = new File("data.txt");
        if (file.exists()) {
            System.out.println("File present");
        }else{
            System.out.println("file doesn't exists");
        }
    }    
}
