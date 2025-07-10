import java.io.BufferedReader;
import java.io.FileReader;

public class read {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("reading line");
                reader.close();
            }
        } catch (Exception e) {
            System.out.println("Error while reading file");
            e.getStackTrace();
        }
    }
}
