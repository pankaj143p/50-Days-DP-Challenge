

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
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    int dp[]=new int[V+1];
	    Arrays.fill(dp,99999);
	    dp[0]=0;
	    for(int i=0;i<M;i++){
	        for(int j=coins[i];j<=V;j++){
	            dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
	        }
	    }
	    return dp[V]==99999 ? -1 : dp[V];
	    
	} 
}