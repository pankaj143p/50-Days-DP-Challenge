
import java.util.*;
class day1{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
     int lcsStr(String s1,String s2,int n,int m){
        // int n=s1.length();
        // int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        // for(int arr[] : dp){
        //     Arrays.fill(arr,-1);
        // }
        for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             if(i==0 || j==0){
                 dp[i][j]=0;
             }
         }
        }
        
        for(int i=1;i<=n;i++){
           for(int j=1;j<=m;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
         } 
        }
        return dp[n][m];
    }
	public int minOperations(String str1, String str2) 
	{ 
	    int n=str1.length();
	    int m=str2.length();
	    
	    // Your code goes here
	    int del=n-lcsStr(str1,str2,n,m);
	    int inser=m-lcsStr(str1,str2,n,m);
	    return del+inser;
	} 
}