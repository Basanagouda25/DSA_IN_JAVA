// Last updated: 4/11/2026, 12:46:42 PM
class Solution {
    public int minStartValue(int[] nums) {
        int prefix = 0;
        int minprefix = 0;

        for(int num : nums){
            prefix += num;
            minprefix = Math.min(prefix,minprefix);
        }
        return 1 - minprefix;
    }
}