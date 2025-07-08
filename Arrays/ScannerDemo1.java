// Java program to read data of various types 
// using Scanner class.
import java.util.Scanner;

// Driver Class
public class ScannerDemo1 {
      // main function
    public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner scn = new Scanner(System.in);

        // String input
        String name = scn.nextLine();

        // Character input
        char gender = scn.next().charAt(0);

        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = scn.nextInt();
        long mobileNo = scn.nextLong();
        double cgpa = scn.nextDouble();

        // Print the values to check if the input was
        // correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);
    }
}
