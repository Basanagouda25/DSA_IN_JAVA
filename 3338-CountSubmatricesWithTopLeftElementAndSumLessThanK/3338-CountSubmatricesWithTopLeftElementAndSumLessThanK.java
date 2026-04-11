// Last updated: 4/11/2026, 12:44:45 PM
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] sum = new int[n + 1][m + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum[i+1][j+1] = grid[i][j] + sum[i][j+1] + sum[i+1][j] - sum[i][j];
                if(sum[i+1][j+1] <= k){
                    count++;
                }
            }
        }
        return count;
    }
}