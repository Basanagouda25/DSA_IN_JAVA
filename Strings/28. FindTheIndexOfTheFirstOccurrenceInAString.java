// Last updated: 4/11/2026, 12:51:50 PM
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0; i<haystack.length();i++){
            if(haystack.contains(needle)){
                i = haystack.indexOf(needle);
                return i;
            }
        }
        return -1;
    }
}