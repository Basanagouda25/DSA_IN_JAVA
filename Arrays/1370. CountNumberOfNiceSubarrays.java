// Last updated: 4/11/2026, 12:46:59 PM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int prev = 0, odd = 0, res = 0;
        int i = 0, j = 0;
        int n = nums.length;
        while (j < n) {
            if (nums[j] % 2 != 0) {
                odd++;
                prev = 0;
            }
            while (odd == k) {
                prev++;
                if (i < n && nums[i] % 2 == 1) {
                    odd--;
                }
                i++;
            }
            res += prev;
            j++;
        }
        return res;
    }
}