// Last updated: 4/11/2026, 12:46:52 PM
class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int count=0;
        for(int i=0; i<=str.length()-k; i++){
            String sub = str.substring(i,k+i);
            int n = Integer.parseInt(sub);
            if(n != 0 && num%n == 0){
                count++;
            }
        }
        return count;
    }
}