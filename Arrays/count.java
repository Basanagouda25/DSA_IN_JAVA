import java.util.*;
public class count {
     static void cont(int n){
        int sum = 0;
        while(n>0){
            sum = sum+1;
            n = n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println("After counting:");
        cont(n);
    }
}
