import java.util.ArrayList;

public class linear {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9};
        int target = 18;
        System.out.println(search(arr, target, 0));
        searchAll(arr, target, 0);
        System.out.println(list);
    }
    static boolean search(int[] arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target) || search(arr, target, index+1);
    }

    static ArrayList<Integer> list =  new ArrayList<>();
    static void searchAll(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        searchAll(arr, target, index+1);
    }
}
