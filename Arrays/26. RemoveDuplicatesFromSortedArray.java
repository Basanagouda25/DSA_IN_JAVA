// Last updated: 4/11/2026, 12:51:53 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(i<nums.length-1 && nums[i] == nums[i+1]){
                continue;
            }else{
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}