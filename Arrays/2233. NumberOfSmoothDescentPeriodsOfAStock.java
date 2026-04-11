// Last updated: 4/11/2026, 12:45:34 PM
class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = 1;
        long count = 1;
        for(int i=1; i<prices.length; i++){
            if(prices[i] == prices[i-1]-1){
                count++;
            }else{
                count = 1;
            }
            ans += count;
        }
        return ans;
    }
}