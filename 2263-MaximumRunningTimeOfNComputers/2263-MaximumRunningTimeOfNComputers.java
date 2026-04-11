// Last updated: 4/11/2026, 12:45:29 PM
class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long totalEnergy = 0;
        for (int battery : batteries) {
            totalEnergy += battery;
        }

        Arrays.sort(batteries);

        for (int i = batteries.length - 1; i >= 0; i--) {
            if (batteries[i] > totalEnergy / n) {
                totalEnergy -= batteries[i];
                n--;
            } else {
                break;
            }
        }

        return totalEnergy / n;
    }
}