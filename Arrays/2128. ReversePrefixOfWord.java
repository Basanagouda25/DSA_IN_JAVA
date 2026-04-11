// Last updated: 4/11/2026, 12:45:42 PM
class Solution {
    public String reversePrefix(String word, char ch) {
        int left=0;
        int right = word.indexOf(ch);

        char[] arr = word.toCharArray();
        while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(arr);
        return reversed;
    }
}