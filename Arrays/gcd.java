import java.util.*;
public class gcd {
    static int  hcf(int a,int b){
        int gcd = 1;
        for(int i=1; i<=a; i++){
            if(a%i == 0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = hcf(a, b);
        System.out.print(result);
    }
}
