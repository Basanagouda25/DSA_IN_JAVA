// Last updated: 4/11/2026, 12:50:12 PM
class Solution {
    public int lastRemaining(int n) {
        return answer(n,true);
    }

    public int answer(int n,boolean ltr){
        if(n == 1){
            return 1;
        }
        if(ltr || n % 2 != 0){
            return 2 * answer(n/2,!ltr);
        }else{
            return 2 * answer(n/2,!ltr)-1;
        }
    }
}