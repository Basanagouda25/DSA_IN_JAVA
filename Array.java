public class Array {
    public static void main(String[] args) {
        int[]arr ={10,20,30,40,50};
        int n = arr.length;

        for(int i =0; i<n; i++){
            System.out.println(arr[i] );
        }
        int[] ar;

        // allocating memory for 5 integers.
        ar = new int[5];

        // initialize the elements of the array
        // first to last(fifth) element
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 30;
        ar[3] = 40;
        ar[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < ar.length; i++)
            System.out.println("Element at index "+ i + " : " + ar[i]);
    }
}
