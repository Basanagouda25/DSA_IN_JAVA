// Last updated: 4/11/2026, 12:47:09 PM
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];

        for(int[] trip : trips){
            int passenger = trip[0];
            int start = trip[1];
            int end = trip[2];

            diff[start] += passenger;
            diff[end] -= passenger;
        }

        int curr = 0;
        for(int i = 0; i < 1001; i++){
            curr += diff[i];
            if(curr > capacity){
                return false;
            }
        }
        return true;
    }
}