// Last updated: 4/11/2026, 12:46:14 PM
class Solution {
    public int minimumDeletions(String s) {
        int n = s.length(), res = n;
        int a = 0, b = 0;

        for (int i = 0; i < n; i++)
            a += s.charAt(i) & 1;

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i);
            a -= c & 1;
            res = Math.min(res, a + b);
            b += (c & 1) ^ 1;
        }

        return res;
    }
}
