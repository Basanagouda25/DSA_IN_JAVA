// Last updated: 4/11/2026, 12:50:28 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        long res = 0;
        int b1 = 0;
        int b2 = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        long rightmost = res & (-res);
        for (int num : nums) {
            if ((num & rightmost) !=0) {
                b1 = b1 ^ num;
            } else {
                b2 = b2 ^ num;
            }
        }
        return new int[] { b1, b2 };
    }
}