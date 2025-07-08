import java.util.*;

public class daimond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }

            for (int j = 2; j <=i; j++) {
                System.out.print("*");                
            }
            System.out.println();
        }

        //down triangle
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }

            //left side numbers
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }

            //right side numbers
            for (int j = 2; j <=i; j++) {
                System.out.print("*");                
            }
            System.out.println();
    }
    System.out.println();
}
}