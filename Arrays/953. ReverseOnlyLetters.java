// Last updated: 4/11/2026, 12:47:48 PM
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        while(i < j){
            if(!Character.isLetter(arr[i])){
                i++;
            }else if(!Character.isLetter(arr[j])){
                j--;
            }else{
                char temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}