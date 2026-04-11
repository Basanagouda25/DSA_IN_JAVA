// Last updated: 4/11/2026, 12:44:03 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0,res=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum +=nums[i];
        }
        res = sum % k;
        return res;
    }
}