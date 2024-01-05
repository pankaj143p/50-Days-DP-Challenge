//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.TotalWays(N);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    final static int mod=1000000007;
    public int TotalWays(int N)
    {
        // Code here
        int dp[]=new int[N+1];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<=N;i++){
            dp[i] = (dp[i-2]%mod+dp[i-1]%mod)%mod;
        }
        int temp=dp[N]%mod;
        // return (int)((long)(temp*dp[N]))%mod;
        return (int)((long)temp*dp[N]%mod);

        
    }
}