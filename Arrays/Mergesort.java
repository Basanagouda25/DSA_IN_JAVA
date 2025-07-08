import java.util.*;
public class Mergesort {

    public static void mergesort(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergesort(arr,low, mid); // from low to mid 
            mergesort(arr,mid+1, high); // from mid+1 to high
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high)
    {
        int n1 = mid - low + 1; //length of left sub array including mid
        int n2 = high - mid; //Length of right sub array

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = arr[low+i]; //assigning data from the arrays
        }
        for (int j = 0; j < n2; j++) {
            b[j] = arr[mid + 1 + j];
        }

        //mergeing both the arrays into a single array
        int i=0,j=0,k=low;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                arr[k++] = a[i++];
            }else{
                arr[k++] = b[j++];
            }
        }

        //to copy remaining elements
        while (i < n1) {
            arr[k++] = a[i++];
        }
        while (j < n2) {
            arr[k++] = b[j++];
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d",arr[i]);
        }
        System.out.println();
        mergesort(arr, 0, arr.length-1);
        System.out.println("After Sorting:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d",arr[i]);
        }
    }
}
