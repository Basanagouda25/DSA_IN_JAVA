import java.util.Scanner;

public class Lsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers in an Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Elements in an Array:");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the Value to be Searched in an Array:");
        int val = sc.nextInt();
        
        for(int i =0; i<n; i++){
            if(val == arr[i]){
                System.out.printf("%d is  Found in Array at the position %d\n",val,i+1);
                break;
            }
        }
        
    }
    
}
