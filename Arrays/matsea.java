import java.util.*;
public class matsea {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int n = sc.nextInt();
        System.out.println("Enter columns:");
        int m = sc.nextInt();
        System.out.println("Enter values:");
        int [][] arr = new int[n][m];
        int i,j;
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int count = 0;
        System.out.println("Enter value to be searched:");
        int val = sc.nextInt();
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(val == arr[i][j])
                {
                    System.out.print("The value is present");
                    count = 1;
                }
            }
        }
        if(count ==0)
        {
            System.out.println("the value is not present\n");
        }
    }
        }
        
}
