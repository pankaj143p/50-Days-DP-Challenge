

public class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
        int ch=s.charAt(i);
        if(ch!='0'){
        dp[i]=dp[i+1];
        }
        return dp[n];        
    }                                                         
    
}
