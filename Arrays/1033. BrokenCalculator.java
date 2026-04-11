// Last updated: 4/11/2026, 12:47:33 PM
class Solution {
    public int brokenCalc(int startValue, int target) {
        int ans=0;
        while(startValue < target){
            if(target % 2 == 0){
                target /= 2;
            }else{
                target++;
            }
            ans++;
        }
        return ans+startValue - target;
    }
}