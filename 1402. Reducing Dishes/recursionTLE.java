class Solution {
    public int solve(int[] satisfaction,int index,int time){
        if(index==satisfaction.length) return 0;
        int include = satisfaction[index]*(time+1)+solve(satisfaction,index+1,time+1);
        int exclude = 0+solve(satisfaction,index+1,time);
        return Math.max(include,exclude);
    }
    public int maxSatisfaction(int[] satisfaction) {
        return solve(satisfaction,0,0);
    }
}
