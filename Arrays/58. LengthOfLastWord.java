// Last updated: 4/11/2026, 12:51:36 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}