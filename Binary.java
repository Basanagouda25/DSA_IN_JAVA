import java.util.*;
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l=arr[0],mid,h=arr[n-1];
        System.out.println("Enter value:");
        int value = sc.nextInt();
        while (l<=h) {
            mid = (l+h)/2;
            if(arr[mid] > l){
                l = mid+1;
            }else if(arr[mid] < h) {
                h = mid - 1;
            }else{
                System.out.println("Value Found:"+value);
            }
        }

    }
}
