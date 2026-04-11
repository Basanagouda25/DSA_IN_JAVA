// Last updated: 4/11/2026, 12:48:46 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int first = nums[0] * nums[1] * nums[n-1];
        int second = nums[n-3] * nums[n-2] * nums[n-1];
        if(first > second){
            return first;
        }
        return second;
    }
}