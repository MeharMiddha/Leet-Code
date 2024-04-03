class Solution {
    public int solveSpaceOptimised(int[] satisfaction){
        int n = satisfaction.length;
        int[] curr = new int[n+1];
        int[] next = new int[n+1];
        for(int index=n-1;index>=0;index--){
            for(int time=index;time>=0;time--){
                int include = satisfaction[index]*(time+1)+next[time+1];
                int exclude = 0+next[time];
                curr[time]=Math.max(include,exclude);
            }
            next = curr.clone();
        }
        return next[0];
    }

    public int maxSatisfaction(int[] satisfaction) {
        // Space Optimised 
        Arrays.sort(satisfaction);
        return solveSpaceOptimised(satisfaction);
    }
}
