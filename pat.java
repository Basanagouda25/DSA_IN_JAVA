//*
//** 
//*** 
import java.util.*;
public class pat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Upper triangle
        for (int i = 1; i <=n; i++) {
            //right triangle
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n-i);
            for (int j = 1; j <=space; j++) {
            System.out.print(" ");
            }
            //left triangle
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower triangle
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            int space = 2 * (n-i);
            for (int j = 1; j <=space; j++) {
            System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
****
****
****
  for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
 */

/*
1
12
123
for (int i = 1; i < n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        } 
*/