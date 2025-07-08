import java.util.Scanner;

public class maxnum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers in an Array:");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        System.out.println("Enter the Elements in an Array:");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        for(int i =0; i<n; i++){
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i] < min)
                min = arr[i];
        }
        System.out.printf("%d is the largest element in Array\n",max);
        System.out.printf("%d is the smallest element in Array\n",min);
        
    }
}
