import java.io.FileWriter;

public class append {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt",true);
            System.out.println("\nAppended Text");
            writer.close();
            
        } catch (Exception e) {
            System.out.println("file cannot append");
        }
    }    
}
