// Last updated: 4/11/2026, 12:45:49 PM
class Solution {
    public int countPalindromicSubsequence(String s) {
        int res = 0;
        HashSet<Character> unique = new HashSet<>();

        for(char c : s.toCharArray()){
            unique.add(c);
        }
        for(char c : unique){
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);

            if(start < end){
                HashSet<Character> charset = new HashSet<>();
                for(int i = start+1; i < end; i++){
                    charset.add(s.charAt(i));
                }
                res += charset.size();
            }
        }
        return res;
    }
}