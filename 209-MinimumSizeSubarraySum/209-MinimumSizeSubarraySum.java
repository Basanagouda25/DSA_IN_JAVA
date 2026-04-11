// Last updated: 4/11/2026, 12:50:42 PM
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        while(r < nums.length){
            sum = sum+nums[r];
            while(sum >= target){
                minlen = Math.min(minlen,r-l+1);
                sum = sum-nums[l];
                l++;
            }
            r++;
        }
        if(minlen == Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
    }
}