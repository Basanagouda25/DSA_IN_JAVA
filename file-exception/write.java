import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.util.*;
public class write {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Hello,This is new concept \nname file handling");
            writer.close();
            System.out.println("File written sucessfully"); // shows program running sucessfully in terminal
        }catch(IOException e){
            System.out.println("Error in writing file");
            e.printStackTrace(); // Throws where execption occured.
        }
    }
}
