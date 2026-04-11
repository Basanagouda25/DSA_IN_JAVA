// Last updated: 4/11/2026, 12:50:52 PM
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}