class Solution {
    public int tribonacci(int n) {
          int dp[]= new int[n+1];
          if(n==0 || n==1){
              return n;
          }
          if(n==2 || n==3){
              return n-1;
          }
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        dp[3]=2;
        for(int i=4;i<=n;i++){
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}