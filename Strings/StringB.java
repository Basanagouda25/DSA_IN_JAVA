import java.util.*;
public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        //to get the character at a specific index
        System.out.println(sb.charAt(0)); // prints 'H'

        //to append a string
        sb.append(" World");  

        // to insert a string at a specific index
        sb.insert(5, " Beautiful");

        // to delete a character at a specific index
        sb.deleteCharAt(0); // removes 'H'  

        // to replace a substring
        sb.replace(6, 15, "Java");

        // to reverse the string
        sb.reverse();

        // to get the length of the StringBuilder
        System.out.println("Length: " + sb.length());

        // to convert StringBuilder to String
        String str = sb.toString();
        System.out.println("Converted String: " + str);

        // to check if the StringBuilder is empty
        System.out.println("Is StringBuilder empty? " + sb.isEmpty());

        // to clear the StringBuilder
        sb.setLength(0);

        System.out.println("After clearing, is StringBuilder empty? " + sb.isEmpty());

        // Example of using StringBuilder in a loop
        StringBuilder loopExample = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            loopExample.append("Iteration ").append(i).append(" ");
        }  

        System.out.println("Loop Example: " + loopExample);

        // Example of using StringBuilder with a Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();   
        StringBuilder userInput = new StringBuilder(input);
        System.out.println("User Input StringBuilder: " + userInput);
        sc.close();
    }
}
