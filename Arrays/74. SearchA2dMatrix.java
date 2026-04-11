// Last updated: 4/11/2026, 12:51:28 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(target == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}