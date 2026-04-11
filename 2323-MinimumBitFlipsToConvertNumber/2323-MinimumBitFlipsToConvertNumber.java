// Last updated: 4/11/2026, 12:45:23 PM
class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}