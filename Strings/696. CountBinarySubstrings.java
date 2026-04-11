// Last updated: 4/11/2026, 12:48:26 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int prev = 0;
        int curr = 1;
        int res = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
                curr++;
            }else{
                res += Math.min(curr,prev);
                prev = curr;
                curr = 1;
            }
        }
        return res + Math.min(curr,prev);
    }
}