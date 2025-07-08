import java.util.Arrays;
// import java.util.Collections;
import java.util.Scanner; 

public class seclar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total numbers in an Array:");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        System.out.println("Enter the Elements in an Array:");
        for(int i =0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        //it will sort arrays in decending order
        Arrays.sort(arr);
        int min2 = arr[0];
        for(int i =0; i<n; i++){
            if(i==1 ){
               min2 = arr[i];
                
            }
        }
        int max2 = arr[n-1];
        for(int i =0; i<n; i++){
            if(i==n-2 ){
                 max2 = arr[i];
                
            }
        }
                
            
        
        System.out.printf("%d is  second largest element\n",max2);
        System.out.printf("%d is  second smallest element\n",min2);
    }
}

