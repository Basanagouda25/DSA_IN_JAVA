// Last updated: 4/11/2026, 12:45:51 PM
class Solution {
    int m = 1000000007;
    public long findPower(long a,long b){
        if(b == 0){
            return 1;
        }
        long half = findPower(a,b/2);
        long res = (half * half) % m;

        if(b % 2 == 1){
            res = (res * a) % m;
        }
        return res;
    }

    public int countGoodNumbers(long n) {
        long even = findPower(5,(n+1)/2);
        long odd = findPower(4,n/2);
        return (int) ((even * odd) % m);
    }
}