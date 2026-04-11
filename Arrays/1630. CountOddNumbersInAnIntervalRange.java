// Last updated: 4/11/2026, 12:46:29 PM
class Solution {
    public int countOdds(int low, int high) {
        int num = high-low + 1;
        int count = (num)/2;
        if(num % 2 == 1 && low % 2 == 1 && high % 2 == 1){
            count++;
        }
        return count;
    }
}