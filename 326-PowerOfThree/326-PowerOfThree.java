// Last updated: 4/11/2026, 12:50:20 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
            return true;
        }
        if(n <= 0 || n % 3 != 0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}