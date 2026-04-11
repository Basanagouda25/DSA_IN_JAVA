// Last updated: 4/11/2026, 12:46:10 PM
class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); ++i) {
            ans = Math.max(ans, n.charAt(i) - '0');
        }
        return ans;
    }
}