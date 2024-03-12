class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currentFuel=0;
        int totalFuel=0,totalCost=0;
        int diff=0,start=0;
        for(int i=0;i<gas.length;i++){
            totalFuel+=gas[i];
        }
        for(int j:cost){
            totalCost+=j;
        }
        if(totalFuel<totalCost) return -1;
        for(int i=0;i<gas.length;i++){
            currentFuel+=gas[i]-cost[i];
            if(currentFuel<0){
                currentFuel=0;
                start=i+1;
            }
        }
        return start;
    }
}
