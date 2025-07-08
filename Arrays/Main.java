import java.util.*;
public class Main{

    public static long fact(int n){
        long factorial = 1;
        for(int i = 1; i<=n; i++){
             factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i =0; i<=n; i++){
            sum = sum+(Math.pow(x, i))/fact(i);
        }
        System.out.println(sum);
        sc.close();
    }
}
