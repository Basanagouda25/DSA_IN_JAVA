// Last updated: 4/11/2026, 12:46:01 PM
class Solution {
    public int findTheWinner(int n, int k) {
        int res=0;
        for(int i=1; i<=n; i++){
            res = (res+k) % i;
        }
        return res+1;
    }
}