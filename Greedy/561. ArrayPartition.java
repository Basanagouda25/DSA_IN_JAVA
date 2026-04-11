// Last updated: 4/11/2026, 12:48:49 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0; i<nums.length; i=i+2){
            sum += nums[i];
        }
        return sum;
    }
}