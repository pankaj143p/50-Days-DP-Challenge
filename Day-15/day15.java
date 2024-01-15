//{ Driver Code Starts
    import java.util.*;
    import java.io.*;
    
    public class GFG {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            while(t-- > 0)
            {
                int n = scanner.nextInt();
                int total = scanner.nextInt();
                int[] cost = new int[n];
                for (int i = 0; i < n; i++) {
                    cost[i] = scanner.nextInt();
                }
                Solution solution = new Solution();
                int result = solution.max_courses(n, total, cost);
                System.out.println(result);
            }
        }
    }
    
    // } Driver Code Ends
    
    
    //User function Template for Java
    class Solution {
            // code here
        static int dp[][];
        public static int takeOrNoteTake(int i,int n,int []cost,int total){
            if(i>=n){
                return 0;
            }
            if(dp[i][total]!=-1){
                return dp[i][total];
            }
            int take=0,notTake;
            notTake=takeOrNoteTake(i+1,n,cost,total);
            
            if(total>=cost[i]){
                take = 1+takeOrNoteTake(i+1, n,cost, total-cost[i]+(int)
                (Math.floor((double)cost[i]*0.9)) );
            }
             dp[i][total]=Math.max(take,notTake);
             return dp[i][total];
        }
        public int max_courses(int n, int total, int[] cost) {
            dp=new int[n+1][total+1];
            for(int a[] : dp){
                Arrays.fill(a,-1);
            }
            return takeOrNoteTake(0,n,cost,total);
        }
    }
    
    