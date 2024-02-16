class Solution {
    public int arrangeCoins(int n) {
        int count=1;
        int i=1;
        while(n>0){
            n=n-i;
            if(n>i){
                count++;
            }
            i++;
        }
        return count;
    }
}
