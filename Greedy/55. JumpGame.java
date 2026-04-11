// Last updated: 4/11/2026, 12:51:37 PM
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxindex = 0;
        for(int i=0; i<n; i++){
            if(i > maxindex){
                return false;
            }else{
                maxindex = Math.max(maxindex,i+nums[i]);
            }
        }
        return true;
    }
}