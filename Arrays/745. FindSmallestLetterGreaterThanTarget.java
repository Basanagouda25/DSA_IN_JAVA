// Last updated: 4/11/2026, 12:48:21 PM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0;
        int r = letters.length-1;
        int position = -1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(letters[mid] > target){
                position = mid;
                r = mid-1;
            }else{
                l = mid + 1;
            }
        }
        if(position == -1){
            return letters[0];
        }
        return letters[position];
    }
}