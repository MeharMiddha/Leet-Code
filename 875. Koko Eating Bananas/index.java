class Solution {

    public int findSpeed(int[] piles,int hours){
        int totalHours=0;
        for(int i=0;i<piles.length;i++){
            totalHours += Math.ceil((double) piles[i] / hours);
        }
        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n=piles.length;
        int maxSpeed = piles[n-1];
        int low=1;
        int high=maxSpeed;
        while(low<=high){
            int mid=(low+high)/2;
            int hours = findSpeed(piles,mid);
            if(hours<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
