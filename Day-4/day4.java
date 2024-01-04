class Solution {
    public boolean divisorGame(int n) {
        // simple solution 
        // return n%2==0;

        //using dp 
        boolean dp[]=new boolean[Math.max((n+1),3)];
        dp[0]=false;
        dp[1]=false;
        dp[2]=true;
        for(int i=3;i<=n;i++){
            dp[i]=!dp[i-1];
        }
        return dp[n];
    }
}