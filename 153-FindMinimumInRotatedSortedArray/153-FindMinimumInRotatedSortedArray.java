// Last updated: 4/11/2026, 12:50:57 PM
class Solution {
    public int findMin(int[] nums) {
        int l=0,h=nums.length-1;
        int sol = Integer.MAX_VALUE;
        while(l <= h){
            int mid = (l+h)/2;
            if(nums[l] <= nums[mid]){
                sol = Math.min(sol,nums[l]);
                l = mid+1;
            }else{
                sol = Math.min(sol,nums[mid]);
                h = mid-1;
            }
        }
        return sol;
    }
}