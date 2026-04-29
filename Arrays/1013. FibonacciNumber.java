// Recurssive Solution
class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}

// Memoization solution
class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        if(n <= 1){
            return n;
        }
        return solve(n, dp);
    }
    public int solve(int n, int[] dp){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = solve(n - 1, dp) + solve(n - 2,dp);
        return dp[n];
    }
}

// Tabulation solution 
class Solution {
    public int fib(int n) {
        int[] dp = new int[n + 1];
        if(n <= 1){
            return n;
        }
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
