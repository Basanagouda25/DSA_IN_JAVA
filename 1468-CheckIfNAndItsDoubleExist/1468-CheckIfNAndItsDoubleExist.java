// Last updated: 4/11/2026, 12:46:45 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(set.contains(arr[i] * 2)){
                return true;
            }else if(arr[i]%2 == 0 && set.contains(arr[i]/2)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}