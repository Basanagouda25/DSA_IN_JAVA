import java.util.Arrays;
import java.util.Scanner;

public class larg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in an array:");
        for(int i=0; i<n; i++){
             arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int max = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > arr[i-1])
                max = arr[i];
        }
        System.out.printf("The largest of three is %d",max);
    }
}
