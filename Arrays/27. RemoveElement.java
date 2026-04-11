// Last updated: 4/11/2026, 12:51:51 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k=0;
        for(int i = 0; i<n; i++){
            if(val == nums[i]){
                continue;
            }else{
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}