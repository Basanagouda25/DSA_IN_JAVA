// Last updated: 4/11/2026, 12:49:53 PM
class Solution {
    public int hammingDistance(int x, int y) {
        int res = x^y;
        return Integer.bitCount(res);
    }
}