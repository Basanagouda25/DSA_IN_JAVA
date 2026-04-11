// Last updated: 4/11/2026, 12:50:25 PM
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return n;
    }
}