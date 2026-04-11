// Last updated: 4/11/2026, 12:48:22 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=0; i<ans.length; i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prev = st.pop();
                ans[prev] = i - prev;
            }
            st.push(i);
        }
        return ans;
    }
}