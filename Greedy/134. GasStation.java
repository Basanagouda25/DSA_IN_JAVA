// Last updated: 4/11/2026, 12:51:07 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalgas = Arrays.stream(gas).sum();
        int totalcost = Arrays.stream(cost).sum();

        if(totalgas < totalcost){
            return -1;
        }
        int total = 0;
        int result = 0;
        for(int i=0; i<n; i++){
            total += gas[i]-cost[i];
            if(total < 0){
                total = 0;
                result = i+1;
            }
        }
        return result;
    }
}