//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSum(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maxSum(int n) 
    { 
        //code here.
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=Math.max(i,dp[i/2]+dp[i/3]+dp[i/4]);
        }
        return dp[n];
    } 
}




