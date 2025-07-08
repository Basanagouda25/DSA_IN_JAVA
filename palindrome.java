import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,rev = 0;
        int org = n;
        while(n>0){
            r = n % 10;
            rev = rev * 10 + r;
            n = n/10;
        }
        if(org == rev){
            System.out.println("given number is palindrome");
        }
        else{
            System.out.println("Given number is not palindrome");
        }
    }
}
