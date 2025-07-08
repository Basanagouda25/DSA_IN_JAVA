import java.util.*;
public class swaparray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
            int temp = arr[0];
            arr[0] = arr[n-1];
            arr[n-1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("After Swapping:"+arr[i]);
        }
        sc.close();
    }
}
