// Last updated: 4/11/2026, 12:44:34 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        //int min = INTEGER.Max_Value;
        int count = 0;
        int threedivid = 0;
        for(int i=0; i<n; i++){
            count++;
            if(nums[i] % 3 == 0){
                threedivid++;
            }
        }
        return (count - threedivid);
    }
}