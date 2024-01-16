//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input_line[0]);
            int n = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numberSequence(m, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int dp[][];
    public static int helper(int i,int j,int n,int m){
        if(j==n){
            return 1;
        }
        if(i>m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
       
        int take=helper(i*2,j+1,n,m);
        int notTake=helper(i+1,j,n,m);
        
        return dp[i][j]=take+notTake;
    }
    static int numberSequence(int n, int m)
    {
        dp=new int[n+1][m+1];
        for(int arr[] : dp){
            Arrays.fill(arr,-1);
        }
        // code here
        return helper(1,0,m,n);
        
    }
}