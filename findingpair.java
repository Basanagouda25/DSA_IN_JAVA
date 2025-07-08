import java.util.*;


public class findingpair {
    public static boolean pair(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int sum = arr[start]+arr[end];
            if(sum == target){
                System.out.printf("The pair of %d and %d is target",arr[start],arr[end]);
                return true;
            }else if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        System.out.println("No pair exists");
        return false;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target:");
        int target = sc.nextInt();
        pair(arr, target);
     sc.close();   
    }
}
