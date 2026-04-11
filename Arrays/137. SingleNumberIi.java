// Last updated: 4/11/2026, 12:51:04 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0; i<32; i++){
            int sum = 0;
            int bm = 1<<i;
            for(int j=0; j<nums.length; j++){
                if((nums[j] & bm) !=0){
                    sum++;
                } 
            }
            if(sum%3 !=0){
                res = res | bm;
            }
        }
        return res;
    }
}