// Last updated: 4/11/2026, 12:50:37 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        else if((n&(n-1)) == 0){
            return true;
        }
        return false;
    }
}