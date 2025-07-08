import java.util.*;
public class countarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to count:");
        int c = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == c){
                count++;
            }
        }
        if(count > 0){
            System.out.println("The number "+c+" appeared "+count+" times");
        }else{
            System.out.println("No repetation");
        }
        sc.close();
    }
}
