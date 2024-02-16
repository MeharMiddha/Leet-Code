class Solution {
    public boolean isPerfectSquare(int num) {
        int sqr = (int)Math.sqrt(num);
        if((sqr*sqr)==num){
            return true;
        }
        return false;
    }
}
