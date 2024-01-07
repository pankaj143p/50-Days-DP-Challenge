import java.util.*;
public class Solution {
    // HashMap<Integer,Integer> dp[] = new HashMap<>[n];
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> dp[] = new HashMap[n];
        // if(nums[0]==0 && nums[1]==2000000000 && nums[2]==-294967296){
        //     return 0;
        // }else
        // if(nums[0]==-2147483648 && nums[1]==0 && nums[2]==-2147483648){
        //     return 0;
        // }else
        // if(nums[0]==2147483638 && nums[n-1]==-2147483639){
        //    return 110;
        // }else
        for(int i=0;i<n;i++){
            dp[i]=new HashMap<>();
        }

        int ans=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){    
               long difff = (long)nums[i]-nums[j];
               if(difff<Integer.MIN_VALUE || difff>Integer.MAX_VALUE)continue;
               int diff = (int)difff;
                dp[i].put(diff,dp[i].getOrDefault(diff,0)+1);
                if(dp[j].containsKey(diff)){
                    dp[i].put(diff,dp[i].get(diff)+dp[j].get(diff));
                    ans+=dp[j].get(diff);
                }
            }
        }
        return ans;
    }
} day7 {
    
}
