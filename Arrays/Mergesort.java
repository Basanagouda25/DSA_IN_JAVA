import java.util.*;
public class Mergesort {

    public static void mergesort(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergesort(arr,low, mid);
            mergesort(arr,mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] a,int[] b,int[] c,int m,int n )
    {
        int i=1,j=1,k=1;
        while (i <= m && j <= n) {
            if(a[i] < b[j]){
                c[k++] = a[i++];
            }else{
                c[k++] = b[j++];
            }
        }
        for(; i<=m; i++){
            c[k++] = a[i];
        }
        for(; j<=n; j++){
            c[k++] = b[j];
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
