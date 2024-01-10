class Solution {

    public static int lis(int idx,int prevIdx,int arr[],int n,int dp[][]){
          if(idx==n){
              return 0;
          }
          if(dp[idx][prevIdx+1]!=-1){
              return dp[idx][prevIdx+1];
          }
          int len=0+lis(idx+1,prevIdx,arr,n,dp);
          if(prevIdx==-1 || arr[idx] > arr[prevIdx]){
              len=Math.max(len,1+lis(idx+1,idx,arr,n,dp));
          }
          dp[idx][prevIdx+1]=len;
          return dp[idx][prevIdx+1];
    }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n][n+1];
        
        for(int arr[] : dp){
            Arrays.fill(arr,-1);
        }
        return lis(0,-1,nums,n,dp);
    }
}