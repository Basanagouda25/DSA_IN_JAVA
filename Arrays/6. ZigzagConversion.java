// Last updated: 4/11/2026, 12:52:18 PM
class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] str = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            str[i] = new StringBuilder();
        }
        int i=0;
        while(i<s.length())
        {
            for(int index=0; index<numRows && i<s.length(); index++){
                str[index].append(s.charAt(i++));
            }
            for(int index = numRows-2; index>0 && i<s.length(); index--){
                str[index].append(s.charAt(i++));
            }
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder ans:str){
            res.append(ans);
        }
        return res.toString();
    }
}