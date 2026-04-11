// Last updated: 4/11/2026, 12:45:24 PM
class Solution {
    public int countCollisions(String directions) {
        int n = directions.length();
        int col = 0;
        int i=0,j=n-1;

        while(i<n && directions.charAt(i) == 'L'){
            i++;
        }
        while(j >= 0 && directions.charAt(j) == 'R'){
            j--;
        }

        for(int k=i; k<=j; k++){
            if(directions.charAt(k) != 'S'){
                col++;
            }
        }
        return col;
    }
}