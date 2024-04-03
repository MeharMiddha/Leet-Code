class Solution {
    public int solve(int[] obstacles,int currLane,int currPos){
        int n=obstacles.length-1;
        if(currPos==n) return 0;
        if(obstacles[currPos+1]!=currLane){
            return solve(obstacles,currLane,currPos+1);
        }
        else{
            // sideways Jumps
            int ans = Integer.MAX_VALUE;
            for(int i=1;i<=3;i++){
                if(currLane!=i && obstacles[currPos]!=i){
                    ans = Math.min(ans,1+solve(obstacles,i,currPos));
                }
            }
            return ans;
        }
    }
    public int minSideJumps(int[] obstacles) {
        return solve(obstacles,2,0);
    }
}
