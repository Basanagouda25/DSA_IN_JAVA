// Last updated: 4/11/2026, 12:45:57 PM
class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }

    static int solve(int[] nums,int i,int xor){
        if(i == nums.length){
            return xor;
        }

        int include = solve(nums,i+1,xor ^ nums[i]);
        int exclude = solve(nums,i+1,xor);

        return include + exclude;
    }
}