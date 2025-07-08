import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array:");
        int n = sc.nextInt();

        System.out.println("Enter the elements in an Array:");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array Before Reversing:");
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        
        System.out.println("After reversing:");
        for(int i=n-1; i>=0; i--)
        {
            
             System.out.println(arr[i]);
        }
    }
}
