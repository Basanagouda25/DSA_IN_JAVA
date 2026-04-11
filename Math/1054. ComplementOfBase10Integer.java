// Last updated: 4/11/2026, 12:47:28 PM
class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0){
            return 1;
        }
        String res = "";
        while(n > 0){
            res = (n % 2) + res;
            n /= 2;
        }

        StringBuilder comp = new StringBuilder();
        for(int i=0; i<res.length(); i++){
            if(res.charAt(i) == '0'){
                comp.append('1');
            }else{
                comp.append('0');
            }
        }

        String compstr = comp.toString();
        int sum = 0;
        int power = 1;
        int len = compstr.length();
        for(int i=len-1; i>=0; i--){
            if(compstr.charAt(i) == '1'){
                sum += power;
            }
            power *= 2;
        }
        return sum;
    }
}