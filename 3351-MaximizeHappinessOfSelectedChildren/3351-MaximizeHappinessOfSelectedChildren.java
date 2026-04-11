// Last updated: 4/11/2026, 12:44:43 PM
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int count = 0;
        long res = 0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            if(happiness[i] + count > 0){
                res+=(long)(happiness[i] + count);
            }
            count--;
        }

        return res;
    }
}