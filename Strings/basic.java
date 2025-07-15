import java.util.*;
public class basic {
    public static void main(String[] args) {
        //remember scanner is also a non-primitive data type in java
        Scanner sc = new Scanner(System.in);
        String Full_name = sc.nextLine(); // printd full word
        String Last_name = sc.next(); //prints only one word

        String concatinate = Full_name + Last_name;
        System.out.println(concatinate.length());
        
        //CharAt
        for (int i = 0; i < concatinate.length(); i++) {
            System.out.println(concatinate.charAt(i));
        }

        //compareto keywords

        String name1 = "Manu";
        String name2 = "Manu";

        // s1 == s2 => 0
        // s1 > s2 => +ve 
        // s1 < s2 => -ve

        if (name1.compareTo(name2) == 0) {
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }

        // The comparism of the characters will alphabet wise like the value of B is greater than value of A
        // Strings can be initialized as new String("String name")

        //For substrings
        String sentence = "This is Strings in Java";
        String substr = sentence.substring(8, sentence.length());
        System.out.println(substr);
    }

}
