// Last updated: 4/11/2026, 12:44:31 PM
class Solution {
    public int maxOperations(String s) {
        int res = 0;
        int onecount = 0;
        boolean zeroappeared = false;
        for(char c : s.toCharArray()){
            if(c == '0'){
                zeroappeared = true;
            }else{
                if(zeroappeared){
                    res += onecount; //operation i performed between 0 and 1
                }
                onecount++;
                zeroappeared = false;
            }
        }
        if(zeroappeared){
            res +=onecount;
        }
        return res;
    }
}