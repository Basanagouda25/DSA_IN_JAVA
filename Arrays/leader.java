import java.util.Scanner;
public class leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total numbers in an Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.err.println("Enter the Elements in an array:");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The leaders of an Array is:");
        findleader(arr,n);
      
    }    

        public static void findleader(int arr[], int n)
        {

            for(int i = 0; i<n; i++){
                boolean isLeader = true;
                for(int j =i+1; j<n; j++ ){
                    if(arr[i] < arr[j]){
                        isLeader = false;
                        break;
                    }
                }
                if (isLeader) {
                    System.out.println(arr[i]);   
                }
            }

        }
}

