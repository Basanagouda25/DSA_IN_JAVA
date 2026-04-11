// Last updated: 4/11/2026, 12:45:25 PM
class Solution {
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums) {
            while (!result.isEmpty()) {
                int prev = result.get(result.size() - 1);
                int curr = num;

                int gc = gcd(prev, curr);
                if (gc == 1) {
                    break;
                }

                result.remove(result.size() - 1);
                long lcm = (long) prev * curr / gc;
                num = (int) lcm;
            }
            result.add(num);
        }
        return result;
    }
}