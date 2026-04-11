// Last updated: 4/11/2026, 12:46:09 PM
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length+1;
        int[] nums = new int[n];
        nums[0] = first;
        for(int i=0; i<encoded.length; i++){
            nums[i+1] = nums[i] ^ encoded[i];
        }
        return nums;
    }
}