// Last updated: 4/11/2026, 12:48:10 PM
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l=0;
        int r = n-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid-1;
            }
        }
        return -1;
    }
}