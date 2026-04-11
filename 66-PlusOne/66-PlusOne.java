// Last updated: 4/11/2026, 12:51:33 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i=n-1;
        while(i >=0){
            if(digits[i] < 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}