// Last updated: 4/11/2026, 12:51:05 PM
class Solution {
    public int singleNumber(int[] nums) {
        int k=0;
        for(int num : nums){
            k = k ^ num;
        }
        return k;
    }
}