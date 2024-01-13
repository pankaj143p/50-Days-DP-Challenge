class Solution {
    static int dp[][][];
    static int mod = 1000000007;
    public static int helper(int [][]g,int r,int c,int lor,int loc,int sum,int k){
        if(r<0 || c<0 || r==lor || c==loc){
            return 0;
        }
        sum+=g[r][c];
    if(r==lor-1 && c==loc-1){
        return sum%k==0 ? 1 : 0;
    }
    if(dp[r][c][sum%k]!=-1){
        return dp[r][c][sum%k];
    }
    dp[r][c][sum%k]=(helper(g,r+1,c,lor,loc,sum,k)%mod+helper(g,r,c+1,lor,loc,sum,k)%mod)%mod;
    return dp[r][c][sum%k];
    
    }
    public int numberOfPaths(int[][] grid, int k) {
        dp=new int[grid.length][grid[0].length][50];
        for(int ia[][] : dp){
            for(int a[] : ia){
                Arrays.fill(a,-1);
            }
        }
        return helper(grid,0,0,grid.length,grid[0].length,0,k);
    }
}