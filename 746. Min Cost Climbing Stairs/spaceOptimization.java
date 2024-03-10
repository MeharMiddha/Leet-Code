import java.util.*;
class Solution {
    public static int solve4(int[] cost,int n){
        int prev2=cost[0];
        int prev1=cost[1];
        for(int i=2;i<n;i++){
            int current=cost[i]+Math.min(prev1,prev2);
            prev2=prev1;
            prev1=current;
        }
        return Math.min(prev1,prev2);
    }
    public int minCostClimbingStairs(int[] cost) {
        // With Space Optimisation
        int n=cost.length;
        return solve4(cost,n);
    }
}
