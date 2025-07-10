import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;
public class readwrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "User_input.txt";

        //Wrinting the file
        try {
            FileWriter writer = new FileWriter(filename);
            System.out.println("Enter the text to a file:");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                writer.write(line + "\n");
            }
            writer.close();
            System.out.println("Writing the text in file" + filename);
        } catch (Exception e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }

        //Reading the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("Reading the file...!");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }
        sc.close();
    }
}
