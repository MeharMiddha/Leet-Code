class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal=0;
        int bobTotal=0;
        for(int i : aliceSizes) aliceTotal+=i;
        HashSet<Integer> set=new HashSet<>();
        for(int j : bobSizes){
            bobTotal+=j;
            set.add(j);
        }
        int targetDiff = (aliceTotal-bobTotal)/2;
        for(int i : aliceSizes){
            int b=i-targetDiff;
            if(set.contains(b)){
                return new int[]{i,b};
            }
        }
        return new int[0];
    }
}
